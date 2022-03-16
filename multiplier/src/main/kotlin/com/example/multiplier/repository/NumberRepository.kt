package com.example.multiplier.repository

import com.example.multiplier.model.MultiplierModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NumberRepository: MongoRepository<MultiplierModel, String> {
}