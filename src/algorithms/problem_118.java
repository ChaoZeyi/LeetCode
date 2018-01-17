package algorithms;

/**
 * Created by chaozeyi on 18/1/17.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle
 *
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
 [1],
 [1,1],
 [1,2,1],
 [1,3,3,1],
 [1,4,6,4,1]
 ]
 */

public class problem_118 {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if(numRows == 0){
            return result;
        }
        List<Integer> res = new ArrayList<>();
        res.add(1);
        result.add(res);
        int i = 1;
        while(i < numRows){
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int j = 1;
            while(j < i){
                int tempVal = result.get(i-1).get(j-1) + result.get(i-1).get(j);
                temp.add(tempVal);
                j++;
            }

            temp.add(1);
            result.add(temp);
            i++;
        }
        return result;
    }
}
