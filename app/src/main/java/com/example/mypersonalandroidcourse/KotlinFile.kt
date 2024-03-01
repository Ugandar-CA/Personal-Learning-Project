package com.example.mypersonalandroidcourse

fun main() {
    /* Sum of two int array values and get target value */
    twoSum(intArrayOf(2,7,11,15), 9)

    /* Function Type
    * Function types describe the signature of a function. For example, (Int, Int) -> Int represents a function that takes two integers and returns an integer. */
    functionType()

    /* typeAlias*/
    typeAliases()

    // Int and char Range
    intRangeAndCharRange()

    //list
    listOfCollection()

    //mutableSet
    mutableSet()

    //forLoop
    forLoop()

    //continue
    labeledContinue()

    //lambdas
    lambdas()

    //inLineFunction
    doSomething{
        println("developers")
    }

    //Infix function Notation
    infixFunctionNotation()

    //HashSet
    hashSet()

    palindrome()

    romanValues()

    validParanthesis()

    mergeTwoSortedList()

//    removeDuplicatesFromSortedArray()

    println(removeDuplicates(intArrayOf(1, 2, 3, 4, 5, 5)))
}

fun removeDuplicates(nums: IntArray): Int {
    var counter = 0

    for(i in 1 until nums.size) {
        if(nums[counter] != nums[i]) {
            counter++
            nums[counter] = nums[i]
        }
    }
    return counter + 1
}

fun removeDuplicatesFromSortedArray() {
    val nums = arrayListOf<Int>(1, 1, 2, 3, 4, 4)
    val mutableSet = nums.toMutableSet()
    val removedDuplicates = mutableSet.toMutableList()
    val remainingVal = nums.size - mutableSet.size
//    for (i in 0 until remainingVal) {
//        removedDuplicates.add("_")
//    }
    println(removedDuplicates)
}

fun mergeTwoSortedList() {
    var list1 = mutableListOf(1, 2, 4)
    var list2 = mutableListOf<Int>(1, 3, 4)
    list1.addAll(list2)
    val sortedList = list1.sorted()
    println(sortedList)
}

fun validParanthesis() {
    val s = "([)]"
    var result = false
    var isCurlySuccess = false
    var isSquareSuccess = false
    var isOpenBracesSuccess = false

    for(i in s.indices){

        if(s[i].toString() == "("){

            inner@ for (y in s.indices) {
                if (y > i) {
                    isOpenBracesSuccess = s[y].toString() == ")"
                    if(isOpenBracesSuccess){
                        result = true
                        break@inner
                    }else{
                        result = false
                    }
                }
            }
        }

        if(s[i].toString() == "{"){
            inner@ for (y in s.indices) {
                if (y > i) {
                    isCurlySuccess = s[y].toString() == "}"
                    if(isCurlySuccess){
                        result = true
                        break@inner
                    }else{
                        result = false
                    }
                }
            }
        }

        if(s[i].toString() == "["){
            inner@ for (y in s.indices) {
                if (y > i) {
                    isSquareSuccess = s[y].toString() == "]"
                    if(isSquareSuccess){
                        result = true
                        break@inner
                    }else{
                        result = false
                    }
                }
            }
        }
    }

    println(result)
}

fun romanValues() {
    var s = "MCMXCIV"
    val romanValues = hashMapOf(
        'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50,
        'C' to 100, 'D' to 500, 'M' to 1000
    )

    var result = 0
    var prevValue = 0

    for (i in s.length - 1 downTo 0) {
        val currentChar = s[i]
        val currentValue = romanValues[currentChar] ?: 0

        if (currentValue < prevValue) {
            result -= currentValue
        } else {
            result += currentValue
        }

        prevValue = currentValue
    }

    println(result)
}

fun palindrome() {
    val x = -121
    val y: String = x.toString()
    println(y.reversed() == x.toString())
}

fun reverseNumber(num: Int): Int {
    var reversed = 0
    var n = num

    while (n != 0) {
        val remainder = n % 10
        reversed = reversed * 10 + remainder
        n /= 10
    }

    return reversed
}

