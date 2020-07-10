package AKKA_with_Remote.src.main.scala.server_client.remote

import AKKA_with_Remote.src.main.scala.server_client._

import akka.actor.{ActorSystem, Props}

object RemoteAKKAMain extends App {

  println("Call remote AKKA actor!")

  val remoteSystem = ActorSystem("RemoteActor")
  val remote = remoteSystem.actorOf(Props[RemoteActor], "Remote-Actor")
  remote ! IAmALive

}
