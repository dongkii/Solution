package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class Just_that_song {
    public static String solution(String m, String[] musicinfos) {
        String answer = "";

        int max = 0;

        for(int i = 0; i < musicinfos.length; i++) {
            String start = musicinfos[i].split(",")[0]; // 시작시간
            String end = musicinfos[i].split(",")[1]; // 끝난시간
            String name = musicinfos[i].split(",")[2]; // 곡제목
            String song = musicinfos[i].split(",")[3]; // 음


            // 음악이 재생된 시간을 계산
            int minute = (Integer.parseInt(end.split(":")[0]) - Integer.parseInt(start.split(":")[0])) * 60 + (Integer.parseInt(end.split(":")[1]) - Integer.parseInt(start.split(":")[1]));

            List<String> songList = toStrArr(song);
            List<String> mList = toStrArr(m);

            int t = 0;

            // 음악이 재생시간동안 나온 음 체크 -> 재생시간동안 나온 음을 문자열리스트에 저장
            for(int j = 0; j < song.length(); j++) {
                if(song.charAt(j) == '#') {
                    String pre = songList.get(t-1);
                    songList.remove(t-1);
                    songList.add(pre + "#");
                } else {
                    songList.add(String.valueOf(song.charAt(j)));
                    t++;
                }
            }

            t = 0;
            // 들은 음을 문자열리스트에 저장
            for(int j = 0; j < m.length(); j++) {
                if(m.charAt(j) == '#') {
                    String pre = son
                }
            }
        }

        return answer;
    }

    public static List<String> toStrArr(String um) {
        List<String> umList = new ArrayList<String>();

        int j = 0;
        for(int i = 0; i < um.length(); i++) {
            if(um.charAt(i) == '#') {
                String pre = umList.get(j-1);
                umList.remove(j-1);
                umList.add(pre + "#");
            } else {
                umList.add(String.valueOf(um.charAt(i)));
                j++;
            }
        }

        return umList;
    }
}
