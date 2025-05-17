import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.odev6.R

class ResimlerAdapter(val resimler: List<Int>) :
    RecyclerView.Adapter<ResimlerAdapter.ResimViewHolder>() {

    class ResimViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.imageViewSlider)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResimViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_slider, parent, false)
        return ResimViewHolder(view)
    }

    override fun onBindViewHolder(holder: ResimViewHolder, position: Int) {
        holder.imageView.setImageResource(resimler[position])
    }

    override fun getItemCount() = resimler.size
}
