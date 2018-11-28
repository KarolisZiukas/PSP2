package com.example.psp2.controller.employeesController.workplaceControllers

import com.example.psp2.entities.employees.Workplaces.Workplace
import com.example.psp2.service.PspService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/places/tokyo")
class TokyoController {

    @Autowired
    @Qualifier("tokyoPlaceService")
    lateinit var placeService: PspService<Workplace>

    @GetMapping("/getAll")
    fun getSpecific(): List<Workplace> {
        return placeService.getSpecific()
    }
}