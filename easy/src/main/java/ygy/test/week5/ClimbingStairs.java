package ygy.test.week5;

import java.util.HashMap;

/**
 * Created by guoyao on 2017/10/2.
 */
public class ClimbingStairs {

    public static HashMap<Thread,Integer> hashMap=new HashMap();

    public static void main(String[] args) throws InterruptedException {
        System.out.println(climbStairs(5));
    }


    /**
     * You are climbing a stair case. It takes n steps to reach to the top.
     Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     Note: Given n will be a positive integer.
     */
    public static int climbStairs(int n) {
        // 最后一步可以采用1步，也可以采用两步，其它与之前的可能性总数相同。
        //所以可能性是原始的f（n-1） 和 f（n-2）之和
        //所以总数为两者之和
        if(n == 0 || n == 1 || n == 2){return n;}
        int[] temp = new int[n];
        temp[0] = 1;
        temp[1] = 2;
        for(int i = 2; i < n; i++){
            temp[i] = temp[i-1] + temp[i-2];
        }
        return temp[n-1];
    }
}
