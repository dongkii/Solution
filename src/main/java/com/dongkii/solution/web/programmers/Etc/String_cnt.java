package com.dongkii.solution.web.programmers.Etc;

public class String_cnt {
    public static int solution(String line1, String line2) {
        int answer = 0;

        int i = 1;
        String line2_test = line2;

        while(true) {
            if(line1.matches(line2_test)) answer +=1;       // line1과 line2가 완벽하게 일치하는지 확인 ex) a___b___c == abcabcabc : 좌우측 아무 공백도 없을 때
            if(line1.matches(".+" + line2_test)) answer +=1;    // line2의 좌측공백이 1개 이상인경우와 line1이 일치하는지 확인 ex) ......abc : 좌측에만 공백이 있을 때
            if(line1.matches(line2_test + ".+")) answer +=1;    // line2의 우측공백이 1개 이상인경우와 line1이 일치하는지 확인 ex) abc...... : 우측에만 공백이 있을 때
            if(line1.matches(".+" + line2_test + ".+")) answer +=1; // line2의 좌우측공백이 각각 1개 이상인경우와 line1이 일치하는지 확인 ex) ...abc... : 좌우측으로 공백이 있을 때

            String tmp = "";
            //문자열 변형
            for(int j = 0; j < line2.length(); j++) {
                tmp += line2.charAt(j);

                for(int t = 0; t < i; t++) {
                    // 기존 문자열 line2의 각 인덱스 사이에 한개씩 들어가야되니 i의 수 만큼 늘어나야함
                    // ex) abc -> a_b_c -> a__b__c -> a___b___c
                    if(j != line2.length()-1) tmp += "[0-9a-zA-Z]";
                }
            }

            if(line1.length() < line2.length() + (line2.length()-1) * i) break;
            // _ 의 수는 line2의 길이 -1 개씩 늘어나므로 line2의 길이가 3이면  3 * ( 2 x i ) 이고, line1보다 커지면 변형문자열은 종료

            line2_test = tmp;
            i++;
        }

        return answer;
    }
}
