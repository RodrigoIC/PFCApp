package net.proyecto.pruebasproyecto.infraestructure.api

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WebAccess {
    val apiService : ApiService by lazy {

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl("http://10.0.2.2:5000/api/")
            .build()

        return@lazy retrofit.create(ApiService::class.java)
    }
}