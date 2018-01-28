package com.juan.medina.ReactiveKotlin

import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router


@Component
class CustomerRouter {
  @Bean
  fun customerRoutes() = router {
    "/customer".nest {
      GET("/{id}", fun(serverRequest: ServerRequest) =
          ServerResponse.ok().body(fromObject(Customer("hello", "+447801234567"))))
    }
  }
}
