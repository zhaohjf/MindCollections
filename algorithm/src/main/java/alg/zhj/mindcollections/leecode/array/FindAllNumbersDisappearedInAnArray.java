package alg.zhj.mindcollections.leecode.array;

//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements of [1, n] inclusive that do not appear in this array.
//
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
//
//Example:
//
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by zhaohongjie on 2018/10/18.
 */
public class FindAllNumbersDisappearedInAnArray {

    /**
     * 初始化辅助Map数据结构，key为1~n，对应value均初始化为1
     *
     * 遍历数组，出现过的数字，将期对应key的value置为-1；遍历结束后，返回value不为-1的key的数组
     *
     * @param nums
     * @return
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= nums.length; i++) {
            map.put(i, 1);
        }

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], -1);
            }
        }

        for(int i: map.keySet()) {
            if(map.get(i) != -1) {
                result.add(i);
            }
        }

        return result;
    }

}
