package AKKA_with_Remote.src.main.scala.server_client


object AKKAConfig {

  val AKKASystemName = "RemoteTest"

  val LocalActorName = "Local-Actor"
  val RemoteActorName = "Remote-Actor"

}


object RemoteConfig {

  var Nodes: Map[String, String] = Map("Host" -> "127.0.0.1", "Port" -> "2552")
  val Host = "127.0.0.1"
  val Port = 2552

}
