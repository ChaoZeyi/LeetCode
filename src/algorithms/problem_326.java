package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given an integer, write a function to determine if it is a power of three.
 */

/**
 * 不像上一题，可以用二进制数来判断，在网上看到了很多窍门
 *
 * 不管是3的指数还是N的指数，都可以用这种方法。
 */
public class problem_326 {

    public boolean isPowerOfThree(int n) {

        double a = Math.log10(3);

        double b = Math.log10(n);

        if((b/a) % 1 == 0)
            return true;
        else
            return false;


    }

}

