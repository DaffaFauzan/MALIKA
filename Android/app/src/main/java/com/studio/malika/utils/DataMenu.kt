package com.studio.malika.utils

import com.studio.malika.R
import com.studio.malika.data.Banner
import com.studio.malika.data.Menu

/**
 * Created by Ilyasa Ridho
on 31,May,2021
 */
object DataMenu {

    fun getMenu():ArrayList<Menu>{
        val menu = ArrayList<Menu>()

        menu.add(
            Menu("Laporan Kekerasan", R.drawable.icons_health)
        )
        menu.add(
            Menu("Bimbingan Korban", R.drawable.icons_bimbingan)
        )
        menu.add(
                Menu("No Darurat", R.drawable.icons_phone)
        )
        menu.add(
                Menu("Lokasi Terdekat", R.drawable.iconslocation)
                )


        return  menu
    }
}