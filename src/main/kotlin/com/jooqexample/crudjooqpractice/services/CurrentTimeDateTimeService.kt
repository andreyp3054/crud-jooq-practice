package com.jooqexample.crudjooqpractice.services

import com.jooqexample.crudjooqpractice.models.DateTimeService
import java.sql.Timestamp
import java.time.LocalDateTime

class CurrentTimeDateTimeService : DateTimeService {
    override fun getCurrentDateTime(): LocalDateTime {
        return LocalDateTime.now()
    }

    override fun getCurrentTimeStamp(): Timestamp {
        return Timestamp(System.currentTimeMillis())
    }
}