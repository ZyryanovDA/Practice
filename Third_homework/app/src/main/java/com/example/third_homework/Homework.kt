package com.example.third_homework

fun main() {
    print("Введите число и нажмите кнопку Enter:")
    val KeyboardNumber: Int = readLine()?.toIntOrNull() ?: return
    println(KeyboardNumber)
    println("Введите число и нажмите кнопку Enter, повторите 6 раз:")
    val ArrayOfPositives: Array<Int> = Array(6, {0})
    var counter = 0
    val Lenght = ArrayOfPositives.size
    for (i in 0..Lenght) {
        val i: Int = readLine()?.toIntOrNull() ?: continue
        if (i > 0) {
            ArrayOfPositives[counter] = i
            counter++
        }
    }

    for (x in 0..Lenght) {
        println(ArrayOfPositives[x])
    }

}
