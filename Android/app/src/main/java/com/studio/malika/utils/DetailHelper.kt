package com.studio.malika.utils

import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by Ilyasa Ridho
on 08,June,2021
 */
object DetailHelper {


    fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss", Locale.getDefault())
        val date = Date()
        return dateFormat.format(date)
    }



}
