var heroName = ""

fun main() {


    heroName = prompHeroName()

    // changeNarratorMood()
    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")
    visitTavern()
}

private fun prompHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?") { message ->
//        Prints the message in yellow
        "\u001b[33;1m$message\u001b[0m"
    }
/*    val input = readLine()
    require(heroName != null && heroName.isNotEmpty()) {
        "The hero must have a name."
    }

    return input
*/
    println("Madrigal")
    return "Madrigal"
}


fun createTitle(name: String): String {
    return when {
        name.all { it.isDigit() } -> "The Identifiable"
        name.none { it.isLetter() } -> "The Witness Protection Member"
        name.count { it.lowercase() in "aeiou" } > 4
        -> "The Master of Vowels"
        else -> "The Renowed Hero"
    }

}
