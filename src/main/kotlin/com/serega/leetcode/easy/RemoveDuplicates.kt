package com.serega.leetcode.easy

fun removeDuplicates(ar: IntArray) = ar.distinct().mapIndexed { i, n -> ar[i] = n }.size

fun main() {
    println(removeDuplicates(intArrayOf(1, 1, 2, 3, 4, 5, 5, 5, 6, 7)))
}