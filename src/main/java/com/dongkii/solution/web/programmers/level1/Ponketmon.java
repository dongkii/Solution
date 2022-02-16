package com.dongkii.solution.web.programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class Ponketmon {
    public static int solution(int[] nums) {
        int answer = 0;

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        return nums.length/2 > set.size() ? set.size() : nums.length/2;
    }
}
