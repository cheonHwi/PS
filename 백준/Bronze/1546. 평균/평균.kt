import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val target = DoubleArray(n) {sc.nextDouble()}

    var max = 0.0
    var total = 0.0

    for(i in target.indices){
        if(target[i] > max) max = target[i]
    }

    for(i in target.indices){
        total += target[i]/max*100
    }

    println(total/n)
}