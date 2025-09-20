import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val testCase = sc.nextInt()

    for(i in 0..< testCase) {
        var idx = 0

        val repeatCnt = sc.nextInt()
        val targetStr = sc.next()


        val resultArray = CharArray(targetStr.length * repeatCnt)


        for(targetChar in targetStr) {
            for (repeat in 0..< repeatCnt) {
                resultArray[idx] = targetChar
                idx++
            }
        }


        println(String(resultArray))
    }
}