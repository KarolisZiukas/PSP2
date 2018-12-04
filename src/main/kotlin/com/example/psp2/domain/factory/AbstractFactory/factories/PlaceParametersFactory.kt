package com.example.psp2.domain.factory.AbstractFactory.factories

import com.example.psp2.domain.factory.AbstractFactory.Params.parking.Parking
import com.example.psp2.domain.factory.AbstractFactory.Params.specs.Specifications

interface PlaceParametersFactory {

    fun createParking(): Parking

    fun addSpecs(): MutableList<Specifications>
}
