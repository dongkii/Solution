package com.dongkii.solution.web.programmers.level2;

public class Ngame {
    public static String solution(int n, int t, int m, int p) {
        // 진법 n
        // 미리 구할 숫자의 갯수 t
        // 게임에 참가하는 인원 m
        // 튜브의 순서 p

        String tmpStr = "0";
        int a = 1;

        while(tmpStr.length() < m*t) {
            int q = 0;                  // n진법 몇자리 수까지 표현하는지
            while(Math.pow(n, q) <= a ) q++; // 자리수를 알기위한 포문

            int tmp = a;
            for(int j = 0; j < q; j++) {    // 각 a값에 해당하는 n진법을 tmpStr에 저장
                int w = tmp/(int)Math.pow(n, q-j-1);
                String e = String.valueOf(w);
                switch (w) {
                    case 10: e = "A"; break;
                    case 11: e = "B"; break;
                    case 12: e = "C"; break;
                    case 13: e = "D"; break;
                    case 14: e = "E"; break;
                    case 15: e = "F"; break;
                }
                tmpStr += e;
                tmp = tmp%(int)Math.pow(n, q-j-1);
            }

            a++;
        }

        tmpStr = tmpStr.substring(0, m*t);  // 문자열이 더 길어도 사람수 x 말해야하는 숫자보다 커지면 안됨

        String answer = "";

        for(int i = 0; i < tmpStr.length(); i++) {
            if(i%m == p-1) answer += tmpStr.charAt(i);
        }

        return answer;
    }
}

/*
0 1 1 0 1 1 1 0 0 1 0 1  110 111 1000
 */