package AKKA_with_Remote.src.main.scala.deployment

import akka.actor.{ActorSystem, Props}
import com.typesafe.config.ConfigFactory

object RemoteMain extends App {

  val system = ActorSystem("DeploymentRemote", ConfigFactory.load("src/main/scala/AKKA_with_Remote/src/main/resources/application-master.conf"))
  val master = system.actorOf(Props[MasterActor], "Master-Actor")
  master ! Start

}
