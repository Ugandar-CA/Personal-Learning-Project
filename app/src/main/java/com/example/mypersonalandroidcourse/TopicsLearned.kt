package com.example.mypersonalandroidcourse

/**
 * intArrayOf - In Kotlin, arrays are fixed-size, and you cannot remove an element from them directly. However, you can create a new array that excludes the element you want to remove. Here's an example:
 * forEachIndexed
 * HashMap
 * hashMapOf
 * minBy in array
 * drop in for loop
 * commonPrefixWith in array strings
 * getValue in hashMapOf
 * replace in strings
 * setOf -  Set is an unordered collection, so it doesn't have indices like lists or arrays. However, you can convert the set to a list and then access elements by index. Keep in mind that the order of elements in a set is not guaranteed, so the order in the resulting list may not be the same as the order in which elements were added to the set.
 * indices
 * toMutableSet - The MutableSet interface represents a mutable set, which means you can add or remove elements after the set is created.  In addition to the read operations, MutableSet provides methods for adding (add) and removing (remove) elements.
 * filter - the filter function is used to create a new collection containing only the elements that satisfy a given predicate. When working with an IntArray, you can use filter to create a new array with specific elements removed based on a condition. Here's an example:
 * forEach
 * contains
 * indexOf - the indexOf function is used to find the index of the first occurrence of the needle in the haystack. If the substring is found, the index is printed; otherwise, a message indicating that the substring is not found is printed.
 * toMutableList - can able to add or remove element from the list
 * sort() - to sort the list in ascending order without creating new variable. It will modify orginal list
 * sorted() -  a new list with the elements sorted in ascending order, leaving the original list unchanged.
 * also{} - the also function is a scoping function that is used to perform some additional actions on an object and return the same object. It is often employed in scenarios where you want to execute additional code within a block and still return the original object. The also function provides a concise way to achieve this.
 * substringAfterLast(" ") - is used to find the last non-empty substring after the last space.
 * split(" ") = is used to split string
 * map - he map function is a higher-order function that is used to transform the elements of a collection. It takes a lambda expression as a parameter, which is applied to each element in the collection to produce a new result. The map function returns a new collection with the transformed elements.
 * joinToString("") -  is used to concatenate the elements of the array into a single string with an empty separator.
 * toBigInteger() - to support larger numbers. Can use instead of toInt()
 * sqrt - to find the square root of the integer
 * Until - in for loop
 * min() - to find lowest value in array
 * max() - to find largest value in array
 * isLetterOrDigit - to filter only letters and digit from string
 * removeAll - pass the list of int to remove all that int in that list : For example - removeAll(listOf(1))
 * xor - the XOR (exclusive or) operation is used to find the single element that appears only once in the given array nums. The key property of XOR is that it returns 1 for bits that are set in only one of the operands.
 * maxByOrNull - to get the maximum value or key from the hashmap - countMap.maxByOrNull { it.value }?.key
 * Integer.parseInt - The parseInt method in Java and Kotlin allows you to parse a string representation of a number in a specific radix. The radix parameter specifies the base of the numeral system, and common values are 2 (binary), 8 (octal), 10 (decimal), and 16 (hexadecimal).
 * toUInt() - Convert n to an unsigned 32-bit integer. This converts n to an unsigned integer.
 * toString(radix = 2) - Convert the unsigned integer to its binary representation as a string. The unsigned integer is then converted to a binary string using base 2 (radix 2).
 * padEnd(32, '0') - Pad the reversed binary string with zeros on the right to make sure it has a length of 32 characters. The reversed binary string is padded with zeros on the right to ensure it has a length of 32 characters. This is important because later we'll interpret it as a signed 32-bit integer.
 * drop(1) in list - to drop the elements in the list
 * poll() - to deque first element of queue
 * offer() - to enqueue elements to the queue
 * peek() - to read the first element of the queue
 * ArrayDeque()
 * Queue
 * toTypedArray()
 * LinkedList()
 * tailRecursive()
 * repeat(10) {} - to repeat the same logic of code
 * HashSet - same like hashmap but with set logic
 */