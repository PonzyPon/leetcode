package leetcode.no0118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {
        System.out.println(new Solution().generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>(numRows);
        if (numRows == 0) {
            return lists;
        }
        lists.add(Arrays.asList(1));
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>(i + 1);
            list.add(1);
            List<Integer> previousList = lists.get(i - 1);
            for (int m = 1; m < i; m++) {
                list.add(previousList.get(m - 1) + previousList.get(m));
            }
            list.add(1);
            lists.add(list);
        }
        return lists;
    }

}
