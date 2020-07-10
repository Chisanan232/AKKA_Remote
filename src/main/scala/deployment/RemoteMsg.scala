package AKKA_with_Remote.src.main.scala.deployment

trait RemoteMsg {
  val content: String
}

case class Start(content: String) extends RemoteMsg
case class HelloWorker(content: String) extends RemoteMsg
case class OkayBoss(content: String) extends RemoteMsg
case class PleaseDoWork(content: String) extends RemoteMsg
