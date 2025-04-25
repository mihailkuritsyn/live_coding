package leetcode.easy.array

//Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
//
//Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
//
//Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
//Return k.
//Custom Judge:
//
//The judge will test your solution with the following code:
//
//int[] nums = [...]; // Input array
//int val = ...; // Value to remove
//int[] expectedNums = [...]; // The expected answer with correct length.
//                            // It is sorted with no values equaling val.
//
//int k = removeElement(nums, val); // Calls your implementation
//
//assert k == expectedNums.length;
//sort(nums, 0, k); // Sort the first k elements of nums
//for (int i = 0; i < actualLength; i++) {
//    assert nums[i] == expectedNums[i];
//}
//If all assertions pass, then your solution will be accepted.
class RemoveElement27 {

    fun removeElement(nums: IntArray, `val`: Int): Int {
        var i = 0
        for (num in nums) {
            if (num != `val`) {
                nums[i++] = num
            }
        }
        return i
    }

//    fun removeElement(nums: IntArray, `val`: Int): Int {
//        if (nums.size == 0) return 0
//        if (nums.size == 1) {
//            if (nums[0] == `val`) return 0 else return 1
//        }
//        var l = 0
//        var r = nums.size - 1
//
//        while (l < r) {
//            if (nums[l] == `val`) {
//                if (nums[r] == `val`) {
//                    r--
//                } else {
//                    nums[l] = nums[r]
//                    nums[r] = `val`
//                    l++
//                    r--
//                }
//            } else {
//                l++
//            }
//        }
//        return if (nums[l] == `val`) l else l + 1
//    }
}