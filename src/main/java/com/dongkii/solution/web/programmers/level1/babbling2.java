package com.dongkii.solution.web.programmers.level1;

public class babbling2 {
    public static int solution(String[] babbling) {
        int answer = 0;

        String[] strArr = new String[] {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++) {
            if(!babbling[i].contains(strArr[0]+strArr[0]) &&
                    !babbling[i].contains(strArr[1]+strArr[1]) &&
                    !babbling[i].contains(strArr[2]+strArr[2]) &&
                    !babbling[i].contains(strArr[3]+strArr[3])){
                String tmp = babbling[i].replaceAll("aya", "1")
                        .replaceAll("ye", "1")
                        .replaceAll("woo", "1")
                        .replaceAll("ma", "1");

                if(tmp.replaceAll("1", "").length() == 0){
                    answer++;
                }
            }
        }

        return answer;
    }
}
