package com.dongkii.solution.web.programmers.level1;

public class foodFight {
    public static String solution(int[] food) {
        String left = "";
        String right = "";

        for(int i = 1; i < food.length; i++) {
            if(food[i] % 2 != 0) {
                food[i] -= 1;
            }

            for(int j = 0; j < food[i]/2; j++) {
                left = left + i;
                right = i + right;
            }
        }

        return left + 0 + right;
    }
}
