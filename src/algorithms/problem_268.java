package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.

 Example 1

 Input: [3,0,1]
 Output: 2
 */

/**
 * Ҫ������ʱ�临�Ӷȡ�0��1���ռ临�Ӷ�
 *
 * ��������ĺ�
 * ����0-N�ĺ�
 * ����������õ��ľ����ٵ��Ǹ���
 */
public class problem_268 {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum1 = n;
        int sum2 = 0;
        for(int i = 0; i < n; i++)
        {
            sum1 += i;
            sum2 += nums[i];
        }
        return (sum1-sum2);
    }

}
