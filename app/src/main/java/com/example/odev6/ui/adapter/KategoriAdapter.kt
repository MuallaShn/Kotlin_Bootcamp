import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.R
import com.example.odev6.data.entity.Kategori




class KategoriAdapter(private val kategoriListesi: List<Kategori>) :
    RecyclerView.Adapter<KategoriAdapter.KategoriViewHolder>() {

    class KategoriViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val kategoriAd: TextView = itemView.findViewById(R.id.textKategori)
        val kategoriResim: ImageView = itemView.findViewById(R.id.imageKategori)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KategoriViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_kategori, parent, false)
        return KategoriViewHolder(view)
    }

    override fun onBindViewHolder(holder: KategoriViewHolder, position: Int) {
        val kategori = kategoriListesi[position]
        holder.kategoriAd.text = kategori.ad
        holder.kategoriResim.setImageResource(kategori.resim)
    }

    override fun getItemCount(): Int = kategoriListesi.size
}
