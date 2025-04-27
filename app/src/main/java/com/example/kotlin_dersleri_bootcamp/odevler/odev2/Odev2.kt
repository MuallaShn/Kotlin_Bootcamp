package com.example.kotlin_dersleri_bootcamp.odevler.odev2

class Odev2 {

    // Parametre ol. girilen dereceyi fahrenhiet'a dönüştürdükten sonra geri döndüren metodu yazın.
    // F=C * 1.8 +32
    fun soru1(derece:Double): Double {
        val f = (derece * 1.8) + 32
        return f
    }

    //kenarları parametre ol girilen dikdörtgenin çevresini hesaplayan metod
    fun soru2(yatay:Int,dikey:Int){
        val cevre = 2 * yatay + 2 * dikey
        println("Dikdörtgenin çevresi: $cevre")
    }

    //parametre ol. gir. sayının faktoriye değerini hesaplayıp geri döndüren metod
    fun soru3(sayi:Int): Int{
        var sonuc = 1
       for (i in 1..sayi){
           sonuc = sonuc * i

       }
        return sonuc
    }

    //parametre ol. gir. kelime içinde kaç adet a harfi olduğunu gösteren metod
    fun soru4(kelime:String){
        var harf = 'a'
        var harfSayisi = 0
        for (i in kelime){
            if(i == harf){
                harfSayisi = harfSayisi + 1
            }
        }
        println("Kelime içinde $harfSayisi adet a bulunur")
    }

    //parametre ol. gir. kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri döndüren metod.
    // iç açılar toplamı = (kenar sayısı - 2) * 180
    fun soru5(kenarSayisi:Int):Int{
        val toplam = (kenarSayisi - 2) * 180
        return toplam
    }

    //parametre ol. gir. gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    //1 günde 8 saat çalışabilir
    //çalışma saat ücreti 10 tl
    //mesai saat ücreti 20 tl
    //160 saat üzeri mesai yapılır
    fun soru6(gunSayisi:Int):Int{
        val calismaSaati = gunSayisi * 8
        var toplamMaas = 0

        if(calismaSaati > 160){
            val fazlaMesai = calismaSaati - 160
            toplamMaas = 160 * 10 + fazlaMesai * 10
        }else{
            toplamMaas = calismaSaati * 10
        }
        return toplamMaas
    }

    //parametre ol. girilen kota miktarına göre ücreti hesaplayarak geri döndüren metod
    //50 GB = 100 tl
    //kota aşımından sonra her 1 GB, 4 tl dir
    fun soru7(kotaMiktari:Int):Int{
        var toplamFiyat = 0

        if(kotaMiktari > 50){
            val fazlaKota = kotaMiktari - 50
            toplamFiyat = 100 + fazlaKota * 4
        }else{
            toplamFiyat = 100
        }
        return toplamFiyat
    }
}