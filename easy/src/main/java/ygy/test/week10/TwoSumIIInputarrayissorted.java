package ygy.test.week10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by guoyao on 2017/11/4.
 */
public class TwoSumIIInputarrayissorted {

    public int[] twoSum(int[] numbers, int target) {

        if(numbers == null || numbers.length == 0 ) return  null ;

        Map<Integer, Integer> map=new HashMap<>();
        for(int i = 0 ; i < numbers.length ; i ++) {
            int remain = target - numbers[i] ;
            if (map.containsKey(remain)) {
                return new int[]{map.get(remain)+1,i+1};
            }
            map.put(numbers[i], i);
        }
        return null ;
    }


    //leetcode answer
    public int[] twoSum_1(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] > target) r--;
            else l++;
        }
        return new int[]{l + 1, r + 1};
    }

    //leetcode answer
    public int[] twoSum_2(int[] num, int target) {
        int[] indice = new int[2];
        if (num == null || num.length < 2) return indice;
        int left = 0, right = num.length - 1;
        while (left < right) {
            int v = num[left] + num[right];
            if (v == target) {
                indice[0] = left + 1;
                indice[1] = right + 1;
                break;
            } else if (v > target) {
                right --;
            } else {
                left ++;
            }
        }
        return indice;
    }
}
