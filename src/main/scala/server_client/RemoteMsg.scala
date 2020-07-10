package AKKA_with_Remote.src.main.scala.server_client

import akka.serialization.Serialization


trait RemoteMsg {
  val content: String
}

case class IAmALive(content: String) extends RemoteMsg with Serializable
case class CallRemoteActor(content: String) extends RemoteMsg with Serializable
case class ResponseRemoteActor(content: String) extends RemoteMsg with Serializable
