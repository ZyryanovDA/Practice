package com.example.myapplication
import kotlin.math.*

fun main() {
    var Resolve = solveEquation(2, 3, 1)
    print(Resolve)
}

fun solveEquation(a: Int, b: Int, c: Int): Double {
    var b = b.toDouble()
    val D = b.pow(2.0) - (4 * a * c)
    var x1: Double = 0.0
    var x2: Double = 0.0
    if (D > 0) {
        x1 = (-b - sqrt(D))/(2 * a)
        x2 = (-b + sqrt(D))/(2 * a)
    } else {
        println("D <= 0")
    }
    return(x1 + x2)
}
