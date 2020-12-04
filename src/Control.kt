fun main() {
    // Traditional usage
    val a = 2
    val b = 5
    var max1 = a
    if (a < b) max1 = b
    println(max1)

// With else
    val max2: Int
    if (a > b) {
        max2 = a
    } else {
        max2 = b
    }
    println(max2)

// As expression
   val max3 = if (a > b) a else b

    println(max3)

    val x = 3
    when (x) {
        1,3 -> print("x == 1 or 3")
        2 -> print("x == 2")
        in 4..8 -> println("4 to 8")
        else -> {
            print("x is neither 1 nor 2 nor 3")
        }
    }
}