package algorithms;

/**
 * Created by chaozeyi on 18/1/7.
 */

/**
 * Integer to Roman
 *
 * Given an integer, convert it to a roman numeral.

 Input is guaranteed to be within the range from 1 to 3999.
 */

/**
 * 这道题的难点在于理解什么是罗马数字：
 *   I = 1;
     V = 5;
     X = 10;
     L = 50;
     C = 100;
     D = 500;
     M = 1000;
 * 1、相同的数字连写，所表示的数等于这些数字相加得到的数，如：Ⅲ = 3；
   2、小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：Ⅷ = 8；Ⅻ = 12；
   3、小的数字，（限于Ⅰ、X 和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：Ⅳ= 4；Ⅸ= 9；
 */
public class problem_12 {

    public String intToRoman(int num) {

        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL","X", "IX","V", "IV","I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String res = "";

        while(num > 0) {
            for (int i = 0; i < roman.length; i++) {

                if (num >= values[i]) {
                    res += roman[i];
                    num -= values[i];
                    break;
                } else {
                    continue;
                }
            }
        }

        return res;

    }
}
