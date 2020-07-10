# AKKA_Remote

### Description
Note some knowledge about AKKA-remote part and provided some sample code. <br>
<br>

### Motivation
A decentralized system including multiple nodes, it's impossible that the system only has one node to work and work finely. It's must be necessary to understand and implement about how to control and manage other nodes throught remoting. <br>
<br>

### Skills

#### Environment
OS: MacOS (Current Version: 10.14.5)

Language: Scala <br>
Version: 2.12 <br>
Framework: AKKA (version: 2.4.20) <br>
<br>

The project has 2 parts by the different way how to deploy system topology. They are "Server-Client" mode and "Deployment" mode.

### Server-Client Mode

#### Description 


#### Running Result

For local-actor site, the log message is:

[info] running AKKA_with_Remote.src.main.scala.LocalActorMain <br>
Call local AKKA actor! <br>
[INFO] [07/10/2020 13:33:19.493] [run-main-6] [akka.remote.Remoting] Starting remoting <br>
[INFO] [07/10/2020 13:33:19.610] [run-main-6] [akka.remote.Remoting] Remoting started; listening on addresses :[akka.tcp://LocalActor@127.0.0.1:57231] <br>
[INFO] [07/10/2020 13:33:19.611] [run-main-6] [akka.remote.Remoting] Remoting now listens on addresses: [akka.tcp://LocalActor@127.0.0.1:57231] <br>
[Observe] path: akka.tcp://RemoteActor@127.0.0.1:2552/user/Remote-Actor <br>
[INFO] [07/10/2020 13:33:19.702] [LocalActor-akka.actor.default-dispatcher-15] [akka.tcp://LocalActor@127.0.0.1:57231/user/Local-Actor] I'm alvie here! <br>
[INFO] [07/10/2020 13:33:19.702] [LocalActor-akka.actor.default-dispatcher-15] [akka.tcp://LocalActor@127.0.0.1:57231/user/Local-Actor] Get your response! <br>
[WARN] [SECURITY][07/10/2020 13:33:19.777] [LocalActor-akka.remote.default-remote-dispatcher-6] [akka.serialization.Serialization(akka://LocalActor)] Using the default Java serializer for class [AKKA_with_Remote.src.main.scala.ResponseRemoteActor] which is not recommended because of performance implications. Use another serializer or disable this warning using the setting 'akka.actor.warn-about-java-serializer-usage' <br>
[INFO] [07/10/2020 13:33:19.798] [LocalActor-akka.actor.default-dispatcher-15] [akka.tcp://LocalActor@127.0.0.1:57231/user/Local-Actor] I'm Remote-Actor. Nice to meet you! <br>


For remote-actor site, the log message is: <br>

[info] running AKKA_with_Remote.src.main.scala.RemoteAKKAMain <br>
Call remote AKKA actor! <br>
[INFO] [07/10/2020 13:33:16.583] [run-main-1] [akka.remote.Remoting] Starting remoting <br>
[INFO] [07/10/2020 13:33:16.751] [run-main-1] [akka.remote.Remoting] Remoting started; listening on addresses :[akka.tcp://RemoteActor@127.0.0.1:57226] <br>
[INFO] [07/10/2020 13:33:16.752] [run-main-1] [akka.remote.Remoting] Remoting now listens on addresses: [akka.tcp://RemoteActor@127.0.0.1:57226] <br>
[INFO] [07/10/2020 13:33:16.858] [RemoteActor-akka.actor.default-dispatcher-4] [akka.tcp://RemoteActor@127.0.0.1:57226/user/Remote-Actor] I'm alvie here! <br>
[INFO] [07/10/2020 13:33:19.792] [RemoteActor-akka.actor.default-dispatcher-17] [akka.tcp://RemoteActor@127.0.0.1:2552/user/Remote-Actor] I receive your message! <br>



### Deployment Mode

#### Description 


#### Running Result

