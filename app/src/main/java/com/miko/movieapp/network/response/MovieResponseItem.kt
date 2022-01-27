package com.miko.movieapp.network.response

import com.google.gson.annotations.SerializedName

data class MovieResponseItem(
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?
)
