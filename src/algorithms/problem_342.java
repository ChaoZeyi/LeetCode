package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given an integer (signed 32 bits),
 * write a function to check whether it is a power of 4.
 *
 * Follow up: Could you solve it without loops/recursion?
 */

/**
 * һ�������⣬��Ҫ�жϵ��Ǹ����������Ƿ�Ϊ4��ָ��������ͨ�������������۲����
 *
 * 4��ָ���������������Ƶĵ�һλ�϶�Ϊ1��������Ϊ0�����ҳ��ȿ϶���������
 * ����4��100�� 16:10000
 */
public class problem_342 {

    public boolean isPowerOfFour(int num) {
        String binary = Integer.toBinaryString(num);
        if(binary.charAt(0) == '1' && binary.length()%2 == 1)
        {
            for(int i = 1; i < binary.length(); i++)
                if(binary.charAt(i) != '0')
                    return false;

            return true;
        }

        return false;




    }

}
