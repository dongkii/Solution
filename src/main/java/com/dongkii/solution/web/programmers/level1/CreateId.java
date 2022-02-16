package com.dongkii.solution.web.programmers.level1;

import java.util.Locale;

public class CreateId {
    public static String solution(String new_id) {
        String answer = "";

        String tmp = new_id;

        // 1. 모든 대문자를 대응되는 소문자로 치환
        tmp = tmp.toLowerCase();

        // 2. 알파벳 소문자, 숫자, 하이픈, 언더스코어, 마침표 제외 문자 제거
        tmp = tmp.replaceAll("[^0-9a-z\\-\\_\\.]", "");

        // 3. 마침표가 2번 이상 연속된 부분을 하나의 마침표로 치환
        tmp = tmp.replaceAll("\\.+", ".");

        // 4. 마침표가 처음이나 끝에 위치한다면 제거
        if(tmp.length() > 0 && tmp.charAt(0) == '.') tmp = tmp.substring(1, tmp.length());
        if(tmp.length() > 0 && tmp.charAt(tmp.length()-1) == '.') tmp = tmp.substring(0, tmp.length()-1);



        // 5. 빈 문자열이라면 a를 대입
        if(tmp.length() == 0) tmp = "a";

        // 6. 길이가 16자 이상이면 첫 15개의 문자 제외한 나머지 문자 제거
        //    제거 후 마침표가 끝자리에 위치하면 마침표 제거
        if(tmp.length() > 15) {
            tmp = tmp.substring(0, 15);
            if(tmp.charAt(tmp.length()-1) == '.')
               tmp = tmp.substring(0, tmp.length()-1);
        }

        // 7. 길이가 2자 이하라면 마지막문제를 길이가 3이 될때까지 반복
        while(tmp.length() < 3) {
            tmp = tmp + tmp.substring(tmp.length()-1, tmp.length());
        }
        return tmp;
    }
}
