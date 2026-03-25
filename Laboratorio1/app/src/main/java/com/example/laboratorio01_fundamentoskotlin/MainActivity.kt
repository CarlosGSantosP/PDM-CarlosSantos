package com.example.laboratorio01_fundamentoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val programas = listOf("Notion 2026", "Facebook 2024", "Spotify 2026", "Chrome 2026")

        val compu = computadora(
            ram = 16,
            almacenamiento = 256,
            sistemasOperativo = "Windows",
            programasInstalados = programas
        )

        // Encender
        compu.encenderComputadora()

        // Datos iniciales
        Log.d("PRUEBA", "--- Datos iniciales ---")
        Log.d("PRUEBA", "RAM: ${compu.ram} GB")
        Log.d("PRUEBA", "Almacenamiento: ${compu.almacenamiento} GB")
        Log.d("PRUEBA", "Sistema Operativo: ${compu.sistemasOperativo}")
        Log.d("PRUEBA", "Programas del 2026: ${compu.obtenerProgramas()}")

        // Actualizar
        compu.actualizar(nuevaRam = 32, nuevoAlma = 512, nuevoSO = "Ubuntu")
        Log.d("PRUEBA", "--- Después de actualizar ---")
        Log.d("PRUEBA", "Nueva RAM: ${compu.ram} GB")
        Log.d("PRUEBA", "Nuevo Almacenamiento: ${compu.almacenamiento} GB")
        Log.d("PRUEBA", "Nuevo SO: ${compu.sistemasOperativo}")

        // Apagar
        compu.apagarComputadora()

    }
}