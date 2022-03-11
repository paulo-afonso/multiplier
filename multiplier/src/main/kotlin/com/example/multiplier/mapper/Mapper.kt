package com.example.multiplier.mapper

interface Mapper<T, U> {

    fun map(t: T): U

}