package spark

import org.apache.spark.SparkConf
import org.apache.spark.sql.{Dataset, SparkSession}

object SparkTest {

  def Example : Int = {

    val sparkS = SparkSession.builder.master("local[4]").getOrCreate
    import sparkS.implicits._

    val sum = Seq(3, 2, 4, 1, 0, 30,30,40,50,-4).toDS
    sum.count.toInt

  }
}