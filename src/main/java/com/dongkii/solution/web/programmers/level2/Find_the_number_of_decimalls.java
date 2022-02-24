package com.dongkii.solution.web.programmers.level2;

public class Find_the_number_of_decimalls {
    public static int solution(int n, int k) {
        int answer = 0;
        String answerStr = "";

        int i = 0;
        while(Math.pow(k, i) <= n) i++;
        
        int tmp = n;
        // k진법으로 변환
        for(int j = 0; j < i; j++) {
            answerStr += String.valueOf(tmp/(int)Math.pow(k, i-j-1));
            tmp = tmp%(int)Math.pow(k, i-j-1);
        }

        // 연속된 숫자 0을 하나로 치환하고 0으로 split
        String[] pArr = answerStr.replaceAll("[0]{2,}", "0").split("0");

        for(int t = 0; t < pArr.length; t++) {  // 조건의 맞는 수를 가지고 소수 판별
            long temp = Long.parseLong(pArr[t]);
            int prime = 0;
            if(temp != 1) {  // 1은 소수가 아니기 때문
                for(int m = 2; m <= Math.sqrt(temp); m++) {
                    if(temp%m == 0) {       // m으로 나누어지면 소수가 아니므로 break;
                        prime++;
                        break;
                    }
                }
                if(prime == 0) answer++;    // 1을 제외하고 나누어지는 수가 없을경우 소수로 판별
            }
        }

        return answer;
    }
}
