fun main () {
    var firstName: String = "Данила"
    var lastName: String = "Зырянов"
    var height: Int = 186
    var weight = 95.5f
    var isChild: Boolean = height < 150 || weight < 40
    var info: String = "Меня зовут ${firstName} ${lastName}, " +
            "мой вес составляет ${weight} килограмм, а рост ${height} " +
            "и я уже давно ${if(isChild) "ребенок" else "не ребенок"}"
    println(info)
}