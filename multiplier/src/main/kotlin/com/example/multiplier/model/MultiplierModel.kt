package com.example.multiplier.model

import java.time.LocalDateTime

data class MultiplierModel (
    var id: Long? = null,
    val firstNumber: Long,
    val timesNumber: Long,
    var resultNumber: Long? = null,
    val creationDate: LocalDateTime = LocalDateTime.now()
)