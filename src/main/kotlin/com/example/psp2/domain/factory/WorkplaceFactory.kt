package com.example.psp2.domain.factory

import com.example.psp2.entities.Workplaces.LondonWorkplace
import com.example.psp2.entities.Workplaces.TokyoWorkplace
import com.example.psp2.entities.Workplaces.Workplace
import org.springframework.stereotype.Component

@Component
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