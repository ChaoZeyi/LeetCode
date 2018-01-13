package algorithms;

import java.util.*;

/**
 * Created by chaozeyi on 18/1/13.
 */

/**
 *Minimum Index Sum of Two Lists
 *
 *Suppose Andy and Doris want to choose a restaurant for dinner, and they both have a list of favorite restaurants represented by strings.

 You need to help them find out their common interest with the least list index sum. If there is a choice tie between answers, output all of them with no order requirement. You could assume there always exists an answer.

 Example 1:
 Input:
 ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 Output: ["Shogun"]
 Explanation: The only restaurant they both like is "Shogun".
 Example 2:
 Input:
 ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 ["KFC", "Shogun", "Burger King"]
 Output: ["Shogun"]
 Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 *
 */

/**
 * 在两个字符串数组中找出相等的项，并输出索引最小的
 * 需要注意的是，如果存在两项索引相等，则需要同时输出
 */
public class problem_599 {

    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < list1.length; i++){
            map.put(list1[i] , i);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list2.length && i <= min; i++){
            if(map.containsKey(list2[i])){
                int temp = i + map.get(list2[i]);
                if(temp == min)
                {
                    result.add(list2[i]);

                }
                if(temp < min){
                    min = temp;
                    result.clear();
                    result.add(list2[i]);
                }
            }
        }
        String[] res = new String[result.size()];
        return result.toArray(res);
    }
}
