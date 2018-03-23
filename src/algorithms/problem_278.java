package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
 */

/**
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one,
 * which causes all the following ones to be bad.

 You are given an API bool isBadVersion(version) which will return whether version is bad.
 Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class problem_278 {
    public int firstBadVersion(int n) {
        return helper(1, n);


    }
    public int helper(int before, int after){

        if(isBadVersion(before))
            return before;
        if((after - before) == 1)
            return after;
        //这一点一定要注意，当before和after都很大，接近于int类型的最大值时，
        //两者相加就会越界，变成负数，除以2之后，还是负数，不符合我们的期望
        //int between = (before + after)/2;
        int between = before + (after - before)/2;
        if(isBadVersion(between))
            return helper(before, between);
        else
            return helper(between + 1, after);

    }
    public boolean isBadVersion(int version){
        return true;
    }
}
