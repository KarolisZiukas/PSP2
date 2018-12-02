package com.example.psp2.factory.AbstractFactory.types

import com.example.psp2.factory.AbstractFactory.factories.PlaceParametersFactory

class Warehouse(
        val placeParametersFactory: PlaceParametersFactory
): BuildingType() {

    override fun build() {
        println("building $name")
        specs = placeParametersFactory.addSpecs()
    }
}