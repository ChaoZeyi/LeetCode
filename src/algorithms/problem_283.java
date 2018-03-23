package algorithms;

import java.util.ArrayList;

/**
 * Created by chaozeyi on 18/3/23.
 */
public class problem_283 {
    public void moveZeroes(int[] nums) {
        int nonZeros = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0)
            {
                nums[nonZeros] = nums[i];
                nonZeros++;
            }
        }
        for(int i = nonZeros; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}
