package com.serega.leetcode.easy

fun climbStairs(n: Int): Int {
    tailrec fun fib(i: Int, first: Int, second: Int): Int =
        if (i == n)
            first + second
        else
            fib(i + 1, first = second, second = first + second)

    return fib(1, 0, 1)
}