interface InfoProvider {
    fun printInfo(): String
}

class BasicInfoProvider : InfoProvider {
    // overide modifier
    override fun printInfo(): String {
        return "Basic Info provider"
    }

}

fun main() {
    val provider = BasicInfoProvider()
    println(provider.printInfo())
}