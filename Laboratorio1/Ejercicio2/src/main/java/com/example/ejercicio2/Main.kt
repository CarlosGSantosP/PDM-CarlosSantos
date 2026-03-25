package com.example.ejercicio2

fun main(){
    val calc = Calculadora(
        marca = "Apple",
        anosDeVida = 5,
        precio = 25.99
    )

    println("--- Calculadora ${calc.marca} ---")
    println("--- Años de vida: ${calc.anosDeVida} ---")
    println("--- Precio: ${calc.precio} ---")

    println("\n--- Operaciones ---")
    println("20 + 10 ${calc.sumar(a = 20.0, b = 10.0)}")
    println("20 - 10 ${calc.restar(a = 20.0, b = 10.0)}")
    println("20 * 10 ${calc.multiplicar(a = 20.0, b = 10.0)}")
    println("20 / 10 ${calc.dividir(a = 20.0, b = 10.0)}")
}