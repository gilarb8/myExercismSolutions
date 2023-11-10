// MIT License
// Copyright (c) 2023 Gillar Ajie Prasatya

// Object to handle word counting in a given input string
object WordCount {
    
    // Function to count the occurrences of each word in the input string
    fun phrase(input: String) = input.lowercase().words().groupingBy { it }.eachCount()
    
    // Private extension function to extract words from a string using regex
    private fun String.words() = Regex("""\w+('?\w)*""").findAll(this).map { it.value }
}
