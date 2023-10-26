package rank_up.kotlin_pl.counting_dublicates

fun duplicateCount(input: String): Int {
    val charCount = mutableMapOf<Char, Int>()

    // Convert the input string to lowercase to make it case-insensitive
    val lowercasedInput = input.toLowerCase()

    // Iterate through the characters in the lowercased input
    for (char in lowercasedInput) {
        if (char.isLetterOrDigit()) {
            charCount[char] = charCount.getOrDefault(char, 0) + 1
        }
    }

    // Count the characters that occur more than once
    var duplicateCount = 0
    for ((_, count) in charCount) {
        if (count > 1) {
            duplicateCount++
        }
    }

    return duplicateCount
}

