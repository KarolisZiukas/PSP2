package com.example.psp2.domain.factory.AbstractFactory.factories

import com.example.psp2.domain.factory.AbstractFactory.Params.parking.Parking
import com.example.psp2.domain.factory.AbstractFactory.Params.parking.UppergroundParking
import com.example.psp2.domain.factory.AbstractFactory.Params.specs.Specifications
import com.example.psp2.domain.factory.AbstractFactory.Params.specs.WithKitchen
import com.example.psp2.domain.factory.AbstractFactory.Params.specs.WithPrinter

class LithuaniaParametersFactory: PlaceParametersFactory {

    override fun createParking(): Parking {
        return UppergroundParking()
    }

    override fun addSpecs(): MutableList<Specifications> {
        return mutableListOf(WithKitchen(), WithPrinter())
    }

}