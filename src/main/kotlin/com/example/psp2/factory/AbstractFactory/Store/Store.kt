package com.example.psp2.factory.AbstractFactory.Store

import com.example.psp2.factory.AbstractFactory.types.BuildingType

abstract class Store {

    abstract fun startBuilding(type: String): BuildingType

    fun startProject(type: String): BuildingType  {
        val building = startBuilding(type)
        println("starting to build ${building.name}")
        building.build()
        building.start()
        building.finish()
        return building

    }

}