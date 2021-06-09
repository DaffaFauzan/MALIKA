package com.studio.malika.ui.telephone

import androidx.lifecycle.ViewModel
import com.studio.malika.data.Banner
import com.studio.malika.data.Telephone
import com.studio.malika.utils.DataBanner
import com.studio.malika.utils.DataTelephone

/**
 * Created by Ilyasa Ridho
on 08,June,2021
 */
class TeleponeViewModel : ViewModel() {

    fun getTelephone(): List<Telephone> = DataTelephone.getTelephone()
}