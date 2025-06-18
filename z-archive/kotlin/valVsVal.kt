class Student(var name: String, var age: Int) {
    fun printDetails() {
        println("$name, $age years old")
    }
}
fun main() {
    var x = 12
    var y= 13

    print(x/y.toDouble())
}