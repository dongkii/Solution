package com.dongkii.solution.web.programmers.level0;

public class polynomialSum {
    public static String solution(String polynomial) {
        String answer = "";

        String[] st = polynomial.split("\\s");

        int sum = 0;
        String x = "0";

        for(int i = 0; i < st.length; i+=2) {
            if(st[i].contains("x")) {
                x = x.replaceAll("x", "");
                st[i] = st[i].replaceAll("x", "");
                if("".equals(st[i]))
                    st[i] = "1";
                x = String.valueOf(Integer.parseInt(x) + Integer.parseInt(st[i])) + "x";
            } else {
                sum += Integer.parseInt(st[i]);
            }
        }

        if("1x".equals(x)) x = "x";

        if(sum == 0) {
            answer = x;
        } else if("0".equals(x)){
            answer = String.valueOf(sum);
        } else {
            answer = x + " + " + String.valueOf(sum);
        }

        return answer;
    }
}
