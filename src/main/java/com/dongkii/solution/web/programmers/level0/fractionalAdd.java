package com.dongkii.solution.web.programmers.level0;

public class fractionalAdd {
    public static int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int maxDe = 0;
        int minDe = 0;
        if(min == num1) {
            minDe = denum1;
            maxDe = denum2;
        } else {
            minDe = denum2;
            maxDe = denum1;
        }

        int numLcm = lcm(max, min, gcd(max, min));

        minDe = minDe * (numLcm/min);
        maxDe = maxDe * (numLcm/max);
        min = min * (numLcm/min);

        answer[0] = minDe + maxDe;
        answer[1] = min;
        System.out.println(answer[0] + " / " + answer[1]);

        max = Math.max(answer[0], answer[1]);
        min = Math.min(answer[0], answer[1]);

        int tmp = gcd(max, min);

        answer[0] /= tmp;
        answer[1] /= tmp;

        return answer;
    }

    public static int gcd(int a, int b) {
        if(a%b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }

    public static int lcm(int a, int b, int gcdValue) {
        return a * b / gcdValue;
    }
}
