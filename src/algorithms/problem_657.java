package algorithms;

/**
 * Created by chaozeyi on 18/1/11.
 */

/**
 * Judge Route Circle
 *
 *Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

 The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

 Example 1:
 Input: "UD"
 Output: true
 Example 2:
 Input: "LL"
 Output: false
 */

import java.util.LinkedList;
import java.util.List;

/**
 * 首先要清楚怎样才会回到原点，只有当U和D的个数相同，并且L和R的个数相同时，才会回到原点
 */
public class problem_657 {

    public boolean judgeCircle(String moves) {

        int countU = 0;
        int countD = 0;
        int countL = 0;
        int countR = 0;

        for(int i = 0; i < moves.length(); i++) {

            Character temp = moves.charAt(i);

            switch (temp) {
                case 'U': {
                    countU++;
                    break;
                }
                case 'D': {
                    countD++;
                    break;
                }
                case 'L': {
                    countL++;
                    break;
                }
                case 'R': {
                    countR++;
                    break;
                }

            }
        }

        if(countU==countD && countL==countR){
            return true;
        }else{
            return false;
        }

    }
}
