# Play with Apache Spark
This is a simple example that combines Scala Play with Apache Spark.

Project's main purpose is to have a basic understanding on how to call Spark from Play. The class controllers.HomeController has two examples on how to call a function from spark.SparkTest that calls Apache Spark. The example creates an sequence of numbers as a DataSet, counts them and send this result to Scala Play. The count gets displayed by the browser using Play's HTML views.

The present project is an academic effort to indicate how to connect both technologies.

## Run
To run the example, execute:
```bash
sbt run
```

## Spark and SBT
The challeging part was to combine dependencies from different projects along with Spark, Scala and SBT versions. The result is something that works, but can be improved. Nevertheless, I can lived with all the versions used here.

The versions are:
* Scala Play 2.6.12
* SBT 1.1.1
* Scala 2.11.8
* Apache Spark 2.2.0

## Acknowledgments
Special thanks to <a href="https://github.com/playframework">@playframework</a>, <a href="https://github.com/knoldus">@knoldus</a> and <a href="https://github.com/anubhav100">@anubhav100</a>. I was able to pull this through checking their repositories and code. Also, this project was mainly based on [play-scala-rest-api-example](https://github.com/playframework/play-scala-rest-api-example/tree/2.6.x)

## References 
* https://github.com/playframework/play-scala-rest-api-example/tree/2.6.x
* https://github.com/knoldus/Play-Spark-Scala
* https://github.com/anubhav100/play-spark
* https://blog.knoldus.com/2017/06/12/play-spark2-a-simple-application/
* https://www.playframework.com/documentation/2.6.x/ScalaAsync
* https://blog.knoldus.com/2014/06/18/play-with-spark-building-apache-spark-with-play-framework/
* https://spark.apache.org/docs/2.2.0/sql-programming-guide.html
* https://scalaplayschool.wordpress.com/2014/08/19/lesson-9-passing-parameters-to-scala-play-controllers/
* https://developer.lightbend.com/guides/play-rest-api/index.html
* https://www.playframework.com/download#examples
* https://www.playframework.com/documentation/2.6.x/Installing

