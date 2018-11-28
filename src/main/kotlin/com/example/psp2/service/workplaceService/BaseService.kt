package com.example.psp2.service.workplaceService

import com.example.psp2.entities.employees.Workplaces.Workplace
import com.example.psp2.factory.WorkplaceFactory
import com.example.psp2.repo.WorkplacesRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
@Qualifier(value = "basePlaceService")
abstract class BaseService: com.example.psp2.service.PspService<Workplace> {

    @Autowired
    lateinit var workPlaceFactory: WorkplaceFactory

    @Autowired
    lateinit var workPlaceRepo: WorkplacesRepo

    override fun getAll(): List<Workplace> {
        return workPlaceRepo.findAll()
    }

    override fun import(model: Workplace) {
        workPlaceRepo.save(workPlaceFactory.getModel(model))
    }
}