package com.example.multiplier.controller.dto

import java.time.LocalDateTime

data class ViewDto(
    val firstNumber: Long,
    val timesNumber: Long,
    val resultNumber: Long?,
)