fun hashSet() {
    println()
    val captains = hashSetOf("Kohli","Smith","Root","Malinga","Rohit","Dhawan")

    println("The element at index 2 is: "+captains.elementAt(2))

    println("The index of element is: "+captains.indexOf("Smith"))

    println("The last index of element is: "+captains.lastIndexOf("Rohit"))
}

private fun infixFunctionNotation() {
    var a: Int = 10

    print(++a)
}

inline fun doSomething(run : () -> Unit){
    println("hi")
    println("hello")
    run()
}

private fun lambdas() {
    val square : (Int) -> Int = { x: Int -> x * x }
    print(square(10))

    val multiply : (Int, Int) -> Int = {x: Int, y: Int ->
        x*y
    }
    print(multiply(12, 10))
}

private fun labeledContinue() {
    var num1 = 4
    outer@ while (num1 > 0) {
        num1--
        var num2 = 4

        inner@ while (num2 > 0) {
            if (num1 <= 2)
                continue@outer
            println("num1 = $num1, num2 = $num2")
            num2--
        }
    }
}

private fun forLoop() {
    for (i in 1..10 step 2) {
        print("$i ")
    }
}

private fun mutableSet() {
    val mutableSet = mutableSetOf(1, 2, 3)
    mutableSet.add(4)
}

private fun listOfCollection() {
    /*
        listOf -> Can't able to modify like update , add or remove // support different datatype
        mutableListOf -> Can able to modify like update , add or remove // support same datatype
        setOf -> A Set is an unordered collection of unique elements. It does not allow duplicate elements. It automatically remove duplicate elements // support same datatype
        mutableSetOf -> Same like setOf() but it allows to modify like update , add or remove // support same datatype
        mapOf -> Used to create an immutable Map collection. it allows you to define key-value pairs for each element // support different datatype
        mutableMapOf -> Same like mapOf() but it allows to modify like update , add or remove // support same datatype
        arrayOf -> Their size is fixed and only updatable like arrayOfFruits[2] = "Mango"
     */
    val listOfFruits = listOf("Apple", "Banana", 0)
    val mutableListOfFruits = mutableListOf("Apple", "Banana", "Cherry", 0)
    val setOfFruits = setOf(2, 3, 4, 2, "test")
    val mutableSetOfFruits = mutableSetOf<Int>(2, 3, 4, 2)
    val mapOfFruits = mapOf("a" to 2, 1 to 3, 1.0 to 4, "b" to 2)
    val mutableMapOfFruits = mutableMapOf<String, Int>("a" to 2, "1" to 3, "1.0" to 4, "b" to 2)
    val arrayOfFruits = arrayOf("Apple", "Banana", 1)
    arrayOfFruits[2] = "Mango"
    arrayOfFruits.set(1, "Orange")
    print(listOfFruits)

    var arraylist=ArrayList<String>()
    // adding elements
    arraylist.add("Geeks")
    arraylist.add("for")
    arraylist.add("Geeks")

    arraylist.remove("for")
    arraylist.removeAt(1)
    // iterating through the elements
    println()
    for(i in arraylist)
        print("$i ")
}

private fun intRangeAndCharRange() {
    val numbersInRange: IntRange = 1..10

    val characterRange: CharRange = 'a'..'z'
    print("$numbersInRange \n $characterRange")
}

private fun typeAliases() {
    val personName: Name = "Alice"

    print(personName)
}

typealias Name = String

private fun functionType() {
    val add: (Int, Int) -> Int = { x, y -> x + y }

    print(add(78675, 876786))
}


fun twoSum(nums: IntArray, target: Int): IntArray {
    var answer = intArrayOf(0,0)
    for (i in nums.indices){
        for (j in nums.indices){
            if(i != j){
                if(nums[i] + nums[j] == target){
                    answer = intArrayOf(i, j)
                    break
                }
            }
        }
    }
    return answer
}

