package algorithms;

/**
 * Created by chaozeyi on 18/3/23.
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
        //��һ��һ��Ҫע�⣬��before��after���ܴ󣬽ӽ���int���͵����ֵʱ��
        //������Ӿͻ�Խ�磬��ɸ���������2֮�󣬻��Ǹ��������������ǵ�����
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
