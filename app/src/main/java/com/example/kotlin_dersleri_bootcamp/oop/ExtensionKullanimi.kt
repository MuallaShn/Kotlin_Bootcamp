package com.example.kotlin_dersleri_bootcamp.oop

fun main() {
    val sonuc = 5 carp 2//5.carp(2) => infix yoksa,(5 carp 2 şeklinde fonksiyonun başına infix yazmamız sayesinde oldu )
    println(sonuc)
}

// her yerden erişmek için main fonksiyonunun dışına yazdık
infix fun Int.carp(sayi:Int) : Int { //Int sınıfına carp fonk eklendi demek oluyo
    return  this * sayi //this(Int)
}
