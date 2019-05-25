package net.proyecto.pruebasproyecto.viewmodels

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import net.proyecto.pruebasproyecto.infraestructure.repository.UsuariosRepository
import net.proyecto.pruebasproyecto.models.Usuario

class UsuariosViewModel: ViewModel() {
    private var repository: UsuariosRepository = UsuariosRepository()

    fun getUsuarioByNombre(nombre: String): Usuario?{
        var usuario: Usuario? = null
        GlobalScope.launch(Dispatchers.IO) {
            usuario = repository.getUsuarioByNombre(nombre)
        }

        return usuario
    }
}