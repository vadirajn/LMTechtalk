fun main() {
    for(i in 0 until 3) {
        print(i)
    }
    println(" ")

    for(i in 2..8 step 2) {
        print(i)
    }
    println(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    println(" ")

    for (c in 'a'..'d') {
        print(c)
    }
    println(" ")

    for (c in 'z' downTo 's' step 2) {
        print(c)
    }
    println(" ")
}