package challanges.chapter2

fun main() {
    println("The hero announces her presence to the world.")

    val heroName = "Madrigal"
    println(heroName)
    var playerLevel = 4
    println(playerLevel)

    println("The hero embarks on her journey to locate the enchanted sword.")
    playerLevel += 1
    println(playerLevel)

    var hasSteed = "Madrigal do not have a Dragon or Minotaur to ride yet."
    println(hasSteed)

    val pubName = "The Unicorn's Horn"
    val publicanName = "Aetnir"
    println("$heroName arrives to $pubName")
    println("$publicanName asks: \"Do you need to stable a steed?\"")
    var heroGold = 50
    println("\"No,\" $heroName replies, \"I have no stee. But i do have $heroGold gold, and i would like a drink.\"")
    val menuOfDrinks = mutableListOf("mead", "wine", "LaCroix")
    println("\"Excellent,\" says $publicanName. \" I have $menuOfDrinks. What will you have?\"")
}