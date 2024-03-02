package com.jooqexample.crudjooqpractice.repositories

import com.jooqexample.crudjooqpractice.models.Todo
import org.springframework.stereotype.Repository

@Repository
interface TodoRepository {

    fun add(todoEntry: Todo): Todo
    fun delete(id: Long)
    fun findAll(): List<Todo>
    fun findById(id: Long)
    fun update(todoEntry: Todo)

}