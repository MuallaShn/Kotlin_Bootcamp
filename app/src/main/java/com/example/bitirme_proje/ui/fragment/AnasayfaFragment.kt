package com.example.bitirme_proje.ui.fragment

import YemeklerAdapter
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.bitirme_proje.R
import com.example.bitirme_proje.data.entity.Yemekler

class AnasayfaFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_anasayfa, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Toolbar bağlama
        val toolbar: Toolbar = view.findViewById(R.id.toolbar)
        (requireActivity() as AppCompatActivity).setSupportActionBar(toolbar)

        // Sipariş butonu
        val button: Button? = view.findViewById(R.id.order_now_button)
        button?.setOnClickListener {
            Toast.makeText(context, "Sipariş verildi!", Toast.LENGTH_SHORT).show()
        }

        // Örnek yemek listesi
        val yemeklerListesi = listOf(
            Yemekler(1, "Ayran", "ayran.png", 30),
            Yemekler(2, "Baklava", "baklava.png", 250),
            Yemekler(3, "Fanta", "fanta.png", 60),
            Yemekler(4, "Izgara Somon", "izgarasomon.png", 550),
            Yemekler(5, "Izgara Tavuk", "izgaratavuk.png", 270),
            Yemekler(6, "Kadayif", "kadayif.png", 220)
        )

        // RecyclerView ayarları
        val recyclerView = view.findViewById<RecyclerView>(R.id.yemeklerRecyclerView)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.adapter = YemeklerAdapter(yemeklerListesi) { secilenYemek ->
            val bundle = Bundle().apply {
                putSerializable("yemek", secilenYemek)
            }
            findNavController().navigate(R.id.detayaGecis, bundle)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_search -> {
                Toast.makeText(context, "Arama tıklandı", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
