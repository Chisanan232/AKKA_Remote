package AKKA_with_Remote.src.main.scala.deployment

import akka.actor.{Actor, ActorLogging, ActorSelection, Props}


class MasterActor extends Actor with ActorLogging {

  private def deployActors(): ActorSelection = {
    val nodeRef = context.actorOf(Props[NodeActor], "Node-Actor")
    context.actorSelection(nodeRef.path)
  }

  val actor = deployActors()

  override def receive: Receive = {

    case Start =>
      log.info("Wake up, employee")
      this.actor ! HelloWorker
      this.actor ! PleaseDoWork

  }

}
