package com.example.psp2.factory

import org.springframework.stereotype.Component

@Component
abstract class BaseFactory<T> {

   abstract fun getModel(model: T): T
}