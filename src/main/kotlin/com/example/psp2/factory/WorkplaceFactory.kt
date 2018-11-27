package com.example.psp2.factory

import com.example.psp2.entities.employees.Workplaces.LondonWorkplace
import com.example.psp2.entities.employees.Workplaces.TokyoWorkplace
import com.example.psp2.entities.employees.Workplaces.Workplace

class WorkplaceFactory : BaseFactory<Workplace>() {

    override fun getModel(model: Workplace): Workplace {
        return when {
            model.city == "London" -> createModel(model, LondonWorkplace())
            else -> createModel(model, TokyoWorkplace())
        }
    }

    override fun createModel(model: Workplace, type: Workplace): Workplace {
        val workplace: Workplace?
        workplace = type
        workplace.id = model.id
        workplace.address = model.address
        workplace.city = model.city
        return workplace
    }
}