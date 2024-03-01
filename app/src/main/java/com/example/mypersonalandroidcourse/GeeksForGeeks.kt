package com.example.mypersonalandroidcourse

import kotlin.math.pow


fun main() {
    /**
     * Sum of Series
     */
    println("Sum of Series of 5 is ${sumOfSeries(10)}")
    println("GFG: Sum of Series of 5 is ${sumOfSeriesGOG(10)}")

    /**
     * Value equal to index value
     */
    println("Value equal to index value is ${valueEqualToIndex(intArrayOf(15, 2, 45, 12, 7),2)}")

    /**
     * Sum of Array Elements
     */
    println("Sum of Array Elements ${sumElement(intArrayOf(3,2,1,4),3)}")

    /**
     * Print alternate elements of an array
     *
     */
    print("Alternate Elements - ")
    alternateElements(intArrayOf(1,2,3,4,5),5)
    println()

    /**
     * Print 1 To N Without Loop
     */
    printNos(10)
    print("- Recursive")
    println("")

    /**
     * Palindromic Array
     */
    println("Palindromic Array - ${palinArray(intArrayOf(111,222,333,444,555), 5)}")

    /**
     * Palindromic String
     */
    val palindromeInput = "Malayalam"
    print(", Is it $palindromeInput a Palindrome - ${palinString(palindromeInput)}")
    println()

    /**
     * Print the pattern | Set-1
     */
    print("Print the pattern = ")
    printPattern(4)
    println()

    /**
     *Count Digits
     */
    val countDigitInput = 12
    println("Count Digits of $countDigitInput = ${evenlyDivides(countDigitInput)}")

    /**
     *Find the median
     */
    val findMedianInput = intArrayOf( 56,67,30,79)
    println("Median of ${findMedianInput.asList()} = ${findMedian(findMedianInput)}")

    /**
     *Arrays (Sum of array)
     */
    val sumOfArray = longArrayOf(5,8,3,10,22,45)
    println("Sum of array = ${sumOfArray(sumOfArray, 6)}")

    /**
     *Armstrong Numbers
     */
    val armstrongInput = 153
    println("Is $armstrongInput a Armstrong Number = ${armstrongNumber(armstrongInput)}")

    /**
     *Check for Binary
     */
    val binaryInput = "1001"
    println("Is $binaryInput a Binary = ${isBinary(binaryInput)}")

    /**
     *Count of smaller elements
     */
    val countSmallerElementsCount = longArrayOf(1, 2, 2, 2, 5, 7, 9)
    println("Count of smaller elements = ${countOfElements(countSmallerElementsCount,6,2)}")

    /**
     *Palindrome Number
     */
    val palindromeNumberInput = 321
    println("Is $palindromeNumberInput a palindrome = ${is_palindrome(palindromeNumberInput)}")

    /**
     *Find Index
     */
    val findIndexInput = intArrayOf(23,29,30,21,16,10,29,27,19,12,30,20,10,27,30,24,20,27,22,16,27,24,24,11,12,29)
    println("Find Index Input = ${findIndex(findIndexInput, 6, 29).toList()}")

    /**
     * Reverse Digits
     */
    val reverseDigitInput: Long = 122
    println("Reverse of $reverseDigitInput =  ${reverse_digit(reverseDigitInput)}")

    /**
     * Swap kth elements
     */
    val swapKthElement = 2
    val swappArray = intArrayOf(5, 3, 6, 1, 2)
    swapKth(swappArray, 8, swapKthElement)
}

fun swapKth(arr: IntArray, n: Int, k: Int) {
    val temp = arr[k - 1]
    arr[k - 1] = arr[arr.size - k]
    arr[arr.size - k] = temp
    println("After swapping $k =  ${println(arr.toList())}")
}

fun reverse_digit(n: Long): Long {
    val inputToCharArray = n.toString().toCharArray()
    for(i in 0 until inputToCharArray.size / 2){
        val temp = inputToCharArray[i]
        inputToCharArray[i] = inputToCharArray[inputToCharArray.size - 1 - i]
        inputToCharArray[inputToCharArray.size - 1 - i ] = temp
    }
    return String(inputToCharArray).toLong()
}

fun findIndex(a: IntArray, N: Int, key: Int): IntArray {
    val resultIndex = intArrayOf().toMutableList()

    for(i in a.indices){
        if(a[i] == key){
            resultIndex.add(i)
            break
        }
    }

    for(j in a.size - 1 downTo 0){
        if(a[j] == key){
            resultIndex.add(j)
            break
        }
    }

    return if(resultIndex.isNotEmpty()) resultIndex.toIntArray() else intArrayOf(-1, -1)
}

