fun main() {
    val start = System.currentTimeMillis()
    Greeter.sayHello("my friend")
    println(System.currentTimeMillis() - start)
}