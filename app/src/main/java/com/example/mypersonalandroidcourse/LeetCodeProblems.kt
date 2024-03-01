package com.example.mypersonalandroidcourse

import java.math.BigInteger
import kotlin.math.sin
import kotlin.math.sqrt

fun main() {
    /**
     * Two Sum
     * twoSumProblem()*
     * twoSumEasySolution()
     *  */
    val twoSum = twoSumProblem(intArrayOf(2, 7, 11, 15), 9)
    val twoSumEasySolution = twoSumEasySolution(intArrayOf(2, 8, 11, 7), 19)

    /**
     * Palindrome Number
     */
    val isPalindrome = isPalindrome(1001)

    /**
     * Roman To Int
     */
    val romanToInt = romanToInt("MCMXCIV")

    /**
     * Longest Common Prefix
     * longestCommonPrefix
     * longestCommonPrefixWithOutLibrary
     */
    val longestCommonPrefix = longestCommonPrefix(arrayOf("flower", "flow", "flight"))
    val longestCommonPrefixWithOutLibrary =
        longestCommonPrefixWithOutLibrary(arrayOf("dog", "racecar", "car"))

    /**
     * Valid Parentheses
     */
    val validParentheses = isValid("([])")

    /**
     * Merge Two Sorted Lists
     */
    val listNode = mergeTwoLists(li, li)

    /**
     * Remove Duplicates from Sorted Array
     */
    val removeDuplicates = removeDuplicatesInIntegerArray(intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))

    /**
     * Remove Element
     */
    val removeElement = removeElement(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2)

    /**
     * Find the Index of the First Occurrence in a String
     */
    val findOccurrenceInString = strStr("hello", "ll")

    /**
     * Search Insert Position
     */
    val searchInsertPosition = searchInsert(intArrayOf(1, 3, 5, 6), 7)

    /**
     * Length of Last Word
     */
    val lengthOfTheLastWord = lengthOfLastWord("luffy is still  joyboy")

    /**
     * Plus One
     */
    val plusOne = plusOne(intArrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1, 0))

    /**
     * Add Binary
     */
    val addBinary = addBinary("1010", "1011")

    /**
     * Sqrt(x)
     */
    val sqrt = mySqrt(4)

    /**
     * Climbing Stairs
     */
    val climbingStairs = climbStairs(6)

    /**
     * Merge Sorted Array
     */
    val mergeSortedArrays = merge(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3)

    /**
     * Pascal's Triangle
     */
    val pascalTriangle = generate(5)

    /**
     * Pascal's Triangle 2
     */
    val pascalTriangle2 = getRow(1)

    /**
     * Best Time to Buy and Sell Stock
     */
    val buyAndSellStock = maxProfit(intArrayOf(1))

    /**
     * Valid Palindrome
     */
    val validPalindrome = isPalindrome(" ")

    /**
     * Single Number
     *
     */
    val singleNumber = singleNumber(intArrayOf(1, 0, 1))
    val singleNumberSimpleSolution = singleNumberSimpleSolution(intArrayOf(1, 0, 1))

    /**
     * Majority Element
     * majorityElementEasySolution
     * Boyer-Moore Voting Algorithm.
     */
    val majorityElement = majorityElement(intArrayOf(1,2,1,2,1,2,1,2,2))
    val majorityElementEasySolution = majorityElementEastSolution(intArrayOf(1,2,1,2,1,2,1,2,2))

    /**
     * Reverse Bits
     * reverseBitsEasySolution
     */
    val reverseBits = reverseBits(1011)
    val reverseBitsEasySolution = reverseBitsEasySolution(1011)

    /**
     * Happy Number
     */
    val happyNumber = isHappy(2)

    /**
     * Contains Duplicate II
     */
    val containsDuplicate2 = containsNearbyDuplicate(intArrayOf(1,2,3,1,2,3), 2)

    println(containsDuplicate2)

}