fun is_palindrome(n: Int): String {
    val inputToString = n.toString().toCharArray()
    for(i in 0 until inputToString.size/2){
        var temp = inputToString[i]
        inputToString[i] = inputToString[inputToString.size - 1 - i]
        inputToString[inputToString.size - 1 - i] = temp
    }
    return if(inputToString.contentEquals(n.toString().toCharArray())) "yes" else "No"
}

fun countOfElements(arr: LongArray, n: Long, x: Long): Long {
    return arr.filter { it <= x }.size.toLong()
}

fun isBinary(str: String): Boolean {
    val result = str.filter { it != '0' && it != '1' }

    return result.isEmpty()
}

fun armstrongNumber(n: Int): String {
    val numString = n.toString()
    val power = numString.length
    var sum = 0

    var temp = n
    while (temp != 0) {
        val digit = temp % 10
        sum += digit.toDouble().pow(power.toDouble()).toInt()
        temp /= 10
    }

    return if (sum == n) "Yes" else "No"
}

fun sumOfArray(a: LongArray, n: Long): Long {
    var result: Long = 0
    for(i in 0 until n){
        result += a[i.toInt()]
    }
    return result
}

fun findMedian(v: IntArray): Int {
    val sortTheArray = performQuickSort(v.toList())
    val sizeOfTheArray = v.size
    return if(v.size % 2 == 0){
        val mid1 = sizeOfTheArray / 2 - 1
        val mid2 = sizeOfTheArray / 2
        (sortTheArray[mid1] + sortTheArray[mid2]) / 2
    }else{
        sortTheArray[v.size/2]
    }
}

fun performQuickSort(v: List<Int>): List<Int> {
    return if(v.size < 2){
        v
    }else{
        val pivot = v[v.size / 2]
        val lesser = v.filter { it < pivot }
        val equal = v.filter { it == pivot }
        val greater = v.filter { it > pivot }
        performQuickSort(lesser) + equal + performQuickSort(greater)
    }
}

fun evenlyDivides(N: Int): Int {
    var result = 0
    var remaining = N

    while (remaining != 0){
        val lastDigit = remaining % 10
        if(lastDigit != 0 && N % lastDigit == 0){
            result++
        }
        remaining /= 10
    }

    return result
}

fun printPattern(n: Int) {
    var input = n
    while (input > 0){
        for (i in n downTo 1){
            for(j in 1..input){
                print("$i ")
            }
        }
        print("$")
        input -= 1
    }
}

fun palinString(s: String): Boolean {
    val cleanInput = s.replace(Regex("[^A-Za-z0-9]"), "").lowercase()
    val charArray = cleanInput.toCharArray()
    for (i in 0 until charArray.size / 2) {
        val temp = charArray[i]
        charArray[i] = charArray[charArray.size - 1 - i]
        charArray[charArray.size -1 - i] = temp
    }
    print("Input = $cleanInput - Output = ${charArray.joinToString("")}")
    return cleanInput == charArray.joinToString("")
}

fun palinArray(a: IntArray, n: Int): Int {
    for(i in 0 until n){
        val value = a[i].toString()
        for(j in 0 until  value.length/2){
           if(value[j] != value[value.length - 1 - j]){
               return 0
           }
        }
    }
    return 1
}

fun printNos(N: Int) {
    if(N > 0){
        printNos(N - 1)
        print("$N ")
    }
}

fun alternateElements(arr: IntArray, n: Int) {
    for(i in 0 until n){
        if(i % 2 == 0){
            print("${arr[i]} ")
        }
    }
}

fun sumElement(arr: IntArray, n: Int): Int {
    var result = 0
    for(i in 0 until n){
        result += arr[i]
    }
    return result
}

fun sumOfSeriesGOG(n: Int): Long {
    return n.toLong() * (n + 1) / 2
}

fun sumOfSeries(n: Int): Long {
    var result = 0
    for(i in 1 ..n){
        result += i
    }
    return result.toLong()
}

fun valueEqualToIndex(arr: IntArray?, n: Int): ArrayList<Int> {
    val result = arrayListOf<Int>()
    for (i in 0 until n){
        if((arr?.get(i) ?: 0) == i + 1){
            result.add(arr?.get(i) ?: 0)
        }
    }
    return result
}

