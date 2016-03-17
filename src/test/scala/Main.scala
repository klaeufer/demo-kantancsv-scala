package edu.luc.etl.csvdemo

import kantan.csv.ops._            // Enriches types with useful methods.

object Main extends App {

  val m = Map (
    "hello" -> 5,
    "world" -> 7
  )

  println(m.asCsv('='))
}
