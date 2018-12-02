package com.example.psp2.service.workplaceService

import com.example.psp2.entities.employees.Workplaces.Workplace

interface FacadeWPService {

    fun getAll(): List<Workplace>

    fun import(model: Workplace)

    fun getByCity(city: String): List<Workplace>
}