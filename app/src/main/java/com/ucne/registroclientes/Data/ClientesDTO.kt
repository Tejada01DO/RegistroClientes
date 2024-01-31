package com.ucne.registroclientes.Data

data class ClientesDTO(
    val clienteId: Int,
    val nombre: String,
    val apellido: String,
    val cedula: String,
    val telefono: String,
    val direccion: String
)