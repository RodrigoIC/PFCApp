package net.proyecto.pruebasproyecto.views

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*
import net.proyecto.pruebasproyecto.R
import net.proyecto.pruebasproyecto.models.Usuario
import net.proyecto.pruebasproyecto.viewmodels.UsuariosViewModel
import org.jetbrains.anko.toast

class LoginActivity : AppCompatActivity() {
    private lateinit var usuariosViewModel: UsuariosViewModel
    private var usuario: Usuario? = null
    private lateinit var txtUsuario: String
    private lateinit var txtPassword: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        usuariosViewModel = ViewModelProviders.of(this).get(UsuariosViewModel::class.java)
    }

    fun onClickBtnLoginLogin(view: View){
        if (validarDatos()){
            usuario = usuariosViewModel.getUsuarioByNombre(txtUsuario)
            if (usuario != null){
                val intent = Intent(this, PruebaActivity::class.java)
                intent.putExtra("usuario", usuario)
                startActivity(intent)
            }else{
                toast("Usuario o contraseña incorrectos")
            }
        }
    }

    private fun validarDatos(): Boolean {
        txtUsuario = etLoginUser.text.toString()
        txtPassword = etLoginPassword.text.toString()

        if (txtUsuario.isNullOrEmpty()){
            toast("El campo usuario no puede estar vacío")
            return false
        }else if (txtUsuario.length > 20){
            toast("El campo usuario no puede tener más de 20 caracteres")
            return false
        }
        if (txtPassword.isNullOrEmpty()){
            toast("El campo contraseña no puede estar vacío")
            return false
        }

        return true
    }

    fun onClickTvLoginToSignUp(view: View){
        toast("Función sin añadir")
    }
}
