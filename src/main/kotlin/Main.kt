fun main() {
    val start = System.currentTimeMillis()
    Greeter.sayHello("my friends")
    println(System.currentTimeMillis() - start)
}