import sbt._

/**
 * FIXME this does't seem to work... I used the 'libraryDependencies' in build.sbt instead
 */
class SampleProject(info: ProjectInfo) extends DefaultProject(info) {
  val jackson = "org.codehaus.jackson" % "jackson-core-asl" % "1.6.1"
  val specs = "org.scala-tools.testing" % "specs_2.9.1" % "1.6.9" % "test"
}