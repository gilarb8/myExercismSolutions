// MIT License
// Copyright (c) 2023 Gillar Prasatya

data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(private val input: List<List<Int>>) {
    // Define the set of saddle points lazily.
    val saddlePoints: Set<MatrixCoordinate> by lazy {
        // Calculate the maximum values for each row and handle null with default value 0.
        val rowMax = input.map { row -> row.maxOrNull() ?: 0 }
        
        // Calculate the minimum values for each column and handle null with default value 0.
        val colMin = input.transpose().map { col -> col.minOrNull() ?: 0 }

        // Initialize an empty set to store saddle points.
        val saddlePoints = mutableSetOf<MatrixCoordinate>()

        // Iterate through the matrix.
        for (rowIndex in input.indices) {
            for (colIndex in input[rowIndex].indices) {
                val value = input[rowIndex][colIndex]
                val isRowMax = value == rowMax[rowIndex]
                val isColMin = value == colMin[colIndex]

                // Check if the current point is a saddle point and add it to the set if it is.
                if (isRowMax && isColMin) {
                    saddlePoints.add(MatrixCoordinate(rowIndex + 1, colIndex + 1))
                }
            }
        }

        // Return the set of saddle points.
        saddlePoints
    }

    // Define a helper function to transpose the matrix.
    private fun List<List<Int>>.transpose() =
        if (isEmpty() || this[0].isEmpty()) emptyList()
        else this[0].indices.map { col -> map { it[col] } }
}
