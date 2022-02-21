package com.dongkii.solution.web.programmers.level2;

public class NextBigNumber {
    public static int solution(int n) {
        int answer = 0;

        int tmp = n;
        int cnt = 0;

        while(true) {
            int i = 0;
            int tmpN = tmp;
            while(Math.pow(2, i) <= tmpN) i++;      // tmp 값의 자리수를 구함

            int tmpCnt = 0;

            String tmpStr = "";
            for(int j = 0; j < i; j++) {        // 2진법으로 표현
                tmpStr += String.valueOf(tmpN/(int)Math.pow(2, i-j-1));
                tmpN = tmpN%(int)Math.pow(2, i-j-1);
            }

            for(int k = 0; k < tmpStr.length(); k++) {  // 1의 갯수 체크
                if('1' == tmpStr.charAt(k)) tmpCnt+=1;
            }

            if(cnt == 0) {      // 0이면 n값의 이진법 1의 갯수
                cnt = tmpCnt;
            } else if(cnt == tmpCnt){      // n값의 이진법 1의 갯수와 같으면 break 처리
                break;
            }

            tmp+=1;
        }

        return tmp;
    }
}
