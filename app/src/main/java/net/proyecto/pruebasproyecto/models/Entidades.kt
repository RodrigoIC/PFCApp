package net.proyecto.pruebasproyecto.models

import java.io.Serializable

data class Respuesta(
    val usuario: Usuario,
    val usuarios: List<Usuario>)

data class Usuario(
    var uid: String,
    var telefono: String,
    var nombre: String,
    var avatar: String,
    var password: String): Serializable