package com.example.psp2.factory

import org.springframework.stereotype.Component

@Component
abstract class BaseFactory {

   abstract fun <T : Any?> getModel(position: String): T
}