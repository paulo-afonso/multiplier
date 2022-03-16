package com.example.multiplier.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class MultiplierModel (
    @Id
    var id: String? = null,
    val firstNumber: Long,
    val timesNumber: Long,
    var resultNumber: Long? = null,
    val creationDate: LocalDateTime = LocalDateTime.now()
)