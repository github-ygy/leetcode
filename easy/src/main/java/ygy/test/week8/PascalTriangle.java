package ygy.test.week8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guoyao on 2017/10/22.
 */
public class PascalTriangle {


    public static void main(String[] args) {

        System.out.println(generate(3));

    }


    /**
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

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resultList=new ArrayList<>();
        if( numRows <0) return resultList;
        List<Integer> rows=null ;
        for(int i = 0 ; i <numRows ; i ++) {
            rows=new ArrayList<>();
            for(int j =0 ; j <=i ;j ++) {
                if (j == 0 || j == i)
                    rows.add(1);
                else
                    rows.add(resultList.get(i - 1).get(j - 1) + resultList.get(i - 1).get(j));
            }
            resultList.add(rows);
        }
        return resultList;
    }
}
