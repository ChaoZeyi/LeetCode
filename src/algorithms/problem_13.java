package algorithms;
/**
 *
 * @author ChaoZeyi
 * Roman To Integer
 * Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.
 *罗马数字计数规则：

有七个基本符号：Ⅰ（1）、Ⅴ（5）、Ⅹ（10）、L（50）、C（100）、D（500）、M（1000）
相同的数字连写，等于这些数字相加得到的值，如：Ⅲ = 3；XX=20；CC=200；MMM=300
小的数字，（限于Ⅰ、X 和C）在大的数字的左边，所表示的数等于大数减小数得到的数，如：Ⅳ= 4；Ⅸ= 9
小的数字在大的数字的右边，所表示的数等于这些数字相加得到的数， 如：Ⅷ = 8；Ⅻ = 12
 */

public class problem_13 {
    public static void main(String[] args) {
        int res = romanToInt("VIII");
        System.out.println(res);
    }

    public static int romanToInt(String s) {
        int res = 0;
        byte[] s_byte = s.getBytes();
        int[] delta = new int[s_byte.length];
        for(int i = 0; i < s_byte.length; i++)
        {

            switch (s_byte[i]) {
                case 'I':
                    delta[i] = 1;
                    break;
                case 'V':
                    delta[i] = 5;
                    break;
                case 'X':
                    delta[i] = 10;
                    break;
                case 'L':
                    delta[i] = 50;
                    break;
                case 'C':
                    delta[i] = 100;
                    break;
                case 'D':
                    delta[i] = 500;
                    break;
                case 'M':
                    delta[i] = 1000;
                    break;
                default:
                    break;
            }
            if((i >= 1) &&(delta[i] > delta[i-1]) && (delta[i-1] == 1 || delta[i-1] == 10 || delta[i-1] == 100))
            {
                res = res + delta[i] - 2*delta[i-1];
            }
            else {
                res += delta[i];
            }
        }
        return res;
    }
}
