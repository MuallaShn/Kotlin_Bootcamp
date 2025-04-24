package com.example.kotlin_dersleri_bootcamp.oop

data class Yemekler (var id:Int, var ad:String, var fiyat:Int){ //set get gibi kodları ya da equals gibi metotları elle tanımlamak yerine otomatik üretir.
    //Constructor - init fonksiyonu
    //Bu sınıftan nesne oluştuğunda çalışsın
    init {
        println("***** nesne oluştu *****")
    }
    fun bilgiAl(){
        println("--------------")
        println("Id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")
    }
    //this : Bulunduğu sınıfı temsil eder. (this.id) Swift dilinde self ol. kul.
    //super : Kalıtım ile bir üst sınıfı temsil eder
}