package com.dongkii.solution.web.programmers.level0;

public class binarySum {
    public static String solution(String bin1, String bin2) {
        String answer = "";

        int a = translate(bin1);
        int b = translate(bin2);

        answer = Integer.toBinaryString(a+b);

        return answer;
    }

    public static int translate(String bin) {
        String[] bi = bin.split("");

        int result = 0;

        System.out.println(bin);

        for(int i = 0; i < bi.length; i++) {
            result += (int)Math.pow(2, i) * Integer.parseInt(bi[bi.length-1-i]);
        }

        return result;
    }
}
