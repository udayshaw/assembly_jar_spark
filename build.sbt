name := "encryption"
version := "1.0"

mainClass in (assembly) := Some("encryption")
scalaVersion := "2.11.12"
assemblyJarName in assembly := "encryption.jar"
// https://mvnrepository.com/artifact/commons-codec/commons-codec
libraryDependencies += "commons-codec" % "commons-codec" % "1.15"

