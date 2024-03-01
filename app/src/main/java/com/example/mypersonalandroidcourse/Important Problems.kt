package com.example.mypersonalandroidcourse

import android.R.attr
import kotlin.math.sqrt


fun main() {
    /**
     * Basic Math problems
     */

    /**
     * Odd or Even
     */
    println(oddEven(7))

    /**
     * Find Last Digit Of a^b for Large Numbers
     */
    println(getLastDigit("3" ,"10"))

    /**
     * Find First and Last Digit Of a^b for Large Numbers
     */
    println(getFirstAndLastDigit(98765214))

    /**
     * Count Digits
     */
    println(countDigits(12))

    /**
     * Reverse Digits
     */
    println(reverseDigits(200))

    /**
     * Reverse Int array
     */
    println(reverseIntArray(intArrayOf(9,8,7,6,5,4,3,2,1,0)).toList())

    /**
     * Power Of Numbers
     */
    println(power(N =217, R = 12))

    val originalString = "Who Are We & Where : Are We?"
    val modifiedString = originalString.replace("[^a-zA-Z]".toRegex(), "").trim()
    println(modifiedString)

    /**
     * GCD of two numbers
     */
    println(gcd(6, 12 ))

    /**
     *  Print all Divisors of a number
     */
    println(printDivisors(6))

    /**
     *  Prime Numbers
     */
    println(isPrime(15))

    /**
     *  Palindrome Number
     */
    println(isPalindromeNumber(123))

    /**
     *  Square root
     */
//    println(floorSqrt(4))

    /**
     *  Perfect Number
     */
    println(isPerfectNumber(6))

    /**
     *  Get min and max number
     */
    println(getMinMax(longArrayOf(3, 2, 1, 56, 9999, 167),6))

    /**
     *  Third largest number
     */
    println(thirdLargest(intArrayOf(23, 65, 1),5))

    /**
     *  Search an Element in an array
     */
    println(search(intArrayOf(1,2,3,4),4, 3))

    /**
     *  Missing Element
     */
    println(missingNumber(intArrayOf(1,2,3,5),5))

    /**
     *  Find repeat Element
     */
    println(findRepeatElement(intArrayOf(1,2,3,5,4),5))

    /**
     *  Sort an array of 0s, 1s and 2s
     */
    sort012(intArrayOf(0,1,0),5)

    /**
     *  Check if two arrays are equal or not
     */
    println(check(longArrayOf(1,2,5,4,0), longArrayOf(2,4,5,0,1),5))

    /**
     *  Cyclically rotate an array by one
     */
    rotate(intArrayOf(1, 2, 3, 4, 5), 5)

    /**
     *  swap two variables
     */
    swapVariables()

    /**
     *  Cyclically rotate an array by one
     */
    println(rotateArray(arrayListOf(7,5,2,11,2,43,1,1), 2))

    /**
     *  Array Subset of another array
     */
    println(isSubset(longArrayOf(1,2,3,4,5,6,7,8), longArrayOf(1,2,3,1), 7, 3))

}

fun isSubset(a1: LongArray, a2: LongArray, n: Long, m: Long): String {
    for(i in a2.indices){
        if(!a1.contains(a2[i])){
            return "No"
        }
    }
    return "Yes"
}

fun rotateArray(arr: ArrayList<Int>, k: Int): ArrayList<Int> {
    var steps = k
    while (steps > 0) {
        val temp = arr[0]
        for (i in 0 until arr.size - 1) {
            arr[i] = arr[i + 1]
        }
        arr[arr.size - 1] = temp
        steps--
    }
    return arr
}

fun swapVariables(){
    var a1 = 5
    var b1 = 10
    a1 += b1
    b1 = a1 - b1
    a1 -= b1
    println("a - $a1 , b - $b1")
}

fun rotate(arr: IntArray, n: Int) {
    val temp = arr[arr.size - 1]
    for(i in arr.size-1 downTo  1){
        arr[i] = arr[i - 1]
    }
    arr[0] = temp
    println(arr.toList())
}

fun check(A: LongArray, B: LongArray, N: Int): Boolean {
    A.sort()
    B.sort()

    for(i in 0 until N){
        if(A[i] != B[i]){
            return false
        }
    }
    return true
}

fun sort012(a: IntArray, n: Int) {
    println(performQS(a.toList()))
}

fun performQS(list: List<Int>): List<Int>{
    return if(list.size < 2){
        list
    }else{
        var pivot = list[list.size/2]
        var left = list.filter { it < pivot }
        var mid = list.filter { it == pivot }
        var right = list.filter { it > pivot }
        performQS(left) + mid + performQS(right)
    }
}

fun findRepeatElement(array: IntArray, n: Int): Int{
//    for(i in array.indices){
//        for(j in i + 1 until array.size){
//            if(array[i] == array[j]){
//                return array[i]
//            }
//        }
//    }
//    return -1

    val set = HashSet<Int>()

    for (num in array) {
        if (!set.add(num)) {
            // If the number is already in the set, it's the first repeated number.
            return num
        }
    }

    return -1
}

