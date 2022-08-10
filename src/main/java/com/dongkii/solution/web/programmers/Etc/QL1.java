package com.dongkii.solution.web.programmers.Etc;

public class QL1 {
    public static String solution(int input) {
        String result = "";

        boolean chk = false;

        if(input < 0)
            chk = true;

        int abs = Math.abs(input);
        int len = String.valueOf(abs).length();
        int mod = len%3;

        int i = mod;
        result = String.valueOf(abs).substring(0, i);
        while( i < len ) {
            if( i != 0 ) result += ",";

            result += String.valueOf(abs).substring(i, i+3);

            i+=3;
        }

        return chk?"-"+result:result;
    }
}
