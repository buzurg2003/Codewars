package rank_up.kotlin_pl.lottery_ticket

fun main() {
    val ticket = listOf(Pair("ABC", 65), Pair("HGR", 74), Pair("BYHT", 74))
    val win = 2
    val result = bingo(ticket.toTypedArray(), win)
    println(result) // Output: "Loser!"
}
