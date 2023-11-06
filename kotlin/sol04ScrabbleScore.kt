// MIT License
// Copyright (c) 2023 Gillar Prasatya

object ScrabbleScore {
    // define a mapping of letter values using a map. each letter associated with its corresponding scrabble score.
    private val letterValues = mapOf(
        'A' to 1, 'E' to 1, 'I' to 1, 'O' to 1, 'U' to 1, 'L' to 1, 'N' to 1, 'R' to 1, 'S' to 1, 'T' to 1,
        'D' to 2, 'G' to 2,
        'B' to 3, 'C' to 3, 'M' to 3, 'P' to 3,
        'F' to 4, 'H' to 4, 'V' to 4, 'W' to 4, 'Y' to 4,
        'K' to 5,
        'J' to 8, 'X' to 8,
        'Q' to 10, 'Z' to 10
    )

    // will calculate the scrabble score for a single letter, case-insensitive.
    fun scoreLetter(c: Char): Int {
        val upperCaseChar = c.toUpperCase()
        return letterValues.getOrDefault(upperCaseChar, 0)
    }

    // will calculate the Scrabble score for a whole word by summing the scores of its individual letters.
    fun scoreWord(word: String): Int {
        return word.sumBy { scoreLetter(it) }
    }
}
