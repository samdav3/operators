fun main(args: Array<String>) {
    var myAnswer = 0
    var a = 12
    var b = 6
    var c = 3

    myAnswer = a - b
    println("12 - 6 = $myAnswer")
    myAnswer = c % b
    println("3 % 6 = $myAnswer")

    a += 6
    myAnswer = a / c
    println("18 / 3 = $myAnswer")

    var isCompare = a != b
    println("18 != 6 $isCompare")
    a -= 6
    c += 9
    isCompare = c == a
    println("12 == 12 $isCompare")


}