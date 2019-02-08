libraryDependencies += "org.xerial" % "sqlite-jdbc" % "3.7.2"

libraryDependencies += "joda-time" % "joda-time" % "2.3"

libraryDependencies += "org.joda" % "joda-convert" % "1.6"

libraryDependencies += "commons-io" % "commons-io" % "2.4"

libraryDependencies += "nu.validator.htmlparser" % "htmlparser" % "1.4"

libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.41.0"

libraryDependencies += "commons-lang" % "commons-lang" % "2.6"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml"          % "1.1.1",
  "org.scalikejdbc"        %% "scalikejdbc"        % "3.3.+",
  "ch.qos.logback"         %  "logback-classic"    % "1.2.+"
)
