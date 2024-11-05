lazy val root = (project in file(".")).
  settings(
    organization := "one.talon",
    name := "talon-one-client",
    version := "4.4.1",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    javacOptions in compile ++= Seq("-Xlint:deprecation"),
    publishArtifact in (Compile, packageDoc) := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      "io.swagger" % "swagger-annotations" % "1.5.24",
      "com.squareup.okhttp3" % "okhttp" % "3.14.9",
      "com.squareup.okhttp3" % "logging-interceptor" % "3.14.9",
      "com.google.code.gson" % "gson" % "2.8.6",
      "org.apache.commons" % "commons-lang3" % "3.10",
      "org.threeten" % "threetenbp" % "1.4.3" % "compile",
      "io.gsonfire" % "gson-fire" % "1.8.3" % "compile",
      "javax.annotation" % "javax.annotation-api" % "1.3.2" % "compile",
      "com.google.code.findbugs" % "jsr305" % "3.0.2" % "compile",
      "junit" % "junit" % "4.13" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
