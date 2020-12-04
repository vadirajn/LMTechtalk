fun main() {
    val a = "Kotlin"
    val b: String? = null
    //1. Safe call (?.) : returns the length or else null value
    println(b?.length)
    //println(a.length)
    //2. Safe call with let: executes only if value is not null
    b?.let {
        println(b.length)
    }
    //2. Elvis operator (?:) similar to ternary operator in java
    val elvisOp = b?.length ?: -1
    println(elvisOp)
    //3. not-null assertion operator, throws npe if value is null
    val nonNullOp = b!!.length
    println(nonNullOp)
}