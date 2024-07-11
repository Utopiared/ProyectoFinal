package com.example.practicasandroid

fun main() {
    val pesoEnKg = 60.0
    val alturaEnMetros = 1.75

    val imc = pesoEnKg / (alturaEnMetros * alturaEnMetros)

    if (imc < 70) {
        print("estás bien")
    }

    else {
        print("estás gordo")
    }
    //println("Tu IMC es: %.2f".format(imc))
}