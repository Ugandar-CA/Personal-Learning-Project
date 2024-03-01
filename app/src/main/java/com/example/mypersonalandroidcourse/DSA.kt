package com.example.mypersonalandroidcourse

import java.util.ArrayDeque
import java.util.LinkedList
import java.util.Queue
import kotlin.random.Random

var result: Int = 1

fun main() {
    /**
     * Binary Search
     */
    val endNumber = 50
    val intArray = arrayListOf<Int>()
    for(i in 0 until endNumber){
        intArray.add(i + 1)
    }
    val binarySearch = binarySearch(sortedArray = intArray.toIntArray(), targetValue = 36)

    /**
     * Selection Sort
     */
    val selectionSort = selectionSort(intArrayOf(64,25,12,22,11))

    /**
     * Recursion
     */
    val factorial = 5
    val recursion = recursion(factorial)

    /**
     * Tail Recursion
     */
    val tailRecursion = factorial(factorial)

    /**
     * Euclidean Algorithm - The Euclidean algorithm is an ancient and efficient algorithm for finding the greatest common divisor (GCD) of two numbers. The GCD is the largest positive integer that divides both numbers without leaving a remainder.
     */
    val euclideanAlgorithm = euclideanAlgorithm(48, 18)

    /**
     * Sum Function
     */
    val sumFunction = sumFunction(arrayOf(1,2,3,4,5))

    /**
     * recursive function to count the number of items in a list.
     */
    val recursiveFunctionToNumOfList = recursiveFunctionToNumOfList(listOf(1,2,3,4,5,6,9))

    /** Binary search by using Recursive.
     */
    val arrayList = arrayOf(1,2,3,4,5,6,7,8,9,10)
    val binarySearchByUsingRecursive = binarySearchByUsingRecursive(arrayList, 10, 0, arrayList.size - 1)

    /**
     * QuickSort
     */
    val quickSortList = listOf(90,100,78,89,67)
    val quickSort = quicksort(quickSortList)

    /**
     * Queues
     */
//    val queues = queues()

    /**
     * Breadth-First Search
     * This function checks whether the person’s name ends with the letter m.
     * If it does, they’re a mango seller.
     */
    val graph = mapOf(
        "you" to listOf("alice", "bob", "claire"),
        "bob" to listOf("anuj", "peggy"),
        "alice" to listOf("peggy"),
        "claire" to listOf("thom", "jonny"),
        "anuj" to emptyList(),
        "peggy" to emptyList(),
        "thom" to emptyList(),
        "jonny" to emptyList()
    )

    val bfs = bfs("you", graph)

    /**
     * Dijikstra's Algorithm
     */
//    dijikstraAlgorithm()

    println(quickSort)
}

private fun dijikstraAlgorithm(){
    val graph = mapOf(
        "A" to mapOf("B" to 2, "C" to 5),
        "B" to mapOf("A" to 2, "C" to 1),
        "C" to mapOf("A" to 5, "B" to 1)
    )

    val startNode = "A"
    val (costs, parents) = dijkstrasAlgorithm(graph, startNode)

    println("Shortest paths from $startNode:")
    for (node in costs.keys) {
        val cost = costs[node] ?: 0
        val path = buildPath(node, parents)
        println("To $node: Cost = $cost, Path = $path")
    }
}

fun dijkstrasAlgorithm(
    graph: Map<String, Map<String, Int>>,
    startNode: String
): Pair<Map<String, Int>, Map<String, String?>> {
    val costs = mutableMapOf<String, Int>()
    val parents = mutableMapOf<String, String?>()
    val processed = mutableSetOf<String>()

    // Initialize costs for all nodes (except startNode) to infinity and parents to null.
    for (node in graph.keys) {
        costs[node] = if (node == startNode) 0 else Int.MAX_VALUE
        parents[node] = null
    }

    var node = findLowestCostNode(costs, processed)

    while (node != null) {
        val cost = costs[node] ?: 0
        val neighbors = graph[node] ?: emptyMap()

        for (n in neighbors.keys) {
            val newCost = cost + neighbors[n]!!

            if (costs[n] ?: Int.MAX_VALUE > newCost) {
                costs[n] = newCost
                parents[n] = node
            }
        }

        processed.add(node)
        node = findLowestCostNode(costs, processed)
    }

    return costs to parents
}

fun findLowestCostNode(costs: Map<String, Int>, processed: Set<String>): String? {
    var lowestCost = Int.MAX_VALUE
    var lowestCostNode: String? = null

    for (node in costs.keys) {
        if (costs[node] ?: Int.MAX_VALUE < lowestCost && node !in processed) {
            lowestCost = costs[node] ?: Int.MAX_VALUE
            lowestCostNode = node
        }
    }

    return lowestCostNode
}

fun buildPath(node: String, parents: Map<String, String?>): String {
    val path = LinkedList<String>()
    var current = node
    while (current != null) {
        path.addFirst(current)
        current = parents[current].toString()
    }
    return path.joinToString(" -> ")
}

