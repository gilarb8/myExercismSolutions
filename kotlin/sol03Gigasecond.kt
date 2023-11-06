/*
[MIT License](/myExercismSolutions/LICENSE)

Copyright (c) [2023] [Gillar Ajie Prasatya]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

*/

import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Month

class Gigasecond @JvmOverloads constructor(birthDateTime: LocalDateTime = LocalDateTime.of(1970, 1, 1, 0, 0)) {
    // Secondary constructor to accept a LocalDate and convert it to LocalDateTime at midnight.
    constructor(birthDate: LocalDate) : this(birthDate.atStartOfDay())

    // The date property stores the result of adding one gigasecond to the provided birth date and time.
    val date: LocalDateTime = birthDateTime.plusSeconds(1_000_000_000)
}

fun main() {
    // usage in the main function.
    val birthDate = LocalDate.of(2011, Month.APRIL, 25)
    val gigaSecondDate = Gigasecond(birthDate).date
    println("Date and time one gigasecond after birth: $gigaSecondDate")
}
