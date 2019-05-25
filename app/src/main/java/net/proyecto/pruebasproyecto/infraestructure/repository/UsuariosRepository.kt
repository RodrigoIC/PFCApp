package net.proyecto.pruebasproyecto.infraestructure.repository

import android.app.Application
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import net.proyecto.pruebasproyecto.infraestructure.api.ApiService
import net.proyecto.pruebasproyecto.infraestructure.api.WebAccess
import net.proyecto.pruebasproyecto.models.Usuario

class UsuariosRepository {
    val service = WebAccess.apiService

    suspend fun getUsuarioByNombre(nombre: String): Usuario?{
        var usuario: Usuario? = null
        val webResponse = service.getUsuarioByNombre(nombre).await()
        if(webResponse.isSuccessful){
            usuario = webResponse.body()!!.usuario
        }

        return usuario
    }
}