import kotlin.random.Random
import kotlin.random.nextInt

var narrationModifier: (String) -> String = { it }

//val narrationModifier = { message: String ->                  //3
//val narrationModifier: (String) -> String = {                 //2
//val narrationModifier: (String) -> String = {   message ->    //1
//val numExclamationPoints = 3
//    message.uppercase() + "!".repeat(numExclamationPoints)    //1
//    it.uppercase() + "!".repeat(numExclamationPoints)         //2
//message.uppercase() + "!".repeat(numExclamationPoints)    //3
//}

inline fun narrate(
    message: String,
    modifier: (String) -> String = { narrationModifier(it) }
) {
    println(modifier(message))
}

fun changeNarratorMood() {
    val mood: String
    val modifier: (String) -> String

    when (Random.nextInt(1..4)) {
        1 -> {
            mood = "loud"
            modifier = { message ->
                val numExclamationPoints = 3
                message.uppercase() + "!".repeat(numExclamationPoints)
            }
        }
        2 -> {
            mood = "tired"
            modifier = { message ->
                message.lowercase().replace(" ", "... ")
            }
        }
        3 -> {
            mood = "unsure"
            modifier = { message ->
                "$message?"
            }
        }
        else -> {
            mood = "professional"
            modifier = { message ->
                "$message."
            }
        }

    }
    narrationModifier = modifier
    narrate("The narrator begins to feel $mood")
}
