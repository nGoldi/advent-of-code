fun main() {
    val input = readInput("Day03")
    println(part1(input))
    println(part2(input))
}



private fun calculatePriority(char: Char): Int {
    return if (char.code >= 92) {
        char.code - 96
    } else {
        char.code - 38
    }
}

private fun calculatePriority(backpacks: List<String>): Int {
    return calculatePriority(backpacks.map { it.toCharArray().toSet() }.reduce { acc, backpack -> backpack.intersect(acc) }.first())
}

private fun part1(backpacks: List<String>): Int {
    return backpacks.sumOf { calculatePriority(it.chunked(it.length / 2)) }
}

private fun part2(backpacks: List<String>): Int {
    return backpacks.windowed(3, step = 3).sumOf { calculatePriority(it) }
}


