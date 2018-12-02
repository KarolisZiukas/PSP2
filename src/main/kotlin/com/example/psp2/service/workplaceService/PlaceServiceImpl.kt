package com.example.psp2.service.workplaceService

import com.example.psp2.entities.employees.Workplaces.Workplace
import org.springframework.stereotype.Service

@Service
class PlaceServiceImpl: PlaceService {

    override fun getByConstruction(list: List<Workplace>, constructionType: String): List<Workplace> {
        val constructionsList = mutableListOf<Workplace>()
        for (item in list) {
            if(item.constructionType == constructionType) {
                constructionsList.add(item)
            }
        }
        return constructionsList
    }

    override fun getByCity(list: List<Workplace>, city: String): List<Workplace> {
        val citiesList = mutableListOf<Workplace>()
        for (item in list) {
            if(item.city == city) {
                citiesList.add(item)
            }
        }
        return citiesList
    }
}