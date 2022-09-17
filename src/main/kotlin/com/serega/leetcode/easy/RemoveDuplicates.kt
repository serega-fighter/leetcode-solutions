package com.serega.leetcode.easy

fun removeDuplicates(ar: IntArray) = ar.distinct().mapIndexed { i, n -> ar[i] = n }.size

fun main() {
    val testArr = intArrayOf(5, 3, 1, 2, 2, 3, 4, 3, 1, 5)

    val distinctArray = testArr.distinct()
    println(distinctArray)

    println(intArrayOf(9, 5, 3, 1, 132).mapIndexed { index, value -> index + 1 })

    println(intArrayOf(9, 5, 3, 1, 132).associateBy { k -> k })

    println(removeDuplicates(intArrayOf(1, 1, 2, 3, 4, 5, 5, 5, 6, 7)))
}