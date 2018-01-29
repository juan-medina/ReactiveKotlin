package com.juan.medina.ReactiveKotlin

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters.fromObject
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.body

@Component
class CustomerHandler(val customerRepository: CustomerRepository) {
  fun getCustomer(serverRequest: ServerRequest) = customerRepository
      .findById(serverRequest.pathVariable("id").toInt())
      .flatMap { ServerResponse.ok().body(fromObject(it)) }

  fun getAllCustomers(serverRequest: ServerRequest) = ServerResponse.ok()
      .body<Customer>(customerRepository.getAll())
}
