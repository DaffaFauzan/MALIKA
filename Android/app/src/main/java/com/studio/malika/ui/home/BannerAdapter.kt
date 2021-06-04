package com.studio.malika.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.github.islamkhsh.CardSliderAdapter
import com.studio.malika.R
import com.studio.malika.data.Banner
import com.studio.malika.databinding.ItemSliderBinding
import java.util.ArrayList

/**
 * Created by Ilyasa Ridho
on 28,May,2021
 */
class BannerAdapter(banner: List<Banner>) : CardSliderAdapter<BannerAdapter.BannerViewHolder>() {
    private val listBanner = ArrayList<Banner>()

    fun setBanner(banner: List<Banner>?) {
        if (banner == null) return
        this.listBanner.clear()
        this.listBanner.addAll(banner)

        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        val item = ItemSliderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BannerViewHolder(item)
    }

    override fun getItemCount(): Int = listBanner.size

    inner class BannerViewHolder(private val binding: ItemSliderBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(banner: Banner) {
            with(binding) {

                Glide.with(imgSlider)
                    .load(banner.image)
                    .error(R.drawable.ic_error)
                    .into(imgSlider)



            }
        }
    }

    override fun bindVH(holder: BannerViewHolder, position: Int) {
        holder.bind(listBanner[position])
    }
}