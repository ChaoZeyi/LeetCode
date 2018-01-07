package algorithms;

/**
 * Created by chaozeyi on 18/1/7.
 */
public class problem_70 {

    public static int climbStairs(int n) {
        if(n <= 0)
            return 0;
        if(n == 1)
            return 1;
        if(n == 2)
            return 2;

        //从后往前走

        //第一步先走one step
        int one_step = 2;
        //第一步先走two step
        int two_step = 1;

        int count = 0;

        for(int i = 3; i <= n; i++){
            count = one_step + two_step;
            two_step = one_step;
            one_step = count;

        }
        return count;


    }
}
