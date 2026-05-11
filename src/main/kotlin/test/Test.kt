package test

fun main() {
    val a = readln().toInt()
    print(a.isPositive())
}

fun Int.isPositive() = this > 0

