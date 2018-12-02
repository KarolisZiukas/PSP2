package com.example.psp2.factory.AbstractFactory.Store

import com.example.psp2.factory.AbstractFactory.factories.LatviaParametersFactory
import com.example.psp2.factory.AbstractFactory.factories.LithuaniaParametersFactory
import com.example.psp2.factory.AbstractFactory.types.BuildingType
import com.example.psp2.factory.AbstractFactory.types.Office
import com.example.psp2.factory.AbstractFactory.types.Warehouse

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
        }
        return building!!
    }
}