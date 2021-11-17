fun main() {

    val gradesByStudent: MutableMap<String, Double> = mutableMapOf("Josh" to 4.0, "Alex" to 2.0, "Jane" to 3.0)
    val flipValues = gradesByStudent.entries.associate { (name, grade) -> grade to name }
    println(gradesByStudent)
    println(flipValues)
//    println("start")
//    val onethousandPrimes = generateSequence(3) { value -> value + 1 }.filter { isPrime(it) }.take(1000)
//    println(onethousandPrimes.last())

}

fun isPrime(number: Int): Boolean {
    (2 until number).map { divisor ->
        if (number % divisor == 0)
            return false
    }
    return true
}


