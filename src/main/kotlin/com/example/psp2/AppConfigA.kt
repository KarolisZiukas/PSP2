package com.example.psp2

import com.example.psp2.service.carsService.BrokenCarFacadeServiceImpl
import com.example.psp2.service.carsService.FacadeCarService
import com.example.psp2.service.employeesService.FacadeEmployeesService
import com.example.psp2.service.employeesService.JuniorEmployeesFacadeServiceImpl
import com.example.psp2.service.workplaceService.FacadeWPService
import com.example.psp2.service.workplaceService.UnderConstructionPlaceServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class AppConfigA {

    @Bean
    fun carService(): FacadeCarService {
        return BrokenCarFacadeServiceImpl()
    }

    @Bean
    fun empService(): FacadeEmployeesService {
        return JuniorEmployeesFacadeServiceImpl()
    }

    @Bean
    fun workplaceService(): FacadeWPService {
        return UnderConstructionPlaceServiceImpl()
    }
}