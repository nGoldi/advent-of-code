fun main() {

    fun part1(input: List<String>): Int {
        return input.fold(mutableListOf(0)) { acc, s ->
            when (s) {
                "A Y" -> acc[acc.lastIndex] = 6 + 2 + acc.last()
                "A X" -> acc[acc.lastIndex] = 3 + 1 + acc.last()
                "A Z" -> acc[acc.lastIndex] = 0 + 3 + acc.last()
                "B Y" -> acc[acc.lastIndex] = 3 + 2 + acc.last()
                "B X" -> acc[acc.lastIndex] = 0 + 1 + acc.last()
                "B Z" -> acc[acc.lastIndex] = 6 + 3 + acc.last()
                "C Y" -> acc[acc.lastIndex] = 0 + 2 + acc.last()
                "C X" -> acc[acc.lastIndex] = 6 + 1 + acc.last()
                "C Z" -> acc[acc.lastIndex] = 3 + 3 + acc.last()
                else -> acc.add(0)
            }
            acc
        }.sum()
    }

    fun part2(input: List<String>): Int {
        return input.fold(mutableListOf(0)) { acc, s ->
            when (s) {
                "A X" -> acc[acc.lastIndex] = 0 + 3 + acc.last()
                "A Y" -> acc[acc.lastIndex] = 3 + 1 + acc.last()
                "A Z" -> acc[acc.lastIndex] = 6 + 2 + acc.last()
                "B X" -> acc[acc.lastIndex] = 0 + 1 + acc.last()
                "B Y" -> acc[acc.lastIndex] = 3 + 2 + acc.last()
                "B Z" -> acc[acc.lastIndex] = 6 + 3 + acc.last()
                "C X" -> acc[acc.lastIndex] = 0 + 2 + acc.last()
                "C Y" -> acc[acc.lastIndex] = 3 + 3 + acc.last()
                "C Z" -> acc[acc.lastIndex] = 6 + 1 + acc.last()
                else -> acc.add(0)
            }
            acc
        }.sum()
    }

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
