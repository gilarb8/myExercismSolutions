// MIT License
// Copyright (c) 2023 Gillar Prasatya

object Hamming {
    // Compute the Hamming Distance between two DNA strands.
    fun compute(leftStrand: String, rightStrand: String): Int {
        // Check if the left and right strands have the same length.
        if (leftStrand.length != rightStrand.length) {
            // If they have different lengths, throw an IllegalArgumentException with a specific message.
            throw IllegalArgumentException("left and right strands must be of equal length")
        }

        var distance = 0 // Initialize the Hamming Distance to 0.

        // Iterate through the characters of the strands using an index.
        for (i in leftStrand.indices) {
            // Compare the characters at the same index in both strands.
            if (leftStrand[i] != rightStrand[i]) {
                // If characters are different, increment the distance counter.
                distance++
            }
        }

        return distance
    }
}
