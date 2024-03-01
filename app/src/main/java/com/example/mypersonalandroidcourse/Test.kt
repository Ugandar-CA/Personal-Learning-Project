package com.example.mypersonalandroidcourse

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    findLargestAndSmallest(intArrayOf(4, 7, 2, 67, 21, 43, 76, 4, 2))
    fibonacciSeries(5)
    leapYear(2023)
    primeNumber(31)
    stringPalindrome("Malayalam")
    integerPalindrome(123)
    reverseTheString("ugandar")
    armstrongNumberTest(123)
    factorialProgram(10)
    printPatternProblem(5)
    printPatternProblem2(5)
    printPatternProblem3(5)
    reverseTheInt(987654321)
    println()
    println( findSquareRoot(27.0))
    println(QS(listOf(19,38,57,76,95,84,63,42,21)))
}

private fun QS(intArrayOf: List<Int>): List<Int> {
    return if(intArrayOf.size < 2){
        intArrayOf
    }else{
        val pivot = intArrayOf[intArrayOf.size/2]
        val left = intArrayOf.filter { it < pivot }
        val middle = intArrayOf.filter { it == pivot }
        val right = intArrayOf.filter { it > pivot }
        QS(left) + middle + QS(right)
    }
}

fun findSquareRoot(number: Double): Double {
    var guess = number / 2.0 // Initial guess
    val tolerance = 1e-6 // Change tolerance as needed

    while (true) {
        val newGuess = 0.5 * (guess + number / guess)
        if (Math.abs(guess - newGuess) < tolerance) {
            return newGuess
        }
        guess = newGuess
    }
}

fun reverseTheInt(input: Int){
    var remaining = input
    var result = 0

    while (remaining != 0){
        val lastDigit = remaining % 10
        result = result * 10 + lastDigit
        remaining /= 10
    }

    print(result)
}

fun printPatternProblem(input: Int){
    for(i in 1 .. input){
        for(j in 1 .. i ){
            print("* ")
        }
        println()
    }
}

fun printPatternProblem2(input: Int){
    println()
    for(i in input downTo  1){
        for(j in 0 until i ){
            print("* ")
        }
        println()
    }
}

fun printPatternProblem3(input: Int){
    println()
    for (i in 1 .. input){
        for (j in 1 .. (input - i)){
            print(" ")
        }

        for (k in 1..i){
            print("* ")
        }
        println()
    }
}

fun factorialProgram(input: Int){
    var result = 1
    for(i in 1 .. input){
        result *= i
    }
    println(result)
}

fun armstrongNumberTest(i: Int){
    var input = i
    val length = input.toString().length
    var sum = 0

    while (input > 0){
        val lastDigit = input % 10
        sum += lastDigit.toDouble().pow(length.toDouble()).toInt()
        input /= 10
    }

    if(i == sum) println("$i is a Armstrong Number") else println("$i is not a Armstrong Number")
}

fun reverseTheString(input: String){
    val toCharArray = input.toCharArray()
    for(i in 0 until toCharArray.size/2){
        val temp = toCharArray[i]
        toCharArray[i] = toCharArray[toCharArray.size - 1 - i]
        toCharArray[toCharArray.size - 1 - i] = temp
    }
    println(toCharArray.joinToString(""))
}

fun integerPalindrome(input: Int){
    var remaining = input
    var result = 0
    while (remaining != 0){
        val lastDigit = remaining % 10
        result = result * 10 + lastDigit
        remaining /= 10
    }
    if(input == result) println("$input is a palindrome") else  println("$input is not a palindrome")
}

fun stringPalindrome(input: String) {
    val inputToCharArray = input.toCharArray()
    for(i in 0 until  inputToCharArray.size/2){
        val temp = inputToCharArray[i]
        inputToCharArray[i] = inputToCharArray[inputToCharArray.size - 1 - i]
        inputToCharArray[inputToCharArray.size - 1 - i] = temp
    }
    if(inputToCharArray.joinToString("").equals(input, ignoreCase = true)){
        println("$input is a palindrome")
    }else{
        println("$input is not a palindrome")
    }
}

fun primeNumber(num : Int){
    if(isPrimeNumber(num)){
        println("Number $num is a prime number")
    }else{
        println("Number $num is not a prime number")
    }
}

fun isPrimeNumber(input: Int):Boolean {
    if(input <= 1) return false
    val sqrt = sqrt(input.toDouble()).toInt()
    for (i in 2 until sqrt){
        if(input % i == 0){
            return false
        }
    }
    return true
}

fun leapYear(year: Int){
    if(isLeapYear(year)){
        println("Year $year is Leap year")
    }else{
        println("Year $year is not a leap year")
    }
}

fun isLeapYear(year: Int): Boolean{
    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
}

fun fibonacciSeries(i: Int) {
    if (i <= 1) {
        println(i)
        return
    }
    var n1 = 0
    var n2 = 1
    for(i in 2 until i){
        val sum = n1 + n2
        n1 = n2
        n2 = sum
    }
    println(n1 + n2)
}

fun findLargestAndSmallest(intArrayOf: IntArray) {
    var smallest = intArrayOf[0]
    var largest = intArrayOf[0]
    for(i in intArrayOf.indices){
        if(intArrayOf[i] > largest){
            largest = intArrayOf[i]
        }
    }
    for(i in intArrayOf.indices){
        if(intArrayOf[i] < smallest ){
            smallest = intArrayOf[i]
        }
    }
    println(largest)
    println(smallest)
}
