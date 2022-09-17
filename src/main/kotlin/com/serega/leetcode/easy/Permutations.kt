package com.serega.leetcode.easy

fun main() {
    println(permute(intArrayOf(1, 2, 3)))
}

fun permute(nums: IntArray): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    backtrack(result, ArrayList(), nums.toMutableList())
    return result
}

private fun backtrack(result: MutableList<List<Int>>, tmpList: List<Int>, nums: MutableList<Int>) {
    if (nums.isEmpty()) {
        result.add(tmpList)
        return
    }

    for (i in nums.indices) {
        val numsNew = ArrayList<Int>(nums).also {
            it.removeAt(i)
        }

        backtrack(result, tmpList + nums[i], numsNew) // "+" creates copy of tmpList with appended nums[i]
    }
}