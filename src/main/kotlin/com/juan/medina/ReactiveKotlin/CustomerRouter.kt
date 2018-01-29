package com.juan.medina.ReactiveKotlin

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.router


@Component
class CustomerRouter(val customerHandler: CustomerHandler) {
  @Bean
  fun customerRoutes() = router {
    "/customer".nest {
      GET("/{id}", customerHandler::getCustomer)
      GET("/", customerHandler::getAllCustomers)
    }
  }
}