fun twoSumProblem(nums: IntArray, target: Int): IntArray {
    var answer = intArrayOf(0, 0)
    i@ for (i in nums.indices) {
        j@ for (j in nums.indices) {
            if (i != j) {
                if (nums[i] + nums[j] == target) {
                    answer = intArrayOf(i, j)
                    break
                }
            }
        }
    }
    return answer
}

fun twoSumEasySolution(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    nums.forEachIndexed { i, item ->
        val current = map[target - item]
        current?.let {
            return intArrayOf(current, i)
        }
        map[item] = i
    }
    throw IllegalArgumentException("No Solution")
}

fun isPalindrome(x: Int): Boolean {
    return x.toString().reversed() == x.toString()
}

fun romanToInt(s: String): Int {
    val hashMap =
        hashMapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)
    var answer = 0
    var prevValue = 0
    for (i in s.length - 1 downTo 0) {
        var currentValue = hashMap.getValue(s[i].toString())
        if (currentValue < prevValue) {
            answer -= hashMap.getValue(s[i].toString())
        } else {
            answer += hashMap.getValue(s[i].toString())
        }
        prevValue = currentValue
    }
    return answer
}

fun longestCommonPrefix(strs: Array<String>): String {
    var current = strs[0]
    for (x in strs.drop(1)) {
        current = current.commonPrefixWith(x)
    }
    return current
}

fun longestCommonPrefixWithOutLibrary(strs: Array<String>): String {
    val answer = StringBuilder().apply {
        strs.minBy { it.length }
            .forEachIndexed { i, c -> if (strs.all { it[i] == c }) append(c) else return toString() }
    }.toString()

    return answer
}

fun isValid(s: String): Boolean {
    var removeBrackets = s
    for (i in s.indices) {
        removeBrackets = removeBrackets.replace("()", "").replace("[]", "").replace("{}", "")
    }
    return removeBrackets.isEmpty()
}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    return ListNode(0)
}

var li = ListNode(5)
var v = li.`val`

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun removeDuplicatesInIntegerArray(nums: IntArray): Int {
    val numToSet = nums.toSet()
    val setToList = numToSet.toList()

    for (i in nums.indices) {
        try {
            nums[i] = setToList[i]
        } catch (ex: Exception) {
            break
        }
    }
    return numToSet.size
}

fun removeElement(nums: IntArray, `val`: Int): Int {

    val numToList = nums.filter { it != `val` }.toList()

    nums.forEachIndexed { index, _ ->
        if (index < numToList.size) {
            nums[index] = numToList[index]
        }
    }

    return numToList.size
}

fun strStr(haystack: String, needle: String): Int {
    return if (haystack.contains(needle)) {
        haystack.indexOf(needle)
    } else {
        -1
    }
}

fun searchInsert(nums: IntArray, target: Int): Int {
    return if (nums.contains(target)) {
        nums.indexOf(target)
    } else {
        nums.toMutableList().also { it.add(target) }.also { it.sort() }.indexOf(target)
    }
}

fun lengthOfLastWord(s: String): Int {
    return s.trim().substringAfterLast(" ").length
}

fun plusOne(digits: IntArray): IntArray {
    val intValue = digits.joinToString("").toBigInteger() + 1.toBigInteger()
    return intValue.toString().map { it.toString().toInt() }.toIntArray()
}

fun addBinary(a: String, b: String): String {
    return " "
}

fun mySqrt(x: Int): Int {
    return sqrt(x.toDouble()).toInt()
}

fun climbStairs(n: Int): Int {
    if (n <= 2) {
        return n
    }

    val ways = IntArray(n + 1)
    ways[1] = 1
    ways[2] = 2

    for (i in 3..n) {
        ways[i] = ways[i - 1] + ways[i - 2]
    }

    return ways[n]
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
    for (i in 0 until n) {
        nums1[i + m] = nums2[i]
    }
    nums1.sort()
}

