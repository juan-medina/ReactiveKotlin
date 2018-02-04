package com.juan.medina.ReactiveKotlin

import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.findAll
import org.springframework.data.mongodb.core.findById
import org.springframework.stereotype.Repository


@Repository
class CustomerRepository(private val template: ReactiveMongoTemplate) {
  fun findById(id: Int) = template.findById<Customer>(id)
  fun getAll() = template.findAll<Customer>()
}
