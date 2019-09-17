package com.biwin.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Description 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 * 示例如下：
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @auther wangli
 * @create 2019-08-30 15:20
 */
public class TwoNum {
    /**
     * 执行耗时：127 ms	内存消耗：38.1 MB
     */
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++){
                if( i!=j && (nums[i] + nums[j] == target)){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
    /**
     * 执行耗时：1 ms	内存消耗：38.4 MB
     */
    public int[] twoSum2(int[] nums, int target){
        int len = 2047;
        int[] numMap = new int[len + 1];
        int temp;
        for (int i = 0; i < nums.length; i++) {
            temp = (target - nums[i]) & len;
            if (numMap[temp] != 0) {
                return new int[]{numMap[temp] - 1, i};
            }
            numMap[nums[i] & len] = i + 1;
        }
        return null;
    }

    public static void main(String[] args) {
        TwoNum twoNum = new TwoNum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoNum.twoSum2(nums, target)));
//        System.out.println(Arrays.toString(twoNum.twoSum(nums, target)));
    }

}
