fun main() {
    val likes = 101
    val lastNumber = likes % 10

    val result = if (lastNumber == 1) "человеку" else "людям"
    println("Понравилось $likes $result")

}