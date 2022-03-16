package com.example.multiplier.controller

import com.example.multiplier.controller.dto.FormDto
import com.example.multiplier.controller.dto.ViewDto
import com.example.multiplier.model.MultiplierModel
import com.example.multiplier.service.MultiplierService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/numbers")
class MultiplierController(private val service: MultiplierService) {

    @GetMapping
    fun listing(): ResponseEntity<List<MultiplierModel>> {
        return service.listing()
    }

    @GetMapping("/{id}")
    fun searchById(@PathVariable id: String): ResponseEntity<MultiplierModel> {
        return service.searchById(id)
    }

    @PostMapping
    fun register(@RequestBody model: MultiplierModel) {
        service.register(model)
    }

}