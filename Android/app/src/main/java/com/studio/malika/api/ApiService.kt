package com.studio.malika.api

import com.studio.malika.data.Report
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

/**
 * Created by Ilyasa Ridho
on 08,June,2021
 */
interface ApiService {

//    @Multipart
@POST("report")

@Headers("Content-Type: application/json")
    fun postReport(
    @Body report: Report
    ):Call<ReportResponse>

}