fun main() {
    fun part1(pairs: List<String>): Int =
        pairs.map { pair -> pair.split(",", "-").map { it.toInt() } }.count { (first, second, third, fourth) ->
            first >= third && second <= fourth || first <= third && second >= fourth
        }

    fun part2(pairs: List<String>): Int =
        pairs.map { pair -> pair.split(",", "-").map { it.toInt() } }.count { (first, second, third, fourth) ->
            first <= fourth && second >= third
        }

    val input = readInput("Day04")
    println(part1(input))
    println(part2(input))
}





