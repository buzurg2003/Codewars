package practise_and_repeat.kotlin.abbreviate_a_two_word_name

fun abbrevName(nameAndSirname: String): String {
    // Split the name into two words
    val words = nameAndSirname.split(" ")

    // Initialize variables to store the initials
    var firstInitial = ""
    var secondInitial = ""

    // Check if there are at least two words
    if (words.size >= 2) {
        // Get the first letter of the first word and capitalize it
        firstInitial = words[0][0].toString().toUpperCase()

        // Get the first letter of the second word and capitalize it
        secondInitial = words[1][0].toString().toUpperCase()
    }

    // Combine the initials with a dot and return
    return "$firstInitial.$secondInitial"
}