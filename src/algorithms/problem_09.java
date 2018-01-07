package algorithms;
/**
 *
 * @author ChaoZeyi
 * Palindrome number
 * Determine whether an integer is a palindrome. Do this without extra space.
 *
 */
public class problem_09 {
    public static void main(String[] args)
    {
        boolean res = isPalindrome(131);
        System.out.println(res);
    }
    public static boolean isPalindrome(int x) {
        boolean flag = false;
        //0�ǻ�����
        if(x == 0)
            return true;
        //�������ǻ�����
        if(x < 0)
            return false;
        int rev = 0;
        int x1 = x;
        while(x1 != 0)
        {
            rev = rev*10 + x1 % 10;
            x1 = x1/10;
        }
        if(rev == x)
            flag = true;
        return flag;
    }
}
