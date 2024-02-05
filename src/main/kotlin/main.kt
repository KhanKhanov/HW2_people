fun main() {
    val likes = 111
    val lastNumber = likes % 10
    val secondNumber = likes % 100

    val result = if (lastNumber == 1 && secondNumber != 11)  "человеку"  else "людям"
    println("Понравилось $likes $result")

}