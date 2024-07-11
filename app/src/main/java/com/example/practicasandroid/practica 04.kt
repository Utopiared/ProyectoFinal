package com.example.practicasandroid

fun main (){

    print("Ingrese su peso:")
    val pesoEnKg = readln().toDouble()

    print ("Ingresa su altura:")
    val alturaEnMetros = readln().toDouble()

    val imc = pesoEnKg / (alturaEnMetros * alturaEnMetros)

    if (imc < 70 && alturaEnMetros <1.50) {
        print("estás bien")
    }
    else {
        print("estás gordo")
    }
}