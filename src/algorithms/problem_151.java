package algorithms;

/**
 * Created by chaozeyi on 18/3/18.
 */

/**
 * Given an input string, reverse the string word by word.

 For example,
 Given s = "the sky is blue",
 return "blue is sky the".
 */
public class problem_151 {
    public String reverseWords(String s) {
        if(s.length() == 0)
            return s;
        //��һ�������ո���Ϊ�ָ������������ã�����Ϊ��ƥ������������
        String[] strs = s.trim().split("\\s+");
        if(strs.length == 0)
            return "";
        int i = 0;
        int j = strs.length - 1;
        while(i < j){
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder();
        for(int k = 0; k < strs.length; k++){
            sb.append(strs[k]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
