package com.studio.malika.ui.telephone

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.studio.malika.data.Menu
import com.studio.malika.data.Telephone
import com.studio.malika.databinding.ItemMenuBinding
import com.studio.malika.databinding.ItemTelephoneBinding
import com.studio.malika.ui.home.MenuAdapter

/**
 * Created by Ilyasa Ridho
on 08,June,2021
 */
class TelephoneAdapter : RecyclerView.Adapter<TelephoneAdapter.ViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    private val listTelephone = ArrayList<Telephone>()

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    fun setTelephone(telp: List<Telephone>?) {
        if (telp == null) return
        this.listTelephone.clear()
        this.listTelephone.addAll(telp)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemTelephoneBinding =
            ItemTelephoneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(itemTelephoneBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val telp = listTelephone[position]
        holder.bind(telp)

    }

    override fun getItemCount(): Int = listTelephone.size

    inner class ViewHolder(private val binding: ItemTelephoneBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(telp : Telephone) {
            with(binding) {
                tvName.text = telp.nama
                itemView.setOnClickListener {
                    onItemClickCallback.onItemClicked(telp)

                }
                Glide.with(itemView.context)
                    .load(telp.image)
                    .into(imageTelp)

            }

        }

    }

    interface OnItemClickCallback {

        fun onItemClicked(telp: Telephone)
    }
}