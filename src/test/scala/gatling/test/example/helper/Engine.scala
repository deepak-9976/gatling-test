package com.github.deepak9976.gatlingtest.helper

import com.github.deepak9976.gatlingtest.simulation.PerfTestConfig
import io.gatling.app.Gatling
import io.gatling.core.config.GatlingPropertiesBuilder

object Engine {
  def start(): Unit = {
    println(s"Target app base url : ${PerfTestConfig.baseUrl}")
    val props = new GatlingPropertiesBuilder
    props.resourcesDirectory(IDEPathHelper.dataDirectory.toString)
    props.resultsDirectory(IDEPathHelper.resultsDirectory.toString)
    props.binariesDirectory(IDEPathHelper.mavenBinariesDirectory.toString)
    props.simulationsDirectory(IDEPathHelper.mavenSourcesDirectory.toString)
    Gatling.fromMap(props.build)
  }

  def main(args: Array[String]) = Engine.start
}
