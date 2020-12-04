// Inheritance: use open to allow inheritance
open class Tiger(val origin: String) {
    open fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
    fun sayHello(str: String) {
        println("A tiger from $str also says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia") {
    override fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
    tiger.sayHello("Bengal")
}