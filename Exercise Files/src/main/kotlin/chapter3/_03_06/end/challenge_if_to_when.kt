package chapter3._03_06.end

fun main() {
    var cardPoints: Int = 7_000

    val cardLevel: String = when(cardPoints) {
        in 0..999 -> "pearl"
        in 1_000..4_999 -> "silver"
        in 5_000..9_999 -> "gold"
        else -> "platinum"
    }

    val plural = if(cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}