fun missingNumber(array: IntArray, n: Int): Int {
    val expectedSum = n * (n + 1) / 2
    var actualSum = 0
    for (i in 0 until n - 1) {
        actualSum += array[i]
    }
    return expectedSum - actualSum
}

fun search(arr: IntArray, N: Int, X: Int): Int {
    for(i in arr.indices){
        if(arr[i] == X){
            return i
        }
    }
    return -1
}

fun binarySearch(arr: IntArray, N: Int, X: Int): Int {
    var isAvailable = false
    var start = 0
    var end = arr.size - 1

    while (start <= end){
        val middle = start + (end - start) / 2
        if(X < middle) end = middle
        if(X > middle) start = middle
        when{
            arr[middle] == X -> isAvailable = true
            arr[middle] < X -> start = middle + 1
            else-> end = middle - 1
        }
    }

    return 0
}

fun thirdLargest(a: IntArray, n: Int): Int {
    return if(a.size == 1 || a.size == 2){
        -1
    }else{
        val sortedList = quickSort(a.toList())
        sortedList[sortedList.size - 3]
    }
}

fun quickSort(a: List<Int>): List<Int>{
    return if(a.size < 2){
        a
    }else{
        val pivot = a[a.size/2]
        val left = a.filter { it < pivot }
        val middle = a.filter { it == pivot }
        val right = a.filter { it > pivot }
        quickSort(left) + middle + quickSort(right)
    }
}

fun getMinMax(a: LongArray, n: Long): Pair<Long, Long>{
    var min = a[0]
    var max = a[0]

    for(element in a){
        if(element < min){
            min = element
        }else if(element > max){
            max = element
        }
    }
    return Pair(min , max)
}

fun isPerfectNumber(N: Long): Int {
    var sum: Long = 0
    var i: Long = 1
    while (i <= sqrt(N.toDouble())) {
        if (N % i == 0L) {
            sum = if (i == N / i) sum + i else sum + i + N / i
        }
        i++
    }

    sum -= N
    return if (sum == N) 1 else 0
}

fun floorSqrt(x: Long): Long {
    require(attr.x >= 0) { "Cannot compute the square root of a negative number." }

    var guess = attr.x / 2.0 // Initial guess, you can choose a different starting point

    val epsilon = 1e-10 // Adjust the precision as needed


    while (Math.abs(guess * guess - attr.x) > epsilon) {
        guess = 0.5 * (guess + attr.x / guess)
    }

    return guess.toLong()
}

private fun isPalindromeNumber(n: Int): String{
    var remaining = n
    var result = 0
    while(remaining != 0){
        val lastDigit = remaining % 10
        result = result * 10 + lastDigit
        remaining /= 10
    }
    return if(n == result) "Yes" else "No"
}

fun isPrime(N: Int): Int {
    if(N == 1) return 0
    val sqrt = kotlin.math.sqrt(N.toDouble()).toInt()
    for(i in 2 .. sqrt){
        if(N % i == 0){
            return 0
        }
    }
    return 1
}

fun printDivisors(n: Int): List<Int> {
    val result = mutableListOf<Int>()
    for (i in 1 .. n){
        if(n % i == 0){
            result.add(i)
        }
    }
    return result
}

fun gcd(A: Int, B: Int): Int {
    var max = A.coerceAtLeast(B)
    var min = A.coerceAtMost(B)

    while (min != 0){
        val temp = min
        min = max % min
        max = temp
    }

    return max
}

fun power(N: Int, R: Int): Long {
    var reversed = 0
    var remaining = N


    while(remaining != 0){
        val digit = N % 10
        reversed = reversed * 10 + digit
        remaining /= 10
    }

    return reversed.toLong()
}

fun reverseIntArray(num: IntArray): IntArray{
    for(i in 0 .. num.size / 2){
        val temp = num[i]
        num[i] = num[num.size - 1 - i]
        num[num.size - 1 - i] = temp
    }
    return num
}

fun reverseDigits(n : Long): Long{
    var reversed : Long = 0
    var remaining = n

    while(remaining != 0.toLong()){
        val digit = remaining % 10
        reversed = reversed * 10 + digit
        remaining /= 10
    }
    return reversed
}

fun countDigits(num: Int): Int{
    var result = 0
    var remaining = num

    while (remaining != 0){
        val lastDigit = num % 10
        if(lastDigit != 0 && num % lastDigit == 0){
            result++
        }
        remaining /= 10
    }
    return result
}

fun getFirstAndLastDigit(num: Int): Pair<Int, Int> {
    var firstDigit = num
    var lastDigit = 0

    lastDigit = num % 10

    while(firstDigit >= 10){
        firstDigit /= 10
    }
    return Pair(firstDigit, lastDigit)
}

fun getLastDigit(a: String, b: String): Int {
    var result: Int = a.toInt()
    if (b.toInt() == 0) return 1
    for (i in 1 until b.toInt()) {
        result *= a.toInt()
    }
    return result % 10
}

fun oddEven(N: Int): String {
    return if(N % 2 == 0) "even" else "odd"
}