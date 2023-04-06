package com.dongkii.solution.web.programmers.level1;

public class wallpaper {
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int xmin = 51, xmax = 0, ymin = 51, ymax = 0;

        for(int y = 0; y < wallpaper.length; y++) {
            for(int x = 0; x < wallpaper[y].length(); x++) {
                String temp = String.valueOf(wallpaper[y].charAt(x));
                if("#".equals(temp)) {
                    xmin = Math.min(x, xmin);
                    xmax = Math.max(x, xmax);
                    ymin = Math.min(y, ymin);
                    ymax = Math.max(y, ymax);
                }
            }
        }

        answer[0] = ymin;
        answer[1] = xmin;
        answer[2] = ymax+1;
        answer[3] = xmax+1;

        return answer;
    }
}
