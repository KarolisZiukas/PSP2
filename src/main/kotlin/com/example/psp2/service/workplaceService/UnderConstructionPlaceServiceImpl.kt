package com.example.psp2.service.workplaceService

import com.example.psp2.entities.Workplaces.Workplace
import com.example.psp2.domain.factory.WorkplaceFactory
import com.example.psp2.repo.WorkplacesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UnderConstructionPlaceServiceImpl: FacadeWPService {

    @Autowired
    lateinit var placeService: PlaceService

    @Autowired
    lateinit var placeRepo: WorkplacesRepo

    @Autowired
    lateinit var placeFactory: WorkplaceFactory

    override fun getAll(): List<Workplace> {
        return placeService.getByConstruction(placeRepo.findAll(), "UnderConstruction")
    }

    override fun import(model: Workplace) {
        placeRepo.save(placeFactory.getModel(model))
    }

    override fun getByCity(city: String): List<Workplace> {
        return placeService.getByCity(getAll(), city)
    }
}