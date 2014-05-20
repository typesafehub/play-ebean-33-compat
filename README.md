Play ebean 3.3.x compatibility library
======================================

ebean 3.3.x removed a class, `org.avaje.ebean.Query$UseIndex`, that, although not necessary for the functioning of the play-ebean plugin, the play-ebean `Model` class provided a delegate method to that used this class in its public API, causing binary compatibility issues when upgrading to ebean 3.3.x.

Fixing this issue in the Play 2.2.x branch would break Play's binary compatibility requirements.  Hence this library has been provided to work around the issue by providing a skeleton for that class.  It is designed to work with Play 2.2.x.

To use this library, add the following dependencies to your build file:

```scala
libraryDependencies ++= Seq(
  "org.avaje.ebeanorm" % "avaje-ebeanorm" % "3.3.3",
  "com.typesafe.play" % "play-ebean-33-compat" % "1.0.0"
)
```
