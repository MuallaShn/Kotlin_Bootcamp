package com.example.kotlin_dersleri_bootcamp.oop

fun main(){
    //Nesne oluşturma
    val y1= Yemekler(100,"köfte",249)

    //Değer okuma
    y1.bilgiAl()

    //Değer atama/değiştirme
    y1.fiyat = 350
    y1.bilgiAl()

    val y2 = Yemekler(200,"baklava",300)
    y2.bilgiAl()
}