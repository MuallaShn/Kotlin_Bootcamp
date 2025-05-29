package com.example.bitirme_proje.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.bitirme_proje.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {

    private lateinit var binding: FragmentDetayBinding
    private val args: DetayFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val gelenYemek = args.yemek // args'tan veri çekiyoruz

        binding.detayYemekAdi.text = gelenYemek.yemek_adi
        binding.detayYemekFiyat.text = "${gelenYemek.yemek_fiyat} ₺"

        val imageUrl = "http://kasimadalan.pe.hu/yemekler/resimler/${gelenYemek.yemek_resim_adi}"
        Glide.with(requireContext())
            .load(imageUrl)
            .into(binding.detayYemekResim)

        return binding.root
    }
}
