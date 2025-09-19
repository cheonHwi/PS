fun main() {
    val target = readln()

    val alphabetList = IntArray(26) { -1 }

    for (i in target.indices){
        val idx = target[i].code - 97
        if(alphabetList[idx] == -1) alphabetList[idx] = i
    }

    for (alphabet in alphabetList) {
        print("$alphabet ")
    }
}