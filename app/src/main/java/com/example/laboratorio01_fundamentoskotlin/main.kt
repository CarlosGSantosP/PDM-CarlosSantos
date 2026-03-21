package com.example.laboratorio01_fundamentoskotlin

import android.util.Log

fun main() {
    val programas = listOf("Notion 2026", "Facebook 2024", "Spotify 2026", "Chrome 2026")

    val compu = computadora(
        ram = 16,
        almacenamiento = 256,
        sistemasOperativo = "Windows",
        programasInstalados = programas
    )

    compu.encenderComputadora()

    println("--- Datos iniciales ---")
    println("RAM: ${compu.ram} GB")
    println("Almacenamiento: ${compu.almacenamiento} GB")
    println("Sistema Operativo: ${compu.sistemasOperativo}")
    println("Programas del 2026: ${compu.obtenerProgramas()}")

    compu.actualizar(nuevaRam = 32, nuevoAlma = 512, nuevoSO = "Ubuntu")
    println("--- Después de actualizar ---")
    println("Nueva RAM: ${compu.ram} GB")
    println("Nuevo Almacenamiento: ${compu.almacenamiento} GB")
    println("Nuevo SO: ${compu.sistemasOperativo}")

    compu.apagarComputadora()
}