package com.example.psp2.service

interface PspService<T> {

    fun getAll(): List<T>

    fun getSpecific(): List<T>

    fun import(model: T)
}