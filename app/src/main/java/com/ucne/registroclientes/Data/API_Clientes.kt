package com.ucne.registroclientes.Data

import android.telecom.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface API_Clientes{
    @GET("ClientesController")
    suspend fun GetList(): List<ClientesDTO>

    @GET("ClientesController/{id}")
    suspend fun GetClientes(@Path("id") id: Int): ClientesDTO

    /*@POST("Clientes")
    fun postClientes(@Body clientesDTO: ClientesDTO): Call<Void>*/

}