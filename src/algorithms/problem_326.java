package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given an integer, write a function to determine if it is a power of three.
 */

/**
 * ������һ�⣬�����ö����������жϣ������Ͽ����˺ܶ�����
 *
 * ������3��ָ������N��ָ���������������ַ�����
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

