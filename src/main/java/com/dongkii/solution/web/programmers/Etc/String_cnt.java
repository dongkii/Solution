package com.dongkii.solution.web.programmers.Etc;

public class String_cnt {
    public static int solution(String line1, String line2) {
        int answer = 0;

        int i = 1;
        String line2_test = line2;

        while(true) {
            if(line1.matches(line2_test)) answer +=1;
            if(line1.matches(".+" + line2_test)) answer +=1;
            if(line1.matches(line2_test + ".+")) answer +=1;
            if(line1.matches(".+" + line2_test + ".+")) answer +=1;

            String tmp = "";
            //문자열 변형
            for(int j = 0; j < line2.length(); j++) {
                tmp += line2.charAt(j);

                for(int t = 0; t < i; t++) {
                    if(j != line2.length()-1) tmp += "[0-9a-zA-Z]";
                }
            }

            if(line1.length() < line2.length() + (line2.length()-1) * i) break;

            line2_test = tmp;
            i++;
        }

        return answer;
    }
}
