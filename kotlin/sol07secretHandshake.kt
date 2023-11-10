// MIT License
// Copyright (c) 2023 Gillar Ajie Prasatya

object HandshakeCalculator {
    // A utility for calculating secret handshakes based on a given number

    fun calculateHandshake(number: Int): List<Signal> {
        // Convert the number to binary and reverse the binary string
        val binaryString = number.toString(2).reversed()
        val handshake = mutableListOf<Signal>()

        // Check the rightmost digit (bit 0) of the binary string and add corresponding actions
        if (binaryString.length >= 1 && binaryString[0] == '1') {
            handshake.add(Signal.WINK)
        }

        // Check the second rightmost digit (bit 1) and add the double-blink action
        if (binaryString.length >= 2 && binaryString[1] == '1') {
            handshake.add(Signal.DOUBLE_BLINK)
        }

        // Check the third rightmost digit (bit 2) and add the close-your-eyes action
        if (binaryString.length >= 3 && binaryString[2] == '1') {
            handshake.add(Signal.CLOSE_YOUR_EYES)
        }

        // Check the fourth rightmost digit (bit 3) and add the jump action
        if (binaryString.length >= 4 && binaryString[3] == '1') {
            handshake.add(Signal.JUMP)
        }

        // Check the fifth rightmost digit (bit 4) and reverse the order of actions if it's '1'
        if (binaryString.length >= 5 && binaryString[4] == '1') {
            handshake.reverse()
        }

        return handshake
    }
}

fun main() {
    // Example usage
    val handshake = HandshakeCalculator.calculateHandshake(9)
    println(handshake)
}
