fun main() {
    val target = IntArray(10) { readln().toInt() }

    val remainder = mutableListOf<Int>()

    for(i in target.indices){
        val mod = target[i] % 42
        if(!remainder.contains(mod)){
            remainder.add(mod)
        }
    }

    println(remainder.size)
}