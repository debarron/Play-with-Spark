package controllers

import javax.inject.Inject
import play.api.mvc._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits._

// Spark
import spark.SparkTest


class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

  def index = Action { implicit request =>
    Ok(views.html.index())
  }

  // A simple example to call Apache Spark
  def test = Action { implicit request =>
  	val sum = SparkTest.Example
    Ok(views.html.test_args(s"A call to Spark, with result: $sum"))
  }

  // A non-blocking call to Apache Spark 
  def testAsync = Action.async{
  	val futureSum = Future{SparkTest.Example}
    futureSum.map{ s => Ok(views.html.test_args(s"A non-blocking call to Spark with result: ${s + 1000}"))}
  }

}
