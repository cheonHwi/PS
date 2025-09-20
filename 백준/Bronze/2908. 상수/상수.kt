import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val firstNum = sc.next()
    val secondNum = sc.next()

    var convertedFirstNum = 0
    var convertedSecondNum = 0

    val buffer = StringBuffer()

    convertedFirstNum = buffer.append(firstNum).reverse().toString().toInt()
    buffer.setLength(0)
    convertedSecondNum = buffer.append(secondNum).reverse().toString().toInt()

    if(convertedFirstNum > convertedSecondNum) println(convertedFirstNum)
    else println(convertedSecondNum)
}