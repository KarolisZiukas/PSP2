package com.example.psp2.domain.factory.AbstractFactory.types

import com.example.psp2.domain.factory.AbstractFactory.Params.parking.Parking
import com.example.psp2.domain.factory.AbstractFactory.Params.specs.Specifications

abstract class BuildingType {

    var name: String? = null
    var parking: Parking? = null
    var specs: MutableList<Specifications>? = null

    abstract fun build()

    fun start() {
        println("Starting to build")
    }

    fun finish() {
        println("Finishing to build")
    }

    fun printInfo(): String {
        val result = StringBuffer()
        result.append("----$name----\n")
        if(parking != null ){
            result.append("${parking!!.getParking()}\n")
        }
        if(specs != null) {
            for (item in specs as MutableList<Specifications>) {
                result.append("${item.getSpecifications()}\n")
            }
        }
        return result.toString()
    }



}