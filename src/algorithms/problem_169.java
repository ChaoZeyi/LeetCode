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
         *  ������Լ��ʼ������ķ�������ֱ�ӣ�������û�����õ���Ŀ�и�������Ϣ��
         *  majority���ڵĸ�������n/2��
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
         * ���ǵ�majority���ڵĸ�������n/2�������Ϣ��������һЩ�����˼·
         * ����һ��Ԫ����Ϊmajority�������һ��Ԫ�����Ԫ����ȣ���count������
         * �����ȣ���count����
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
