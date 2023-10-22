package rank_up.kotlin_pl.lottery_ticket

fun bingo(ticket: Array<Pair<String, Int>>, win: Int): String {
    // Initialize a variable to keep track of mini-wins
    var miniWins = 0

    // Iterate through each subarray in the ticket
    for (subarray in ticket) {
        val (str, num) = subarray

        // Check each character in the string for a mini-win
        for (char in str) {
            if (char.toInt() == num) {
                miniWins++
                // Break once a mini-win is found in the subarray
                break
            }
        }
    }

    // Compare the total mini-wins with the win value and return the result
    return if (miniWins >= win) "Winner!" else "Loser!"
}