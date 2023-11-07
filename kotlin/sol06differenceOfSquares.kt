// MIT License
// Copyright (c) 2023 Gillar Prasatya

class Squares(private val n: Int) {
    // A class to perform calculations related to sums and squares
    
    fun sumOfSquares(): Int {
        // Calculate the sum of squares for the range [1, n]
        return (1..n).sumBy { it * it }
    }

    fun squareOfSum(): Int {
        // Calculate the square of the sum for the range [1, n]
        val sum = (1..n).sum()
        return sum * sum
    }

    fun difference(): Int {
        // Calculate the difference between squareOfSum and sumOfSquares
        return squareOfSum() - sumOfSquares()
    }
}

fun main() {
    val n = 10 // Replace with the appropriate value of N
    val squares = Squares(n)
    val result = squares.difference()
    println(result)
}
