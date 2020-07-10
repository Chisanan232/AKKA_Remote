package AKKA_with_Remote.src.main.scala.server_client.remote

import AKKA_with_Remote.src.main.scala.server_client._

import akka.actor.{Actor, Props, ActorLogging}


class RemoteActor extends Actor with ActorLogging {

  override def receive: Receive = {

    case IAmALive =>
      log.info("I'm alvie here!")


    case ResponseRemoteActor(content) =>
      log.info("I receive your message!")
      sender() ! "I'm Remote-Actor. Nice to meet you!"

  }

}
