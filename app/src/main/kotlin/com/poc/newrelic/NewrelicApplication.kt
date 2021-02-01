package com.poc.newrelic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NewrelicApplication

fun main(args: Array<String>) {
	runApplication<NewrelicApplication>(*args)
}
