package com.raghav.multipartexample.network

import android.media.Image
import com.raghav.multipartexample.Country
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*
import java.lang.reflect.Array

interface APIService {

    @GET("/getCountries")
    fun getCountries():Call<List<Country>>


    @Multipart
    @POST("/addCountry")
    fun addCountry(@Part images: List<MultipartBody.Part>,@Part("country") country:RequestBody):Call<String>

    @Multipart
    @POST("/addImage")
    fun addImage(@Part images: MultipartBody.Part,@Part("name") name:String):Call<String>

    @Multipart
    @POST("/addImages")
    fun addImages(@Part images: List<MultipartBody.Part>):Call<String>


//    @GET("/download/{image}")
//    fun getImage(@Query("image")):Call<Multipart>
}