package com.example.psp2.controller.employeesController

import org.springframework.web.bind.annotation.GetMapping

interface Controller<T> {

    fun getAll(): List<T>

    fun add(model: T): T

    fun getSpecific(): List<T>
}