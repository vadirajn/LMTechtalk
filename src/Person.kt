class Person(val firstName:String, val lastName:String) {
    //During an instance initialization, the initializer blocks are executed n bfore secondary constructor
    init {
        println("init 1")
    }

    constructor() : this("Peter", "Parker") {
        println("Secondary constructor")
    }

    init {
        println("init 2")
    }
}