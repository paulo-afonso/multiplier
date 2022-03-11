package com.example.multiplier.service

import com.example.multiplier.dto.FormDto
import com.example.multiplier.dto.ViewDto
import com.example.multiplier.mapper.FormMapper
import com.example.multiplier.mapper.ViewMapper
import com.example.multiplier.model.MultiplierModel
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class MultiplierService(
    private var numbers: List<MultiplierModel> = ArrayList(),
    private var formMapper: FormMapper,
    private var viewMapper: ViewMapper
) {

    fun listing(): List<ViewDto> {
        return numbers.stream().map { t -> viewMapper.map(t) }.collect(Collectors.toList())
    }

    fun searchById(id: Long): ViewDto {
        val number = numbers.stream().filter { t -> t.id == id }.findFirst().get()
        return viewMapper.map(number)
    }

    fun register(form: FormDto) {
        val number = formMapper.map(form)
        number.id = numbers.size.toLong() + 1
        number.resultNumber = number.firstNumber * number.timesNumber
        numbers = numbers.plus(number)
    }

}