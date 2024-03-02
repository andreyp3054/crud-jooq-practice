package com.jooqexample.crudjooqpractice.models

import java.sql.Timestamp
import java.time.LocalDateTime

interface DateTimeService{
    fun getCurrentDateTime(): LocalDateTime
    fun getCurrentTimeStamp(): Timestamp
}