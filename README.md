# Play with Apache Spark

This is a simple example that combines Scala Play with Apache Spark.

Project's main purpose is to have a basic understanding on how to call
Spark from Play. The class controllers.HomeController has two examples
on how to call a function from spark.SparkTest that calls Apache Spark.

The example creates an sequence of numbers as a DataSet and counts how many
numbers are in it. This result is later send a view in Play and gets displayed
by the browser.

## Run

To run the example, execute:
```bash
sbt run
```


## Based on
https://github.com/playframework/play-scala-rest-api-example/tree/2.6.x


## References 

https://github.com/playframework/play-scala-rest-api-example/tree/2.6.x
https://github.com/knoldus/Play-Spark-Scala
https://github.com/anubhav100/play-spark
https://blog.knoldus.com/2017/06/12/play-spark2-a-simple-application/
https://www.playframework.com/documentation/2.6.x/ScalaAsync
https://blog.knoldus.com/2014/06/18/play-with-spark-building-apache-spark-with-play-framework/
https://spark.apache.org/docs/2.2.0/sql-programming-guide.html
https://scalaplayschool.wordpress.com/2014/08/19/lesson-9-passing-parameters-to-scala-play-controllers/
https://developer.lightbend.com/guides/play-rest-api/index.html
https://www.playframework.com/download#examples
https://www.playframework.com/documentation/2.6.x/Installing

# Play-with-Spark
