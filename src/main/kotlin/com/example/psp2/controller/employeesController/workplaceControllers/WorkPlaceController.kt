package com.example.psp2.controller.employeesController.workplaceControllers

import com.example.psp2.entities.employees.Workplaces.Workplace
import com.example.psp2.service.PspService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class WorkPlaceController {

    @Autowired
    @Qualifier("londonPlaceService")
    lateinit var placePspService: PspService<Workplace>

    @GetMapping("/places/get")
    fun getAll(): List<Workplace> {
        return placePspService.getAll()
    }

    @PostMapping("/places/add")
    fun add(@RequestBody model: Workplace): Workplace {
        placePspService.import(model)
        return model
    }


}