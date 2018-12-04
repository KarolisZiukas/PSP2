package com.example.psp2.domain.factory.AbstractFactory.Store

import com.example.psp2.domain.factory.AbstractFactory.factories.LatviaParametersFactory
import com.example.psp2.domain.factory.AbstractFactory.factories.LithuaniaParametersFactory
import com.example.psp2.domain.factory.AbstractFactory.types.BuildingType
import com.example.psp2.domain.factory.AbstractFactory.types.Office
import com.example.psp2.domain.factory.AbstractFactory.types.Warehouse

class LatviaPlaceStore : Store() {

    override fun startBuilding(type: String): BuildingType {
        var building: BuildingType? = null
        val factory = LatviaParametersFactory()
        when (type) {
            "Warehouse" -> {
                building = Warehouse(factory)
                building.name = "Latvia warehouse"
            }
            "Office" -> {
                building = Office(factory)
                building.name = "Latvia office"
            }
        }

        return building!!
    }
}
