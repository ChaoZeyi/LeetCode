package algorithms;

/**
 * Created by chaozeyi on 18/1/19.
 */

/**
 * Two Sum II - Input array is sorted
 *
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

 The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

 You may assume that each input would have exactly one solution and you may not use the same element twice.

 Input: numbers={2, 7, 11, 15}, target=9
 Output: index1=1, index2=2
 */

/**
 * 利用数组事先是排好序的这一特性
 */
public class problem_167 {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers.length < 2)
            return result;

        //定义两个前后指针
        int p = 0;
        int b = numbers.length - 1;
        while(p < b){
            if((numbers[p]+numbers[b]) == target){
                result[0] = p+1;
                result[1] = b+1;
                return result;
            }else if((numbers[p]+numbers[b]) < target)
                p++;
            else
                b--;
        }
        return result;
    }
}
