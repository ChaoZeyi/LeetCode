package algorithms;

/**
 * Created by chaozeyi on 18/1/6.
 */

/**
 * Remove Element
 *
 * Given an array and a value, remove all instances of that value in-place and return the new length.

 Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:

 Given nums = [3,2,2,3], val = 3,

 Your function should return length = 2, with the first two elements of nums being 2.
 */

// 需要注意的是，当数组作为参数传递时，是址传递
public class problem_27 {

    public static void main(String[] args){
        int[] a = new int[2];
        a[0] = 1;
        a[0] = 2;
        int num = removeElement(a, 2);
        for(int i = 0; i < num; i++) {
            System.out.println(a[i]);
        }

    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
