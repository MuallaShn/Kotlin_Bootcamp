import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.bitirme_proje.R
import com.example.bitirme_proje.data.entity.Yemekler

class YemeklerAdapter(
    private val yemekList: List<Yemekler>,
    private val onItemClick: (Yemekler) -> Unit
) : RecyclerView.Adapter<YemeklerAdapter.YemekViewHolder>() {

    inner class YemekViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val yemekAdi: TextView = itemView.findViewById(R.id.yemekAdi)
        val yemekFiyat: TextView = itemView.findViewById(R.id.yemekFiyat)
        val yemekResim: ImageView = itemView.findViewById(R.id.yemekResim)

        init {
            itemView.setOnClickListener {
                val pos = adapterPosition
                if (pos != RecyclerView.NO_POSITION) {
                    onItemClick(yemekList[pos])
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YemekViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_yemek_card, parent, false)
        return YemekViewHolder(view)
    }

    override fun onBindViewHolder(holder: YemekViewHolder, position: Int) {
        val yemek = yemekList[position]
        holder.yemekAdi.text = yemek.yemek_adi
        holder.yemekFiyat.text = "${yemek.yemek_fiyat} ₺"
        val imageUrl = "http://kasimadalan.pe.hu/yemekler/resimler/${yemek.yemek_resim_adi}"
        Glide.with(holder.itemView.context).load(imageUrl).into(holder.yemekResim)
    }

    override fun getItemCount(): Int = yemekList.size
}
