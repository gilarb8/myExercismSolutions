// MIT License
// Copyright (c) 2023 Gillar Ajie Prasatya

// Object to handle flattening nested collections
object Flattener {
    // Function to flatten a nested collection and filter out null values
    fun flatten(source: Collection<Any?>): List<Any> =
        // Using flatMap to transform and flatten the elements of the source collection
        source.flatMap {
            // When expression to handle different cases: collection, null, or a single value
            when (it) {
                // If the element is a collection, recursively flatten it and filter out null values
                is Collection<*> -> flatten(it.filterNotNull())
                // If the element is null, return an empty list
                null -> emptyList()
                // If the element is a single value, wrap it in a list
                else -> listOf(it)
            }
        }
}
