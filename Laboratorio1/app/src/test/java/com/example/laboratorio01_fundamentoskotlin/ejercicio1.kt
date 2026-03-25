package com.example.laboratorio01_fundamentoskotlin

//Ejercicio #1
class Computadora(
    var ram: Int,
    var almacenamiento: Int,
    var sistemaOperativo: String
) {
    var estaEncendida: Boolean = false
    private val programasInstalados = mutableListOf<String>()

    fun encender() {
        estaEncendida = true
        println("La computadora se está iniciando...")
    }

    fun apagar() {
        estaEncendida = false
        println("Computadora apagada.")
    }

    // Funciones de actualización
    fun actualizarRam(nuevaRam: Int) {
        this.ram = nuevaRam
        println("RAM actualizada a $ram GB.")
    }

    fun cambiarSistemaOperativo(nuevoSO: String) {
        this.sistemaOperativo = nuevoSO
        println("Sistema operativo cambiado a $sistemaOperativo.")
    }

    fun instalarPrograma(nombre: String) {
        programasInstalados.add(nombre)
    }

    // El filtro para el año 2026
    fun obtenerProgramasActuales(): List<String> {
        return programasInstalados.filter { it.contains("2026") }
    }
}

