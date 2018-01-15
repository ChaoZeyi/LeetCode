package algorithms;

/**
 * Created by chaozeyi on 18/1/14.
 */

/**
 * Count and Say
 *
 * The count-and-say sequence is the sequence of integers with the first five terms as following:

 1.     1
 2.     11
 3.     21
 4.     1211
 5.     111221
 1 is read off as "one 1" or 11.
 11 is read off as "two 1s" or 21.
 21 is read off as "one 2, then one 1" or 1211.
 Given an integer n, generate the nth term of the count-and-say sequence.

 Note: Each term of the sequence of integers will be represented as a string.

 Example 1:

 Input: 1
 Output: "1"
 Example 2:

 Input: 4
 Output: "1211"
 */

/**
 * 重点是要读懂题意，知道每一步的联系
 */
public class problem_38{
        public String countAndSay(int n) {
            String[] results= new String[n];
            results[0] = "1";
            for(int i = 1; i < n; i++){
                results[i] = helper(results[i - 1]);
            }
            return results[n-1];
        }
        public String helper(String res){
            StringBuilder sb = new StringBuilder();
            char temp = res.charAt(0);
            int count = 1;
            for(int i = 1; i < res.length(); i++){
                if(res.charAt(i) == temp){
                    count++;
                    continue;
                }else{
                    sb.append(count + "" + temp);
                    count = 1;
                    temp = res.charAt(i);
                }

            }
            sb.append(count + "" + temp);
            return sb.toString();

        }

}
