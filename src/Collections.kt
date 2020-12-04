fun main() {
    println("#### arrays ######")
    val interestingThings = arrayOf("Kotlin", "Java", "Programming")
    println(interestingThings.size)
    println(interestingThings[0])
    println(interestingThings.get(0))
    // foreach -> higher order function
    interestingThings.forEach { interestingThing -> println(interestingThing) }
    interestingThings.forEachIndexed{
        index, interestingThing -> println("$interestingThing is at $index")
    }
    println("#### list ######")
    val interestingThings4 = listOf("Kotlin", "Java", "Programming")
    interestingThings4.forEach { interestingThing -> println(interestingThing) }
    interestingThings4.forEachIndexed{
            index, interestingThing -> println("$interestingThing is at $index")
    }

    println("#### mutable List ######")
    val interestingThings2 = mutableListOf("Kotlin", "Java", "Programming")
    interestingThings2.add("Language")
    interestingThings2.forEach { interestingThing -> println(interestingThing) }
    interestingThings2.forEachIndexed{
        index, interestingThing -> println("$interestingThing is at $index")
    }

    println("#### maps ######")
    val interestingThings3 = mapOf(1 to "one", 2 to "two", 3 to "three")
    interestingThings3.forEach { key, value ->
        println("$key -> $value")
    }
}