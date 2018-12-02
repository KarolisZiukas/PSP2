package com.example.psp2.factory.AbstractFactory.factories

import com.example.psp2.factory.AbstractFactory.Params.parking.Parking
import com.example.psp2.factory.AbstractFactory.Params.parking.UndergroundParking
import com.example.psp2.factory.AbstractFactory.Params.specs.Specifications
import com.example.psp2.factory.AbstractFactory.Params.specs.WithForkLift
import com.example.psp2.factory.AbstractFactory.Params.specs.WithKitchen

class LatviaParametersFactory: PlaceParametersFactory {

    override fun createParking(): Parking {
        return UndergroundParking()
    }

    override fun addSpecs(): MutableList<Specifications> {
        return mutableListOf(WithForkLift(), WithKitchen())
    }
}