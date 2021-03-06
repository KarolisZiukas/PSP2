package com.example.psp2.domain.factory

import org.springframework.stereotype.Component

@Component
abstract class BaseFactory<T> {

   abstract fun getModel(model: T): T

   abstract fun createModel(model: T, type: T): T
}