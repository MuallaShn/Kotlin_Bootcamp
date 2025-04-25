package com.example.kotlin_dersleri_bootcamp.oop

fun main() {

    val bmw = Araba("yesil",10,false)

    bmw.bilgiAl()

    bmw.renk = "beyaz"
    bmw.hiz = 99
    bmw.calisiyorMu = true

    bmw.bilgiAl()

}