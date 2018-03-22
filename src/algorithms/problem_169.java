package algorithms;

import java.util.HashMap;

/**
 * Created by chaozeyi on 18/3/22.
 */

/**
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than ? n/2 ? times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class problem_169 {
    public int majorityElement(int[] nums) {
        /**
         *  这个是自己最开始想出来的方法，最直接，但明显没有利用到题目中给出的信息：
         *  majority存在的个数超过n/2次
         */
//        HashMap<Integer, Integer> numCount = new HashMap<>();
//        int major = 0;
//        int maxNum = 0;
//        for(int i = 0; i < nums.length; i++){
//            if(numCount.containsKey(nums[i])){
//                numCount.put(nums[i], numCount.get(nums[i])+1);
//            }else{
//                numCount.put(nums[i], 1);
//            }
//
//            if(numCount.get(nums[i]) > maxNum){
//                maxNum = numCount.get(nums[i]);
//                major = nums[i];
//            }
//        }
//        return major;
        /**
         * 考虑到majority存在的个数超过n/2次这个信息，可以有一些巧妙的思路
         * 将第一个元素设为majority，如果下一个元素与该元素相等，则count＋＋，
         * 若不等，则count－－
         * submission beats 100%
         */
        int majority = nums[0];
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == majority){
                count++;
            }else
                count--;

            if(count == 0){
                majority = nums[i];
                count=1;
            }
        }
        return majority;
    }

}
