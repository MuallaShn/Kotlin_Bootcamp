package com.example.navcomponentodev4.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navcomponentodev4.R
import com.example.navcomponentodev4.databinding.FragmentSayfaXBinding

class SayfaXFragment : Fragment() {
    private lateinit var binding: FragmentSayfaXBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaXBinding.inflate(inflater,container,false)

        binding.buttonXY.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.sayfaXdenYGecis)
        }

        return binding.root
    }
}