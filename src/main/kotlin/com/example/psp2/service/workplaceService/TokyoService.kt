package com.example.psp2.service.workplaceService

import com.example.psp2.entities.employees.Workplaces.TokyoWorkplace
import com.example.psp2.entities.employees.Workplaces.Workplace
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier(value = "tokyoPlaceService")
class TokyoService : BaseFacadeWorkplaceService() {

    fun getSpecific(): List<Workplace> {
        val tokyoPlace = mutableListOf<Workplace>()
        for (item in workPlaceRepo.findAll()) {
            if (item is TokyoWorkplace) {
                tokyoPlace.add(item)
            }
        }
        return tokyoPlace
    }
}