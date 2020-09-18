package com.example.myapplication
import kotlin.math.*

fun main() {
    var Resolve = solveEquation(3 , 4, 2)
    print(Resolve)
}

fun solveEquation(a: Int, b: Int, c: Int): Double {
    var b = b.toDouble()
    val D = b.pow(2.0) - (4 * a * c)
    var x1: Double = (-b - sqrt(D))/(2 * a)
    var x2: Double = (-b + sqrt(D))/(2 * a)

    return(x1 + x2)
}