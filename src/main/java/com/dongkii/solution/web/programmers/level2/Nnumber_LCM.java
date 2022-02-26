package com.dongkii.solution.web.programmers.level2;

import java.util.Arrays;

public class Nnumber_LCM {
    public static int solution(int[] arr) {
        Arrays.sort(arr);
        int tmp = arr[0];

        for(int i = 1; i < arr.length; i++) {
            tmp = tmp * arr[i] / gcd(tmp, arr[i]);
        }

        return tmp;
    }

    public static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }
        return gcd(b, a%b);
    }
}