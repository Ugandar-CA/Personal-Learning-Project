package com.example.mypersonalandroidcourse

/**
 * Sum of series: n * (n + 1) / 2
 *
 * Reversed: reversed = reversed * 10 + digit
 *
 * To find Square root
 * if (x < 0) {
 *         throw IllegalArgumentException("Cannot compute the square root of a negative number.")
 *     }
 *
 *     var guess = x / 2.0 // Initial guess, you can choose a different starting point
 *
 *     repeat(10) { // You can adjust the number of iterations based on precision requirements
 *         guess = 0.5 * (guess + x / guess)
 *     }
 *     return guess.toLong()
 * }
 *
 */