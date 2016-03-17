name := "demo-kantancsv-scala"

scalaVersion := "2.11.8"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "com.nrinaudo" %% "kantan.csv-generic" % "0.1.8",
  "org.scalatest" %% "scalatest" % "2.2.6" % Test,
  "com.storm-enroute" %% "scalameter" % "0.7" % Test
)

parallelExecution in Test := false

logBuffered := false

coverageExcludedPackages := """.*\.common\.Main"""
