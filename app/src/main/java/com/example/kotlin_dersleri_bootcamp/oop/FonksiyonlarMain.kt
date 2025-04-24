package com.example.kotlin_dersleri_bootcamp.oop

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return (veri transferi)
    val gelenSonuc = f.selamla2()
    println("gelen sonuç : $gelenSonuc")

    //parametre
    f.selamla3("Mualla")

    //overloading
    f.topla(10,20,"beyza")

}