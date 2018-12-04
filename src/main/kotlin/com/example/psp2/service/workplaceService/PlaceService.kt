package com.example.psp2.service.workplaceService

import com.example.psp2.entities.Workplaces.Workplace

interface PlaceService {

    fun getByConstruction(list: List<Workplace>, constructionType: String): List<Workplace>

    fun getByCity(list: List<Workplace>, city: String): List<Workplace>

}