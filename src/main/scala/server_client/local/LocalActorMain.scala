package AKKA_with_Remote.src.main.scala.server_client.local

import AKKA_with_Remote.src.main.scala.server_client._

import akka.actor.{ActorSystem, Props}


object LocalActorMain extends App {

  println("Call local AKKA actor!")

  val system = ActorSystem("LocalActor")
  val local = system.actorOf(Props[LocalActor], "Local-Actor")
  local ! IAmALive
  local ! CallRemoteActor("I'm your boss.")

}
