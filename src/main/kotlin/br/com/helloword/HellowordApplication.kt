package br.com.helloword

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HellowordApplication

fun main(args: Array<String>) {
	runApplication<HellowordApplication>(*args)
}
