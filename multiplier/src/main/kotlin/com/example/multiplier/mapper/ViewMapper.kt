package com.example.multiplier.mapper

import com.example.multiplier.dto.ViewDto
import com.example.multiplier.model.MultiplierModel
import org.springframework.stereotype.Component

@Component
class ViewMapper(): Mapper<MultiplierModel, ViewDto> {

    override fun map(t: MultiplierModel): ViewDto {
        return ViewDto(
            firstNumber = t.firstNumber,
            timesNumber = t.timesNumber,
            resultNumber = t.resultNumber
        )
    }

}