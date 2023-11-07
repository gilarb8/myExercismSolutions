// MIT License
// Copyright (c) 2023 Gillar Prasatya

class Triangle<out T : Number>(val a: T, val b: T, val c: T) {
    // Triangle class representing a geometric triangle with sides a, b, and c.

    init {
        // Ensure that the triangle is valid when it's created
        require(isValidTriangle()) { "Invalid triangle: Sum of any two sides must be greater than or equal to the length of the third side, and all sides must be greater than 0." }
    }

    val isEquilateral: Boolean = a == b && b == c
    val isIsosceles: Boolean = a == b || b == c || a == c
    val isScalene: Boolean = !isIsosceles

    private fun isValidTriangle(): Boolean {
        // Check if the sides form a valid triangle according to the triangle inequality
        return a.toDouble() > 0 && b.toDouble() > 0 && c.toDouble() > 0 &&
                (a.toDouble() + b.toDouble() >= c.toDouble()) &&
                (a.toDouble() + c.toDouble() >= b.toDouble()) &&
                (b.toDouble() + c.toDouble() >= a.toDouble())
    }
}

fun main() {
    // Example usage and output
    val triangle = Triangle(3, 3, 3)
    println(triangle.isEquilateral) // Output: true
    println(triangle.isIsosceles)   // Output: true
    println(triangle.isScalene)     // Output: false
}