fun bfs(name: String, graph: Map<String, List<String>>): String? {
    val searchQueue = ArrayDeque<String>()
    searchQueue.addAll(graph[name] ?: emptyList())

    // This array is how you keep track of searched people
    val searched = mutableListOf<String>()
    while (searchQueue.isNotEmpty()){
        val person = searchQueue.poll()

        // Only search this person if you haven't already searched them
        if(person !in searchQueue){
            // If the person is a seller, print and return true
            if(personIsSeller(person)){
                return person
            }else{
                // Add the person's connections to the search queue
                if (person != null) {
                    searchQueue.addAll(graph[person.toString()] ?: emptyList())
                }
                // Mark this person as searched
                person?.let { searched.add(it) }
            }
        }
    }
    return "No mango seller"
}

// Replace this function with your actual check for a mango seller
fun personIsSeller(person: String?): Boolean {
    // Replace this condition with your actual check for a mango seller
    return person?.endsWith("m") == true
}

private fun queues(){
    /**
     * The LinkedList class is used to implement the Queue interface.
     * The offer function is used to enqueue elements.
     * The poll function is used to dequeue elements.
     * The peek function is used to look at the front element without removing it.
     */
    val queue: Queue<Int> = LinkedList()

    // Enqueue elements
    queue.offer(1)
    queue.offer(2)
    queue.offer(3)

    // Dequeue and print elements
    println("Dequeue: ${queue.poll()}") // Prints: 1
    println("Dequeue: ${queue.poll()}") // Prints: 2

    // Enqueue more elements
    queue.offer(4)
    queue.offer(5)

    // Peek at the front element without removing it
    println("Front element: ${queue.peek()}") // Prints: 3

    // Dequeue the remaining elements
    while (queue.isNotEmpty()) {
        println("Dequeue: ${queue.poll()}")
    }
}

fun quicksort(array: List<Int>): List<Int> {
    // Base case: arrays with 0 or 1 element are already "sorted."
    return if (array.size < 2) {
        array
    } else {
        //Chose random index to achieve better average runtime by reducing the likelihood of encountering worst-case scenarios where the input is already sorted.
        val pivotIndex = Random.nextInt(array.size)
        val pivot = array[0]
        // Recursive case
        val less = array.drop(1).filter { it <= pivot }
        // Sub-array of all the elements less than or equal to the pivot
        val greater = array.drop(1).filter { it > pivot }
        // Sub-array of all the elements greater than the pivot
        quicksort(less) + listOf(pivot) + quicksort(greater)
    }
}

fun binarySearchByUsingRecursive(arr: Array<Int>, target: Int, left: Int, right: Int): Int {
    if (left > right) {
        return -1
    }

    // Calculate the middle index
    val mid = left + (right - left) / 2

    // Base Case: If the middle element is the target, return its index
    if (arr[mid] == target) {
        return mid
    }

    // Recursive Case: If the target is less than the middle element, search the left half
    if (target < arr[mid]) {
        return binarySearchByUsingRecursive(arr, target, left, mid - 1)
    }

    // Recursive Case: If the target is greater than the middle element, search the right half
    return binarySearchByUsingRecursive(arr, target, mid + 1, right)
}

fun sumFunction(numArray: Array<Int>): Int {
    return when{
        numArray.isEmpty() -> 0
        else -> numArray[0] + sumFunction(numArray.drop(1).toTypedArray())
    }
}

fun recursiveFunctionToNumOfList(numArray: List<Int>): Int {
   return when{
       numArray.isEmpty() -> 0
       else -> 1 + recursiveFunctionToNumOfList(numArray.drop(1))
   }
}

fun euclideanAlgorithm(a: Int, b: Int): Int {
    var x = a
    var y = b

    while (y!=0){
        val temp = y
        y = x % y
        x = temp
    }
    return x
}

fun recursion(value: Int): Int{
    return if(value <= 1){
         1
    }else{
        value * recursion(value - 1)
    }
}

tailrec fun factorial(n: Int, accumulator: Long = 1): Long {
    return if (n == 0) {
        accumulator
    } else {
        factorial(n - 1, n * accumulator)
    }
}

fun selectionSort(intList: IntArray): IntArray {
    val n = intList.size
    for(i in 0 until n - 1){
        var minIndex = i
        for(j in i + 1 until n){
            if(intList[j] > intList[minIndex]){
                minIndex = j
            }
        }
        val temp = intList[minIndex]
        intList[minIndex] = intList[i]
        intList[i] = temp
    }
    return intList
}

private fun binarySearch(sortedArray: IntArray, targetValue: Int): Int {
    var steps = 0
    var left = 0
    var right = sortedArray.size - 1
    while(left <= right){
        val mid = left + (right - left)/2
        steps++
        when{
            sortedArray[mid] == targetValue -> return steps
            sortedArray[mid] < targetValue -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}