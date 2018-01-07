package algorithms;

/**
 * Created by chaozeyi on 18/1/6.
 */

/**
 * Search Insert Position
 *Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You may assume no duplicates in the array.

 Example 1:

 Input: [1,3,5,6], 5
 Output: 2
 *
 */
public class problem_35 {

    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(target <= nums[i]){
                return i;
            }else{
                continue;
            }
        }
        // 如果目标值比数组中的最大值还大，则返回数组的长度
        return nums.length;

    }
}
