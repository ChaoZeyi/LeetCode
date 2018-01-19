package algorithms;

/**
 * Created by chaozeyi on 18/1/19.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Pascal's Triangle II
 *
 *Given an index k, return the kth row of the Pascal's triangle.

 For example, given k = 3,
 Return [1,3,3,1].
 */
public class problem_119 {

    public List<Integer> getRow(int rowIndex) {


        List<Integer> res = new ArrayList<>();
        res.add(1);


        for(int i = 1; i <= rowIndex; i++){
            int j = i - 1;

            while(j > 0)
            {

                int temp = res.get(j - 1) + res.get(j);
                res.set(j, temp);
                j--;

            }

            res.add(1);
        }
        return res;
    }
}
