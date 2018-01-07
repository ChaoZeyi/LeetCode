package algorithms;
import java.util.HashMap;

/**
 *
 * @author ChaoZeyi
 *Two Sum
 *Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

*Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class problem_01
{
    public static void main(String[] args)
    {
        int[] nums;
        nums = new int[]{2,7,11,15};
        int[] res = twoSum(nums,9);
        System.out.println(res[0] + "," + res[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> num = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            num.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; i++)
        {

            int a = nums[i];
            if(num.containsKey(target - a) && (num.get(target - a) != i))
            {
                res[0] = i;
                res[1] = num.get(target - a);
                break;
            }
        }
        return res;
    }
}
