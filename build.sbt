name := "scalafly"

version := "0.1"

scalaVersion := "2.10.0" // To match version used by scala-ide

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
net.virtualvoid.sbt.graph.Plugin.graphSettings
 
libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.1.0" withSources()

libraryDependencies += "com.typesafe.akka" % "akka-slf4j_2.10" % "2.1.0" withSources()

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.9" withSources()

// libraryDependencies += "org.fusesource.jansi" % "jansi" % "1.5" // No longer needed?

// libraryDependencies += "org.rxtx" % "rxtx" % "2.2pre1"

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.10.0" withSources()

libraryDependencies += "org.scala-lang" % "jline" % "2.10.0" withSources()

libraryDependencies += "net.java.dev.jna" % "jna" % "3.5.1" // For libFtdi

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource // Include resources dir in eclipse classpath

EclipseKeys.withSource := true // Try to include source for libs
