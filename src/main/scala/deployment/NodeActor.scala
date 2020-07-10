package AKKA_with_Remote.src.main.scala.deployment

import akka.actor.{Actor, ActorLogging}


class NodeActor extends Actor with ActorLogging {

  override def receive: Receive = {

    case HelloWorker =>
      log.info("Hello, my dear boss.")

    case PleaseDoWork =>
      log.info("Okay, I got it.")
      log.info("Sleep and play switch game.")
      log.info("I finish my job!")
      context.parent ! OkayBoss

  }

}
