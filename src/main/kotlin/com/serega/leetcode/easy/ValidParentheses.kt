package com.serega.leetcode.easy

fun main() {
    "(){}".isValidParentheses().apply(::println)
    "(){".isValidParentheses().apply(::println)
    "(){}[](){}()".isValidParentheses().apply(::println)
    "(){}[](){}()]".isValidParentheses().apply(::println)
}

fun String.isValidParentheses(): Boolean {
    val p = '(' to ')'
    val b = '[' to ']'
    val k = '{' to '}'

    for ((index, value) in withIndex()) {
        if (index % 2 == 0) {
            val nextChar = getOrNull(index + 1)
            if (!when (value) {
                    p.first -> p.second == nextChar
                    b.first -> b.second == nextChar
                    k.first -> k.second == nextChar
                    else -> false
                }
            ) {
                return false
            }
        }
    }

    return true
}