package com.studio.malika.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.studio.malika.data.Menu
import com.studio.malika.databinding.ItemMenuBinding

/**
 * Created by Ilyasa Ridho
on 31,May,2021
 */
class MenuAdapter : RecyclerView.Adapter<MenuAdapter.ViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    private val listMenu = ArrayList<Menu>()

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    fun setMenu(menu: List<Menu>?) {
        if (menu == null) return
        this.listMenu.clear()
        this.listMenu.addAll(menu)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemMenuBinding =
            ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemMenuBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val menu = listMenu[position]
        holder.bind(menu)

    }

    override fun getItemCount(): Int = listMenu.size

    inner class ViewHolder(private val binding: ItemMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(menu :Menu) {
            with(binding) {
                tvItemName.text = menu.name
                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(menu)

                }
                Glide.with(itemView.context)
                    .load(menu.image)
                    .into(imgMenu)

            }

        }

    }

    interface OnItemClickCallback {

        fun onItemClicked(menu: Menu)
    }
}