package com.example.kotlin_dersleri_bootcamp.standart_programlama

fun main(){
    //1,2,3 => 1..3
    for(i in 1..3){ //swift dilinde 1...3
        println("döngü 1: $i")
    }

    //10 ile 20 arasında beşer artsın
    for(x in 10..20 step 5){ //infix fonksiyon denir
        println("döngü 2: $x")
    }

    //20 ile 10 arasında beşer azalsın
    for(x in 20 downTo 10 step 5){ //infix fonksiyon denir
        println("döngü 3: $x")
    }

    //1,2,3
    var sayac = 1

    while (sayac < 4){
        println("döngü 4: $sayac")
        sayac+=1
    }

    for(i in 1..5){
        if(i == 3){
            break //döngüyü durdurur
        }
        println("döngü 5: $i")
    }

    for(i in 1..5){
        if(i == 3){
            continue //bulunduğu adımı pas geçer
        }
        println("döngü 6: $i")
    }
}