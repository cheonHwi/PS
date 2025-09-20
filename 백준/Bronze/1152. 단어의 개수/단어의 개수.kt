fun main() {
    val targetSentence = readln()

    var blankCnt = 0

    val splitText = targetSentence.split(" ")

    for (splitWord in splitText) {
          if(!splitWord.isEmpty()) blankCnt++
    }

    println(blankCnt)
}
