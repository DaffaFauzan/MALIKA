package com.studio.malika.utils

import com.studio.malika.R
import com.studio.malika.data.Banner
import com.studio.malika.data.Telephone

/**
 * Created by Ilyasa Ridho
on 08,June,2021
 */
object DataTelephone  {

    fun getTelephone():ArrayList<Telephone>{
        val telephone = ArrayList<Telephone>()

        telephone.add(
            Telephone("Sapa 129","129", R.drawable.phone_call)
        )
        telephone.add(
            Telephone("Sapa 129","628111129129", R.drawable.whatsapp)
        )


        return  telephone
    }

}