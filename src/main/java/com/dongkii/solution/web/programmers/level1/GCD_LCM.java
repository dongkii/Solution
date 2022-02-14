package com.dongkii.solution.web.programmers.level1;

public class GCD_LCM {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int high = (n > m)? n : m;
        int low = (n > m)? m : n;

        int gcdValue = gcd(high, low);
        int lcmValue = lcm(high, low, gcdValue);

        answer[0] = gcdValue;
        answer[1] = lcmValue;

        return answer;
    }

    public static int gcd(int a, int b) {
        if(a % b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }

    public static int lcm(int a, int b, int gcdValue) {
        return a * b / gcdValue;
    }
}
