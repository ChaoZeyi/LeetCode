package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 *
 */
public class problem_303 {

    private final int[] nums;
    private int[] sums;

    public problem_303(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length];
        getSums();
    }

    public void getSums(){
        if(nums.length != 0){
            sums[0] = nums[0];
            for(int i = 1; i < nums.length; i++)
            {
                sums[i] = sums[i-1] + nums[i];
            }
        }

    }


    public int sumRange(int i, int j) {
        if(i == 0)
            return sums[j];
        else
            return sums[j] - sums[i-1];
    }
}
