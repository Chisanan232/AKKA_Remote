name := "AKKA_with_Remote"

version := "1.0"

scalaVersion := "2.12.11"

libraryDependencies ++= {

  val AkkaVersion = "2.5.31"

  Seq(
    // Akka
    "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
    "com.typesafe.akka" %% "akka-remote" % AkkaVersion,
    "com.typesafe.akka" %% "akka-stream" % AkkaVersion,
//    // Other packages
    "log4j" % "log4j" % "1.2.16"
  )

}

resolvers ++= Seq(
  "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/",
  "Spark Packages Repo" at "https://dl.bintray.com/spark-packages/maven"
)
