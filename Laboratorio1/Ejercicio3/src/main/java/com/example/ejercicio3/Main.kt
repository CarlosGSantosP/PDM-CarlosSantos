package com.example.ejercicio3

fun main() {
    val Ciclo01 = listOf(
        Estudiante(nombre = "Carlos Santos", carnet = "00087624", asignatura = "Programación de Dispositivos Móviles"),
        Estudiante(nombre = "Fernando Guerrero", carnet = "00046724", asignatura = "Programación de Dispositivos Móviles"),
        Estudiante(nombre = "Miguel Llovera", carnet = "00032124", asignatura = "Programación de Dispositivos Móviles"),

        Estudiante(nombre = "Diego Retana", carnet = "00243124", asignatura = "Análisis Numérico"),
        Estudiante(nombre = "Gerardo Cornejo", carnet = "00179224", asignatura = "Análisis Numérico"),
        Estudiante(nombre = "Luis Balibrera", carnet = "00075624", asignatura = "Análisis Numérico"),
        Estudiante(nombre = "Anderson Gálvez", carnet = "00097824", asignatura = "Análisis Numérico")
    )

    println("--- Estudiantes en Dispositivos Móviles ---")
    val dispositivosMoviles = Ciclo01.filter {
        it.asignatura == "Programación de Dispositivos Móviles"
    }

    dispositivosMoviles.forEach {
        println("Nombre: ${it.nombre} | Carnet: ${it.carnet}")
    }

    println("\nTotal: ${dispositivosMoviles.size} estudiantes")
}