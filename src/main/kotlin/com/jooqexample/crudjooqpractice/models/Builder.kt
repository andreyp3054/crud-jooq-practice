package com.jooqexample.crudjooqpractice.models

import java.sql.Timestamp

data class Builder(
        val id: Long,
        val creationTime: Timestamp,
        val description: String,
        val modificationTime: Timestamp,
        val title: String,

)
