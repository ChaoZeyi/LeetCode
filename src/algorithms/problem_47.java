package algorithms;

/**
 * Created by chaozeyi on 18/1/8.
 */

/**
 * Permutations II
 *
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

 For example,
 [1,1,2] have the following unique permutations:
 [
 [1,1,2],
 [1,2,1],
 [2,1,1]
 ]
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 相比于上一道求排列组合的题，这道题包含了重复值，根据上一道题的解法，可以会返回相同值，所以只需要判断一下，去除相同值就行了
 */
public class problem_47 {

    public List<List<Integer>> result = new ArrayList<List<Integer>>();

    public boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {

        used = new boolean[nums.length];

        List<Integer> list = new ArrayList<>();

        outAll(nums, list);

        return result;

    }
    public void outAll(int[] nums, List<Integer> list){

        if(list.size() == nums.length){
            List tempList = new ArrayList<Integer>(list);
            if(!result.contains(tempList))
                result.add(tempList);
        }else{

            for(int i = 0; i < nums.length; i++){
                if(used[i]){
                    continue;
                }else{
                    list.add(nums[i]);
                    used[i] = true;
                    outAll(nums, list);
                    list.remove(list.size() - 1);
                    used[i] = false;

                }
            }
        }

    }

}
