package com.example.third_homework

fun main() {
    print("Введите число и нажмите кнопку Enter:")
    var KeyboardNumber: Int = readLine()?.toIntOrNull() ?: return
    println(KeyboardNumber)
    println("Введите число и нажмите кнопку Enter, повторите 5 раз:")
    var ArrayOfPositives: Array<Int> = Array(5, {0})
    val KeyRange = 1..5
    var counter = 0
    for (i in KeyRange) {
        var i: Int = readLine()?.toIntOrNull() ?: continue
        if (i > 0) {
            ArrayOfPositives[counter] = i
        }
        counter++
    }
    print(ArrayOfPositives)
}
