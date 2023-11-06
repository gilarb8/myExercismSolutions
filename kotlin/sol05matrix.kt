/*
MIT License

Copyright (c) 2023 Gillar Prasatya

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.*/

class Matrix(private val matrixAsString: String) {
    private val matrix: List<List<Int>>

    // Initialize the matrix based on the input string.
    init {
        matrix = matrixAsString.lines().map { row ->
            // Split each line by spaces and convert non-null elements to integers.
            row.split(" ").mapNotNull { it.toIntOrNull() }
        }
    }

    // Get a specific row of the matrix.
    fun row(rowNr: Int): List<Int> {
        // Check the row if number is within bounds (1 to the number of rows).
        require(rowNr in 1..matrix.size) { "Row number is out of bounds" }
        // Return the specified row (adjusted for 0-based indexing).
        return matrix[rowNr - 1]
    }

    // Get a specific column of the matrix.
    fun column(colNr: Int): List<Int> {
        // Check the matrix if it's not empty.
        require(matrix.isNotEmpty()) { "Matrix is empty" }
        // Check the column number if it's within bounds (1 to the number of columns).
        require(colNr in 1..matrix[0].size) { "Column number is out of bounds" }
        // Return the specified column (adjusted for 0-based indexing, it's not lua with 1-based indexing).
        return matrix.map { it[colNr - 1] }
    }
}

