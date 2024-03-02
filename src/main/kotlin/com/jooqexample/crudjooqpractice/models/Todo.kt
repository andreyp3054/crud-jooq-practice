package com.jooqexample.crudjooqpractice.models

import java.time.LocalDateTime

data class Todo(
        val id: Long,
        val creationTime: LocalDateTime,
        val description: String,
        val modificationTime: LocalDateTime,
        val title: String)