package algorithms;
/**
 *
 * @author ChaoZeyi
 * Longest Common Prefix
 * Write a function to find the longest common prefix（最长公共前缀） string among an array of strings.
 *
 */
public class problem_14 {
    public static void main(String[] args)
    {
        String[] strs;
        strs = new String[]{"abc","abd"};
        String res = longestCommonPrefix((strs));
        System.out.println(res);
    }
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        if(strs.length == 0)
            return res;
        char[] str_bytes = strs[0].toCharArray();

        for(int i = 0; i < str_bytes.length; i++)
        {
            for (int j = 0; j < strs.length; j++)
            {
                if((strs[j].getBytes().length == i) || (strs[j].getBytes()[i] != str_bytes[i]))
                {
                    return res;
                }
            }
            res += str_bytes[i];
        }

        return res;
    }
}
