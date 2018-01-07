package algorithms;

/**
 * Created by chaozeyi on 18/1/7.
 */

/**
 * Single Number
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * 一个整型数组，只有一个元素出现一次，其余每个元素都出现两次，找出这个出现一次的元素
 * 关键点在于只能使用线性时间，所以选择HashMap类型
 */
public class problem_136 {

    public int singleNumber(int[] nums) {

        HashMap hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int res = nums[i];
            if (hashMap.containsKey(res)) {
                hashMap.remove(res);
            } else {
                hashMap.put(res, i);
            }
        }
        Set<Integer> list = hashMap.keySet();

        return (int)list.toArray()[0];
    }
}
