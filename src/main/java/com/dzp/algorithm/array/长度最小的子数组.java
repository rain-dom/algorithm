package com.dzp.algorithm.array;

public class 长度最小的子数组 {

    // 滑动窗口
    public static int minSubArrayLen(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target) {
                minSize = Math.min(r - l + 1, minSize);
                sum = sum - nums[l++];
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    // 双层for循环
    public static int minSubArrayLen2(int target, int[] nums) {
        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum >= target) {
                    int subSize = j - i + 1;
                    minSize = minSize < subSize ? minSize : subSize;
                    break;
                }
            }
        }
        return minSize == Integer.MAX_VALUE ? 0 : minSize;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        minSubArrayLen(7, nums);

    }


}
