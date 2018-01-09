package algorithms;

/**
 * Created by chaozeyi on 18/1/9.
 */

/**
 * Remove Duplicates from Sorted Array
 *
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 Example:

 Given nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 It doesn't matter what you leave beyond the new length.

 */

/**
 * 因为数组是排好序的，所以可以直接根据前一个值来判断是否为重复值
 */
public class problem_26 {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        int len = nums.length;

        for(int i = 1; i < len; i++){

            if(nums[i] == nums[k])
                continue;
            else{
                k++;
                nums[k] = nums[i];
            }

        }

        return k+1;
    }
}
