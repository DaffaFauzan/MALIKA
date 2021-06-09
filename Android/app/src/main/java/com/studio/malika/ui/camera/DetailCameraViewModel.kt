package com.studio.malika.ui.camera

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.studio.malika.api.ApiConfig
import com.studio.malika.api.ReportResponse
import com.studio.malika.data.Report
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**
 * Created by Ilyasa Ridho
on 08,June,2021
 */
class DetailCameraViewModel  :ViewModel(){

    companion object {
        private val TAG = DetailCameraViewModel::class.java.simpleName
    }
    private val _isLoading = MutableLiveData<Boolean>()

    fun postReport(name:String,complaint:String,place:String,image:String) {

        val report = Report(name, complaint, place, image)

        val client = ApiConfig.getApiSevice().postReport(report)
        client.enqueue(object : Callback<ReportResponse> {
            override fun onResponse(
                call: Call<ReportResponse>,
                response: Response<ReportResponse>
            ) {
                _isLoading.value = false

                if (response.isSuccessful) {
                    response.body().toString()
                    response.body()?.reportResponse

                } else {
                    Log.e(TAG, "onfailure : ${response.message()}")
                }
            }


            override fun onFailure(call: Call<ReportResponse>, t: Throwable) {

                _isLoading.value = false
                Log.e(TAG, "onfailure , ${t.message.toString()}")
            }

        })
    }


}