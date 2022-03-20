package com.dongkii.solution.web.programmers.Etc;

public class Q2 {
    public static String solution(String s){
        String answer = "";

        // 확장자 및 크기 배열
        String[] extArr = {"mp3,aac,flac", "jpg,bmp,gif", "mp4,avi,mkv"};
        int[] byteArr = {0, 0, 0, 0};

        // 개행으로 분리
        String[] sep = s.split("\n");

        for(int i = 0; i < sep.length; i++) {
            // 공백으로 분리
            String[] file = sep[i].split("\\s");

            // 확장자 체크
            String ext = file[0].substring(file[0].lastIndexOf(".") + 1, file[0].length());

            // 기타 다른 확장자인지 체크
            boolean chk = false;

            for(int j = 0; j < extArr.length; j++) {
                if(extArr[j].contains(ext)) {
                    byteArr[j] += Integer.parseInt(file[1].substring(0, file[1].length() - 1));
                    chk = true;
                    break;
                }
            }

            // 음악, 이미지, 영상이 아닐경우 기타확장자 추가
            if(!chk) byteArr[3] += Integer.parseInt(file[1].substring(0, file[1].length() - 1));
        }

        answer = "music " + byteArr[0] + "b\nimages " + byteArr[1] + "b\nmovies " + byteArr[2] + "b\nother " + byteArr[3] + "b";

        return answer;
    }
}
