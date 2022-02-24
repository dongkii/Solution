package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Just_that_song {
    public static String solution(String m, String[] musicinfos) {
        String answer = "(None)";

        int max = 0;

        for(int i = 0; i < musicinfos.length; i++) {
            String start = musicinfos[i].split(",")[0]; // 시작시간
            String end = musicinfos[i].split(",")[1]; // 끝난시간
            String name = musicinfos[i].split(",")[2]; // 곡제목
            String song = musicinfos[i].split(",")[3]; // 멜로디

            // 음악이 재생된 시간을 계산
            int minute = (Integer.parseInt(end.split(":")[0]) - Integer.parseInt(start.split(":")[0])) * 60 + (Integer.parseInt(end.split(":")[1]) - Integer.parseInt(start.split(":")[1]));

            // 각 음을 리스트로 변환
            String melody = toStrArr(song, minute);
            String hearM = toStrArr(m, 0);

            // contains함수를 이용해 들은 멜로디와 일치하는 음악을 찾는다
            if(melody.contains(hearM) && max < minute) {
                answer = name;
                max = minute;
            }
        }

        return answer;
    }

    public static String toStrArr(String melody, int minute) {
        String result = "";

        // #이 붙은 음을 소문자로 치환
        melody = melody.replace("A#", "a")
                .replace("B#", "b")
                .replace("C#", "c")
                .replace("D#", "d")
                .replace("E#", "e")
                .replace("F#", "f")
                .replace("G#", "g");

        // 멜로디를 반복, 0일경우는 들은 멜로디라 반복하지 않는다.
        if(minute == 0) minute = melody.length();
        for(int i = 0; i < minute; i++) {
            result += melody.charAt(i%melody.length());
        }

        return result;
    }
}
