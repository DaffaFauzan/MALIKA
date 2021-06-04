package com.studio.malika.utils

import com.studio.malika.data.Banner

/**
 * Created by Ilyasa Ridho
on 31,May,2021
 */
object DataBanner  {

    fun getBanner():ArrayList<Banner>{
        val banner = ArrayList<Banner>()

        banner.add(
            Banner("Home with","https://anggunpaud.kemdikbud.go.id/images/upload/berita/B_20210311040117.jpeg")
        )

        banner.add(
            Banner("Home with","https://anggunpaud.kemdikbud.go.id/images/upload/berita/B_20210311040117.jpeg")
        )
        banner.add(
            Banner("Home with","https://anggunpaud.kemdikbud.go.id/images/upload/berita/B_20210311040117.jpeg")
        )

        return  banner
    }

}