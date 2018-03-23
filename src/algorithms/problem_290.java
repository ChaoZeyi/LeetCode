package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 Notes:
 You may assume pattern contains only lowercase letters,
 and str contains lowercase letters separated by a single space.
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * ע����˫��ӳ�䣬һһ��Ӧ������Сд��ĸ��str�Կո����
 */
public class problem_290 {

    public boolean wordPattern(String pattern, String str) {

        char[] patterns = pattern.toCharArray();

        String[] strs = str.split(" ");

        if(patterns.length != strs.length)
            return false;
        HashMap<Character, String> hashMap = new HashMap<>();

        // �ȱ�֤��ͬpattern��Ӧ���ַ������
        for(int i = 0; i < strs.length; i++){
            if(!hashMap.containsKey(patterns[i])) {
                if(hashMap.containsValue(strs[i]))
                    return false;
                hashMap.put(patterns[i], strs[i]);
            }
            else
            {

                if(!hashMap.get(patterns[i]).equals(strs[i]))
                    return false;
            }
        }
        //Ȼ��֤һһ��Ӧ����ͬ��pattern��Ӧ���ַ���Ӧ�ò�ͬ
        return true;

    }

}
