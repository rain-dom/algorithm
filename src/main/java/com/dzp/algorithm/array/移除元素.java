package com.dzp.algorithm.array;

public class 移除元素 {

    public int removeElement(int[] nums, int val) {
        int fastIndex = 0;
        int slowIndex;
        // 不用管当前位置是什么，快指针负责移动，满指针负责覆盖。不用管具体怎么覆盖
        for (slowIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

}