fun generate(numRows: Int): List<List<Int>> {
    if (numRows <= 0) {
        return emptyList()
    }
    val result = mutableListOf<MutableList<Int>>()
    for (i in 0 until numRows) {
        val currentRow = mutableListOf(1)
        for (j in 1 until i) {
            val previousRow = result[i - 1]
            currentRow.add(previousRow[j - 1] + previousRow[j])
        }
        if (i > 0) {
            currentRow.add(1)
        }
        result.add(currentRow)
    }

    return result
}

fun getRow(rowIndex: Int): List<Int> {
    if (rowIndex <= 0) {
        return mutableListOf(1)
    }
    val result = mutableListOf<MutableList<Int>>()
    for (i in 0..rowIndex) {
        val currentRow = mutableListOf(1)
        for (j in 1 until i) {
            val previousRow = result[i - 1]
            currentRow.add(previousRow[j - 1] + previousRow[j])
        }
        if (i > 0) {
            currentRow.add(1)
        }
        result.add(currentRow)
    }
    return result[rowIndex]
}

fun maxProfit(prices: IntArray): Int {
    var profit = 0
    var buy = 0
    var sell = 1
    while(sell < prices.size) {
        if(prices[buy] > prices[sell]) {
            buy++
            sell = buy + 1
        } else {
            profit = maxOf(profit, prices[sell] - prices[buy])
            sell++
        }
    }
    return profit
}

fun isPalindrome(s: String): Boolean {
    val cleanString = s.filter { it.isLetterOrDigit() }.lowercase()
    return cleanString.reversed() == cleanString
}

fun singleNumber(nums: IntArray): Int {
    val currentList = nums.toMutableList()
    for(i in nums.indices){
        for(j in i + 1 until nums.size){
            if(nums[i] == nums[j]){
                currentList.removeAll(listOf(nums[i]))
                if(currentList.size == 1){
                    break
                }
            }
        }
    }
    return if(currentList.isEmpty()) 0 else currentList[0]
}

fun singleNumberSimpleSolution(nums: IntArray): Any {
    var ans = 0
    for (el in nums){
        ans = ans xor el
    }
    return ans
}

fun majorityElement(nums: IntArray): Int {
    val removeDuplicates = nums.toSet().toMutableList()
    val countMap = hashMapOf<Int, Int>()
    for(i in removeDuplicates.indices){
        countMap[i] = 0
        for(j in nums.indices){
            if(removeDuplicates[i] == nums[j]){
                countMap.replace(i, countMap[i]?.plus(1) ?: 0)
            }
        }
    }
    val result = countMap.maxByOrNull { it.value }?.key
    return removeDuplicates[result ?: 0]
}

fun majorityElementEastSolution(nums: IntArray): Int {
    var current = 0
    var count = 0
    nums.forEach {if (count == 0) {current = it; count = 1} else if (current == it) count++ else count--}
    return current
}

/**
 *  The radix parameter specifies the base of the numeral system, and common values are
 *  2 (binary), 8 (octal), 10 (decimal), and 16 (hexadecimal).
 */
fun reverseBits(n:Int):Int {
    return n.toUInt().toString(radix = 2).reversed().padEnd(32, '0')
        .toLongOrNull(radix = 2)?.toInt() ?: 0
}

fun reverseBitsEasySolution(n:Int):Int {
    var result = 0
    for (i in 0..31) {
        result = result.shl(1)
        result = result or (n shr i and 1)
    }
    return result
}

fun isHappy(n: Int): Boolean {
    var input = n.toString()
    var output = 0
    var result = false
    var count = 0
    outer@ do {
        inner@ for(i in input.indices){
            output += (input[i].toString().toInt() * input[i].toString().toInt())
        }
        input = output.toString()
        count++
        if (output == 1){
            result = true
            break@outer
        }else{
            output = 0
        }
    }while (count <= 10)
    return result
}

fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
    val numIndicesMap = mutableMapOf<Int, Int>()

    for (i in nums.indices) {
        if (numIndicesMap.containsKey(nums[i]) && i - numIndicesMap[nums[i]]!! <= k) {
            return true
        }

        numIndicesMap[nums[i]] = i
    }

    return false
}




