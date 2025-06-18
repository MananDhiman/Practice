package bcaSyllabus

fun main() {
//    + - * /
    print("Enter First Number:")
    val num1: Int = readln().toInt()
    print("Enter Second Number:")
    val num2: Int = readln().toInt()

    println("The sum of $num1 and $num2 is ${num1 + num2}")
    println("The difference of $num1 and $num2 is ${num1 - num2}")
    println("The product of $num1 and $num2 is ${num1 * num2}")
    println("The quotient of $num1 and $num2 is ${num1 / num2}")
}
