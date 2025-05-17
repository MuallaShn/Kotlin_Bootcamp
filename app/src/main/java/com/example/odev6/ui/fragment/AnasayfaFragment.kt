package com.example.odev6.ui.fragment

import KategoriAdapter
import ResimlerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.odev6.R
import com.example.odev6.databinding.FragmentAnasayfaBinding
import com.example.odev6.ui.viewmodel.AnasayfaViewModel


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding
    private val viewModel: AnasayfaViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)

        // SLIDER
        val sliderResimler = listOf(
            R.drawable.sliderphoto1,
            R.drawable.sliderphoto2,

        )
        binding.viewPagerSlider.adapter = ResimlerAdapter(sliderResimler)


        binding.viewPagerSlider.adapter = ResimlerAdapter(viewModel.sliderResimleri)
        binding.recyclerKategoriler.layoutManager = GridLayoutManager(requireContext(), 4)
        binding.recyclerKategoriler.adapter = KategoriAdapter(viewModel.kategoriler)

        return binding.root
    }
}

