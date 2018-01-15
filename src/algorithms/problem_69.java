package algorithms;
import java.lang.Math;
/**
 * Created by chaozeyi on 18/1/15.
 */

/**
 * Sqrt(x)
 *
 * Implement int sqrt(int x).

 Compute and return the square root of x.

 x is guaranteed to be a non-negative integer.


 Example 1:

 Input: 4
 Output: 2
 Example 2:

 Input: 8
 Output: 2
 Explanation: The square root of 8 is 2.82842..., and since we want to return an integer, the decimal part will be truncated.
 */

/**
 * 实现自己的求根号函数，肯定就不能用到Math库中自带的sqrt函数了
 * 由于输入参数已经确定为int类型，所以可以使用折半查找
 */
public class problem_69 {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        int p = 1;
        int b = 46345;
        while(p < (b-1)){
            int mid  = (p+b)/2;

            if(x/mid > mid){

                p = mid;
            }else if(x/mid < mid){
                b = mid;
            }else{
                return mid;
            }
        }
        return p;
    }
}
