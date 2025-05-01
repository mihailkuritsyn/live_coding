package leetcode.medium.hash

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class GroupAnagrams49KotlinTest {
    val target = GroupAnagrams49Kotlin()

    @Test
    fun test1() {
        val expected = listOf(listOf("nat", "tan"), listOf("ate", "eat", "tea"), listOf("bat"))
        assertContentEquals(
            expected,
            target.groupAnagrams(arrayOf("bat", "nat", "tan", "ate", "eat", "tea"))
        )
    }

    @Test
    fun test2() {
        val expected = listOf(listOf(""))
        assertContentEquals(
            expected, target.groupAnagrams(arrayOf(""))
        )
    }
}