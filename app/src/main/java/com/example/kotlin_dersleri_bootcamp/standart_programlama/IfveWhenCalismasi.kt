package com.example.kotlin_dersleri_bootcamp.standart_programlama

fun main(){
    val yas = 19

    if(yas >= 18){
        println("reşitsiniz")
    }else{
        println("reşit değiliniz")
    }

    val ka = "admin"
    val s = 123456
    val sayi = 10

    if(ka == "admin" && s== 123456){
        println("hoşgeldiniz")
    }else{
        println("hatalı giriş")
    }

    if(sayi == 9 || sayi == 10){
        println("sayı 9 veya 10 dur")
    }else{
        println("sayı 9 veya 10 değildir")
    }

    //When, diğer dillerde switch olarak bilinir
    val number = 1

    when(number){
        1 -> println("sayı 1 dir")
        2 -> println("sayı 2 dir")
        else -> println("tanımlanmayan sayı")
    }
}