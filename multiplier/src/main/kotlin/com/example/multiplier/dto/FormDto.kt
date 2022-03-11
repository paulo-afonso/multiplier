package com.example.multiplier.dto

import javax.validation.constraints.NotNull

data class FormDto (
    @field:NotNull
    val firstNumber: Long,
    @field: NotNull
    val timesNumber: Long
    )