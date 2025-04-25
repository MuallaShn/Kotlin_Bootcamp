package com.example.kotlin_dersleri_bootcamp.odevler

class Odev2 {

    fun soru1(derece:Double): Double {
        val f = (derece * 1.8) + 32
        return f
    }

    fun soru2(yatay:Int,dikey:Int){
        val cevre = 2 * yatay + 2 * dikey
        println("Dikdörtgenin çevresi: $cevre")
    }
}