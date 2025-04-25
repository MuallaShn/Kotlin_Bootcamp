package com.example.kotlin_dersleri_bootcamp.oop

//vararg : parametre alanına istediğimiz kadar veri girebilmemizi sağlar (dizi gibi görev görür)
fun main() {
     fun toplam(vararg  sayilar:Int) : Int{

         var sonuc=0

         for(s in sayilar){
             sonuc=sonuc+s
         }

         return sonuc

     }
    val t1 = toplam(1,2,3,4,5)
    println("t1: $t1")
}