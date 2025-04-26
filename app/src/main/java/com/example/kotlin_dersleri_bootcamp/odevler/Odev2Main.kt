package com.example.kotlin_dersleri_bootcamp.odevler

fun main() {

    val o = Odev2()

    val sonuc1 = o.soru1(20.0)
    println("Fahrenhiet: $sonuc1")

    o.soru2(5,2)

    val sonuc3 = o.soru3(3)
    println("Faktoriyel: $sonuc3")

    o.soru4("Mualla")

    val sonuc5 = o.soru5(3)
    println("İç açılar toplamı: $sonuc5")

    val sonuc6 = o.soru6(5)
    println("Toplam maaş miktarı: $sonuc6")

    val sonuc7 = o.soru7(60)
    println("Toplam ücret: $sonuc7")

}