package com.example.multiplier.controller

import com.example.multiplier.dto.FormDto
import com.example.multiplier.dto.ViewDto
import com.example.multiplier.service.MultiplierService
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
    fun listing(): List<ViewDto> {
        return service.listing()
    }

    @GetMapping("/{id}")
    fun searchById(@PathVariable id: Long): ViewDto {
        return service.searchById(id)
    }

    @PostMapping
    fun register(@RequestBody dto: FormDto) {
        service.register(dto)
    }

}