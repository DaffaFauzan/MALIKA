package com.studio.malika.api

import com.google.gson.annotations.SerializedName

data class ReportResponse(

	@field:SerializedName("ReportResponse")
	val reportResponse: ArrayList<ReportResponseItem>
)

data class ReportResponseItem(

	@field:SerializedName("date")
	val date: String,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("image")
	val image: String,

	@field:SerializedName("complaint")
	val complaint: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("place")
	val place: String
)
