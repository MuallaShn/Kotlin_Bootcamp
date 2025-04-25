package com.example.kotlin_dersleri_bootcamp.oop

class Araba (var renk : String,var hiz:Int, var calisiyorMu: Boolean){

    fun bilgiAl(){
        println("Renk: $renk")
        println("Hız: $hiz")
        println("Çalışıyor mu: $calisiyorMu")
    }
}