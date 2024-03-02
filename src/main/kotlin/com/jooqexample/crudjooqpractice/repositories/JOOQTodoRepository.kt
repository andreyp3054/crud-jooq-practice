package com.jooqexample.crudjooqpractice.repositories

import com.jooqexample.crudjooqpractice.models.DateTimeService
import com.jooqexample.crudjooqpractice.models.Todo
import org.jooq.DSLContext



class JOOQTodoRepository(dateTimeService: DateTimeService, jooq : DSLContext) : TodoRepository {
    override fun add(todoEntry: Todo): Todo {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<Todo> {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long) {
        TODO("Not yet implemented")
    }

    override fun update(todoEntry: Todo) {
        TODO("Not yet implemented")
    }

//    fun convertQueryResultToModelObject()
}