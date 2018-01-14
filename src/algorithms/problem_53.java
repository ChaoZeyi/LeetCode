package algorithms;

/**
 * Created by chaozeyi on 18/1/13.
 */

/**
 * Maximum Subarray
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */

/**
 * 找出一个数组的最大连续序列
 * 对于一个索引而言，如果他前面位置的元素和为0，则放弃前面元素
 */
public class problem_53 {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(sum <= 0){
                sum = nums[i];
            }
            else{
                sum += nums[i];
            }

            if(sum > max){
                max = sum;
            }
        }
        return max;

    }
}
