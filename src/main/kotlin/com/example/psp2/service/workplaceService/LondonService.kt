package com.example.psp2.service.workplaceService

import com.example.psp2.entities.employees.Workplaces.LondonWorkplace
import com.example.psp2.entities.employees.Workplaces.Workplace
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier(value = "londonPlaceService")
class LondonService : BaseFacadeWorkplaceService() {

    fun getSpecific(): List<Workplace> {
        val londonPlace = mutableListOf<Workplace>()
        for (item in workPlaceRepo.findAll()) {
            if (item is LondonWorkplace) {
                londonPlace.add(item)
            }
        }
        return londonPlace
    }


}
