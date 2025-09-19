import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val array = IntArray(n) { sc.nextInt() }
    val target = sc.nextInt()

    var answer = 0

    for(i in array.indices) {
        if(array[i] == target) answer++
    }
    print(answer)
}