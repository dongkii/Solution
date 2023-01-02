package com.dongkii.solution.web.programmers.level0;

public class reverseArray {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[num_list.length-1-i];
        }


        /*
        Integer[] nums = Arrays.stream(num_list).boxed().toArray(Integer[]::new);

        Arrays.sort(nums, Collections.reverseOrder());

        int[] answer = Arrays.stream(nums).mapToInt(Integer::intValue).toArray();
         */

        return answer;
    }
}
