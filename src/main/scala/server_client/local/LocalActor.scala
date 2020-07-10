package AKKA_with_Remote.src.main.scala.server_client.local

import AKKA_with_Remote.src.main.scala.server_client._

import com.typesafe.config.ConfigFactory
import common.message

import scala.concurrent.duration._
import scala.concurrent.Await

import akka.actor.{Actor, ActorLogging, Props}
import akka.util.Timeout
import akka.pattern.ask


class LocalActor extends Actor with ActorLogging {

  // create remote actor
  val path = "akka.tcp://RemoteActor@127.0.0.1:2552/user/Remote-Actor"
//  val path = "akka.tcp://RemoteActor@172.20.10.2:2552/user/Remote-Actor"
  val remoteActor = context.actorSelection(path)

  println(s"[Observe] path: $path")

  override def receive: Receive = {

    case IAmALive =>
      log.info("I'm alvie here!")

    case CallRemoteActor(content) =>
      log.info("Get your response! ")

      // Send msg to remote actor and wait for it response.
      implicit val timeout = Timeout(5.seconds)
      val resp = this.remoteActor ? ResponseRemoteActor("Hi, I'm actor B!")
      val result = Await.result(resp, timeout.duration)
      log.info(result.toString)

  }

}
