package com.example.psp2.factory

import com.example.psp2.entities.employees.Workplaces.LondonWorkplace
import com.example.psp2.entities.employees.Workplaces.TokyoWorkplace
import com.example.psp2.entities.employees.Workplaces.Workplace

class WorkplaceFactory: BaseFactory<Workplace>() {

    override fun getModel(model: Workplace): Workplace {
            var workplace: Workplace?
            if (model.city == "London") {
                workplace = LondonWorkplace()
                workplace.id = model.id
                workplace.address = model.address
                workplace.city = model.city
            } else {
                workplace = TokyoWorkplace()
                workplace.id = model.id
                workplace.address = model.address
                workplace.city = model.city
            }
            return workplace
    }
}