#!/bin/bash
SIMULATION_NAME=${SIMULATION_NAME:-com.github.deepak9976.gatlingtest.simulation.ExampleGetSimulation}
exec java ${JAVA_OPTS} -cp bin/gatling-test.jar  io.gatling.app.Gatling -s ${SIMULATION_NAME}
