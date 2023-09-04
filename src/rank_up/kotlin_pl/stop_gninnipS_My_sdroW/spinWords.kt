package rank_up.kotlin_pl.stop_gninnipS_My_sdroW

fun spinWords(sentence: String): String {
    // Split the sentence into words
    val words = sentence.split(" ").toMutableList()

    // Iterate through words and reverse those with 5 or more letters
    for (i in words.indices) {
        if (words[i].length >= 5) {
            words[i] = words[i].reversed() // Reverse the word
        }
    }

    // Join the modified words back into a sentence
    return words.joinToString(" ")
}
