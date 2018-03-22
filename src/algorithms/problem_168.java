package algorithms;

/**
 * Created by chaozeyi on 18/1/19.
 */

/**
 * Excel Sheet Column Title
 *
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

 For example:

 1 -> A
 2 -> B
 3 -> C
 ...
 26 -> Z
 27 -> AA
 28 -> AB
 */

/**
 * 和171是镜像问题，一个是10进制转26进制，一个是26进制转10进制
 */
public class problem_168 {
    public String convertToTitle(int n) {
        //相当于用26进制数表示10进制数n
        StringBuilder strBu = new StringBuilder();


        while(n > 0){
            n--;
            char temp = (char)((n % 26) + 'A');

            strBu.append(temp);
            n = n/26;

        }


        return strBu.reverse().toString();

    }
}
