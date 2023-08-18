package bcaSyllabus

fun main() {
//area circle, sq, rect, triange
    print("Enter Radius of Circle: ")
    val radius = readln().toDouble()
    print("The area of circle with radius $radius is ${Math.PI * radius * radius}\n")

    print("Enter Side of Sq: ")
    val side = readln().toDouble()
    print("The area of sq with side $side is ${side * side}\n")

    print("Enter Length of Rectangle: ")
    val length = readln().toDouble()
    print("Enter Breadth of Rectangle: ")
    val breadth = readln().toDouble()
    print("The area of rectangle with dimensions $length x $breadth is ${length * breadth}")
}