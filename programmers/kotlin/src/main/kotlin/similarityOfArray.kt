// 배열의 유사도


// ["a", "b", "c"]	["com", "b", "d", "p", "c"]	2
// ["n", "omg"]	["m", "dot"]

fun solution(s1: Array<String>, s2: Array<String>): Int {
    var answer = 0
    s1.forEach {
        s2.forEach { s2 ->
            if(it == s2) answer++
        }
    }
    return answer
}

fun main() {
    val s1 = arrayOf("a", "b", "c")
    val s2 = arrayOf("com", "b", "d", "p", "c")

    println(solution(s1, s2))

}