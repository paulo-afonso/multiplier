package com.example.multiplier.service

import com.example.multiplier.controller.dto.FormDto
import com.example.multiplier.controller.dto.ViewDto
import com.example.multiplier.mapper.FormMapper
import com.example.multiplier.mapper.ViewMapper
import com.example.multiplier.model.MultiplierModel
import com.example.multiplier.repository.NumberRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import java.util.stream.Collectors

@Service
class MultiplierService(
    private var numbers: List<MultiplierModel> = ArrayList(),
    private var formMapper: FormMapper,
    private var viewMapper: ViewMapper,
    private var repository: NumberRepository
) {

    fun listing(): ResponseEntity<List<MultiplierModel>> {
        return ResponseEntity.ok(repository.findAll())
    }

    fun searchById(id: String): ResponseEntity<MultiplierModel> {
        return ResponseEntity.ok(repository.findById(id).orElse(null))
    }

    fun register(number: MultiplierModel): ResponseEntity<MultiplierModel> {
//        val number = formMapper.map(form)
        number.resultNumber = number.firstNumber * number.timesNumber
        return ResponseEntity.ok(repository.save(number))
    }

}