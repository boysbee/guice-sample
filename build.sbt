name:="guice-sample"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
    "com.google.inject" % "guice" % "3.0",
    "com.novocode" % "junit-interface" % "0.10" % "test",
    "org.scalatest" % "scalatest_2.10" % "2.0" % "test->*"
)

