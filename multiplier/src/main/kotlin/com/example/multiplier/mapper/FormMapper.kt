package com.example.multiplier.mapper

import com.example.multiplier.dto.FormDto
import com.example.multiplier.model.MultiplierModel
import org.springframework.stereotype.Component

@Component
class FormMapper(): Mapper<FormDto, MultiplierModel> {

    override fun map(t: FormDto): MultiplierModel {
        return MultiplierModel(
            firstNumber = t.firstNumber,
            timesNumber = t.timesNumber
            )
    }

}