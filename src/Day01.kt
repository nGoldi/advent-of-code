fun main() {

    fun part1(input: List<String>, count: Int): Int {
        return input.fold(mutableListOf(0)) { acc, s ->
            when {
                s.isNotBlank() -> acc[acc.lastIndex] = s.toInt() + acc.last()
                else -> acc.add(0)
            }
            acc
        }
            .sortedDescending()
            .take(count)
            .sum()
    }

    val input = readInput("Day01")
    println(part1(input, 1))
    println(part1(input, 3))
}
