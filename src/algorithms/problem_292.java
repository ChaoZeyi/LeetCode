package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 *You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones.
 * The one who removes the last stone will be the winner.
 * You will take the first turn to remove the stones.

 Both of you are very clever and have optimal strategies for the game.
 Write a function to determine whether you can win the game given the number of stones in the heap.

 For example, if there are 4 stones in the heap, then you will never win the game:
 no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 */

/**
 * 是有规律的，可以分为安全数字和死亡数字，
 * 不管是谁碰到了安全数字，都一定会赢，碰到了死亡数字，就一定会输
 */
public class problem_292 {

    public boolean canWinNim(int n) {
        if(n % 4 == 0)
            return false;
        else
            return true;
    }

}
