package com.example.psp2.domain.factory.AbstractFactory.Store

import com.example.psp2.domain.factory.AbstractFactory.factories.LithuaniaParametersFactory
import com.example.psp2.domain.factory.AbstractFactory.types.Arena
import com.example.psp2.domain.factory.AbstractFactory.types.BuildingType
import com.example.psp2.domain.factory.AbstractFactory.types.Office
import com.example.psp2.domain.factory.AbstractFactory.types.Warehouse

class LithuaniaPlaceStore : Store() {

    override fun startBuilding(type: String): BuildingType {
        var building: BuildingType? = null
        val factory = LithuaniaParametersFactory()
        when (type) {
            "Warehouse" -> {
                building = Warehouse(factory)
                building.name = "Lithuania warehouse"
            }
            "Office" -> {
                building = Office(factory)
                building.name = "Lithuania office"
            }
            "Arena" -> {
                building = Arena(factory)
                building.name = "Lithuania arena"
            }
        }
        return building!!
    }
}