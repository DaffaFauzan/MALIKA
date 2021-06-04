package com.studio.malika.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.studio.malika.data.Banner
import com.studio.malika.data.Menu
import com.studio.malika.utils.DataBanner
import com.studio.malika.utils.DataMenu

class HomeViewModel : ViewModel() {


    fun getBanner(): List<Banner> = DataBanner.getBanner()
    fun getMenu():List<Menu> = DataMenu.getMenu()
}