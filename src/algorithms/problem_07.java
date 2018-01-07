package algorithms;
/**
 *
 * @author ChaoZeyi
 *Reverse Integer
 *Reverse digits of an integer.

Example1: x = 123, return 321
Example2: x = -123, return -321
Note:
The input is assumed to be a 32-bit signed integer.
Your function should return 0 when the reversed integer overflows.
 */
public class problem_07 {
    public static void main(String[] args)
    {
        int res  = reverse(123);
        System.out.println((res));
    }
    public static int reverse(int x) {
        int result = 0;
        String res = "";
        int a = 0;
        if(x == 0)
            res += "0";
        else if(x > 0)
        {
            while(x > 0)
            {
                a = x % 10;
                x = x/10;
                res += a;

            }

        }
        else
        {
            res += "-";
            while(x !=  0)
            {
                a = x % 10;
                x = x/10;
                res += Math.abs(a);

            }
        }
        if(Double.parseDouble(res) >  Integer.MAX_VALUE || Double.parseDouble(res) <  Integer.MIN_VALUE)
            result = 0;
        else
            result = Integer.parseInt(res);
        return result;

    }
}
