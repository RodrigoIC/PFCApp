package net.proyecto.pruebasproyecto.infraestructure.api

import kotlinx.coroutines.Deferred
import net.proyecto.pruebasproyecto.models.Respuesta
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    // Get de un usuario específico encontrado por el nombre.
    @GET("usuarios/{nombre}")
    fun getUsuarioByNombre(@Path("nombre") nombre: String): Deferred<Response<Respuesta>>

}