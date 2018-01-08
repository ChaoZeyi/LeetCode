package algorithms;

/**
 * Created by chaozeyi on 18/1/8.
 */

/**
 * Permutations
 *
 * Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 给出整数数组中的所有排列组合的情况，总共有n！种情况
 *
 */
public class problem_46 {
    public static  List<List<Integer>> result = new ArrayList<List<Integer>>();
    public static boolean[] used;

    public static void main(String[] args){


        int[] nums = {1,1,3};
        System.out.println(permute(nums));
    }




    public static List<List<Integer>> permute(int[] nums) {


       used = new boolean[nums.length];

        List list = new ArrayList<Integer>();

        outAll(nums, list);

        return result;

    }
    public static void outAll(int[] nums, List<Integer> list){

        if(list.size() == nums.length){
            // 因为list之后还会不断修改，会影响result的值，所以使用一个临时list来替代
            List tempList = new ArrayList<Integer>(list);
            result.add(tempList);
        }else{
            for(int i = 0; i < nums.length; i++){
                if(used[i]){
                    continue;
                }else{

                    used[i] = true;
                    list.add(nums[i]);
                    outAll(nums, list);
                    list.remove(list.size() - 1);
                    used[i] = false;
                }
            }


        }

    }
}
