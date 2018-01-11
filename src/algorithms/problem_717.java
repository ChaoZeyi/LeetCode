package algorithms;

/**
 * Created by chaozeyi on 18/1/11.
 */

/**
 * 1-bit and 2-bit Characters
 *
 * We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

 Now given a string represented by several bits. Return whether the last character must be a one-bit character or not. The given string will always end with a zero.

 Example 1:
 Input:
 bits = [1, 0, 0]
 Output: True
 Explanation:
 The only way to decode it is two-bit character and one-bit character. So the last character is one-bit character.
 Example 2:
 Input:
 bits = [1, 1, 1, 0]
 Output: False
 Explanation:
 The only way to decode it is two-bit character and two-bit character. So the last character is NOT one-bit character.
 */

/**
 * 这道题仔细分析一下，其实很简单，只需要对数组进行遍历，
 * 如果得到的是1，肯定会和下一位组合，所以后移两位
 *
 * 如果指针能移到数组的最后一位，说明肯定是0，则返回true，如果到不了最后一位，则返回false
 */
public class problem_717 {
    public boolean isOneBitCharacter(int[] bits) {
        for(int i = 0; i < bits.length; i++){
            if(i == bits.length - 1){
                return true;
            }

            if(bits[i] == 1){
                i++;
            }

        }
        return false;
    }
}
