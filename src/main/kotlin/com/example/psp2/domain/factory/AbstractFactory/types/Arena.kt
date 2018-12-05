package com.example.psp2.domain.factory.AbstractFactory.types

import com.example.psp2.domain.factory.AbstractFactory.factories.PlaceParametersFactory

class Arena (
        val placeParametersFactory: PlaceParametersFactory
): BuildingType() {

    override fun build() {
        println("building $name")
        parking = placeParametersFactory.createParking()
    }
}

