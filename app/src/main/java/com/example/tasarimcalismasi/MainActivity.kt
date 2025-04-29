package com.example.tasarimcalismasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //R (kotlin sınıfları içerisinde) = res klasörü, kaynaklar
        //@ (Xml dosyalar içerisinde ) = res klasörü,kaynaklar
        setContentView(R.layout.activity_main)


    }
}
