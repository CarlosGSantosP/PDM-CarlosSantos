package com.example.lib

class computadora(
    var ram: Int,
    var almacenamiento: Int,
    var sistemasOperativo: String,
    var programasInstalados: List <String>
){
    fun encenderComputadora(){
        println("Computadora encendida")
    }

    fun apagarComputadora() {
        println("Computadora encendida")
    }

    fun actualizar(nuevaRam: Int, nuevoAlma: Int, nuevoSO: String){
        ram = nuevaRam
        almacenamiento = nuevoAlma
        sistemasOperativo = nuevoSO
        println("Computadora actualizada")
    }

    fun obtenerProgramas(): List<String> {
        return programasInstalados.filter { it.contains(other = "2026") }
    }
}
