package com.juan.medina.ReactiveKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveKotlinApplication

fun main(args: Array<String>) {
  runApplication<ReactiveKotlinApplication>(*args)
}
