package com.dongkii.solution.web.programmers.Etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HQ3 {
    public static int solution(int[] nums, int k) {
        int answer = 0;

        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        if(k > nums.length) {
            for(int i = 2; i < nums.length+1; i++) {
                findList(nums, list, i);
            }
        }

        list.sort(Comparator.naturalOrder());

        return list.get(k-1);
    }

    public static void findList(int[] nums, List<Integer> list, int n) {
        for(int i = 0; i <= nums.length-n; i++) {
            int sum = 0;
            for(int j = 0; j < n; j++) {
                sum += nums[i+j];
            }
            list.add(sum);
        }
    }
}
