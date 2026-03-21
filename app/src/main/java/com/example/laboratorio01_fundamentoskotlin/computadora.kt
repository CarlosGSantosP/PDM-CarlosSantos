package com.example.laboratorio01_fundamentoskotlin

import android.util.Log
class computadora(
    var ram: Int,
    var almacenamiento: Int,
    var sistemasOperativo: String,
    var programasInstalados: List <String>
){
    fun encenderComputadora(){
        Log.d("PRUEBA", "Computadora encendida")
    }

    fun apagarComputadora() {
        Log.d("PRUEBA", "Computadora encendida")
    }

    fun actualizar(nuevaRam: Int, nuevoAlma: Int, nuevoSO: String){
        ram = nuevaRam
        almacenamiento = nuevoAlma
        sistemasOperativo = nuevoSO
        Log.d("PRUEBA", "Computadora actualizada")
    }

    fun obtenerProgramas(): List<String> {
        return programasInstalados.filter { it.contains(other = "2026") }
    }
}
