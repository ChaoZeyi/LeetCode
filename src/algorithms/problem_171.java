package algorithms;

/**
 * Created by chaozeyi on 18/3/22.
 */

/**
 *  Excel Sheet Column Number
 *
 *  Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */

/**
 * 相当于是一个26进制数
 */
public class problem_171 {

    public int titleToNumber(String s) {
        char[] titles = s.toCharArray();
        int len = titles.length;
        int number = 0;
        for(int i = 0; i < len; i++){
            number = number*26 + (titles[i]- 'A' + 1);
        }
        return number;
    }
}
