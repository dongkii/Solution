package com.dongkii.solution.web.programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class visitLength {
    public static int solution(String dirs) {
        int answer = 0;

        Set<String> visit = new HashSet<>();
        String pre = "00";
        int x = 0;
        int y = 0;

        for(int i = 0; i < dirs.length(); i++) {
            char dir = dirs.charAt(i);
            switch(dir) {
                case 'U':
                    y += 1;
                    break;
                case 'R':
                    x += 1;
                    break;
                case 'D':
                    y -= 1;
                    break;
                case 'L':
                    x -= 1;
                    break;

            }

            x = x > 5 ? 5 : (x < -5 ? -5 : x);
            y = y > 5 ? 5 : (y < -5 ? -5 : y);

            String cur = String.valueOf(x) + String.valueOf(y);

            if(!pre.equals(cur)) {
                visit.add(cur.compareTo(pre) > 0 ? cur+pre : pre+cur);
                pre = cur;
            }
        }

        return visit.size();
    }
}
