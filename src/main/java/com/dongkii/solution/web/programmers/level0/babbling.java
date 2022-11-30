package com.dongkii.solution.web.programmers.level0;

public class babbling {
    public static int solution(String[] babbling) {
        int answer = 0;

        String[] strArr = new String[] {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++) {

            int count = babbling[i].length();
            for(int j = 0; j < strArr.length; j++) {
                String tmp = babbling[i].replaceAll(strArr[j], "");
                if(babbling[i].length() != tmp.length()) {
                    count = count - strArr[j].length();
                }

                if(count == 0) break;
            }

            if(count == 0)
                answer++;
        }

        return answer;
    }
}
