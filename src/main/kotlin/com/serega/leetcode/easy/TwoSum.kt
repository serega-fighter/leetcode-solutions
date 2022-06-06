package com.serega.leetcode.easy

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diffMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, int ->
            diffMap[int]?.let { return intArrayOf(it, index) }
            diffMap[target - int] = index
        }
        return intArrayOf()
    }
}

fun main() {
    val s = TwoSum()
    println(s.twoSum(intArrayOf(5, 3, 3, 2, 1, 0), 5))
}