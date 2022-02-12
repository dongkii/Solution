package com.dongkii.solution.web.programmers.level1;

public class Dart {
    public static int solution(String dartResult) {
        int answer = 0;

        int[] round = new int[3];
        int j = -1;

        char preStr = 0;
        for(int i = 0; i < dartResult.length(); i++) {
            String tmp = String.valueOf(dartResult.charAt(i));

            if("SDT".contains(tmp)) { // 문자열이 SDT 중 하나일경우
                round[j] = (int)Math.pow(round[j], ("T".equals(tmp) ? 3 : ("D".equals(tmp) ? 2 : 1)) );
            } else if("#*".contains(tmp)) { // 문자열이 #* 중 하나일경우
                round[j] *= "*".equals(tmp) ? 2 : -1;       // *일경우 해당점수 *2 #일경우 해당점수 *(-1)
                if(j > 0) {
                    round[j-1] *= "*".equals(tmp) ? 2 : 1;  // *일경우만 이전값 *2
                }
            } else {    // 문자열이 SDT*#이 아닐경우 j++
                if("0".equals(tmp) && ('0' <= preStr && preStr <= '9')) {
                    round[j] = 10;
                } else {
                    j++;
                    round[j] = Integer.valueOf(tmp);
                }
            }

            preStr = dartResult.charAt(i);
        }

        answer = round[0] + round[1] + round[2];

        return answer;
    }
}
