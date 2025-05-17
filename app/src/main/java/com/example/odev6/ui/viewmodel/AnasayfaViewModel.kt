package com.example.odev6.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.odev6.R
import com.example.odev6.data.entity.Kategori


class AnasayfaViewModel : ViewModel() {

    val sliderResimleri = listOf(
        R.drawable.sliderphoto1,
        R.drawable.sliderphoto2
    )

    val kategoriler = listOf(
        Kategori("İndirimdekiler", R.drawable.indirimler),
        Kategori("Ekran Keyfi", R.drawable.ekrankeyfi),
        Kategori("Atıştırmalık", R.drawable.atistirmalik),
        Kategori("Su & İçecek", R.drawable.suicecek),
        Kategori("Meyve & Sebze", R.drawable.meyvesebze),
        Kategori("Fırından", R.drawable.firindan),
        Kategori("Süt Ürünleri", R.drawable.suturunleri),
        Kategori("Dondurma", R.drawable.dondurma),
        Kategori("Temel Gıda", R.drawable.temelgida),
        Kategori("Kahvaltılık", R.drawable.kahvaltilik),
        Kategori("Et & Tavuk & Balık", R.drawable.ettavuk),
        Kategori("Fit & Form", R.drawable.fitform),
        Kategori("Kişisel Bakım", R.drawable.kisiselbakim),
        Kategori("Ev Bakım", R.drawable.evbakim),
        Kategori("Ev & Yaşam", R.drawable.evyasam),
        Kategori("Evcil Hayvan", R.drawable.evcilhayvan)

    )

}
