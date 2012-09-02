name := "com.twitter.sample"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.9.2"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

EclipseKeys.eclipseOutput := Some(".target")

EclipseKeys.executionEnvironment := Some(EclipseExecutionEnvironment.JavaSE17)

libraryDependencies ++= Seq(
	"org.codehaus.jackson" % "jackson-core-asl" % "1.6.1",
	"org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
)