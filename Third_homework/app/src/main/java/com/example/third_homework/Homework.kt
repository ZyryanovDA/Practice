package com.example.third_homework

fun main() {
    print("Введите число и нажмите кнопку Enter:")
    var KeyboardNumber: Int = readLine()?.toIntOrNull() ?: return
    println(KeyboardNumber)
    println("Введите число и нажмите кнопку Enter, повторите 5 раз:")
    //переделай под функцию Cicles
}
fun Cicles(): Int {
    val KeyRange = 1..5
    for (i in KeyRange){
        var i: Int = readLine()?.toIntOrNull() ?: return
        if (i !is Int) continue
    }
}