package com.dongkii.solution.web.programmers.Etc;

import java.util.ArrayList;
import java.util.List;

public class TQ1 {
    public static String[] solution(String path) {
        // left = E->N, N->W, W->S, S->E
        // right = E->S, S->W, W->N, N->E

        List<Integer> list = new ArrayList<Integer>();

        String pre = "";
        int t = 0;
        for(int i = 0; i < path.length(); i++) {
            String tmp = String.valueOf(path.charAt(i));

            if(!tmp.equals(pre)) {
                pre = tmp;
                if(i != 0) {
                    list.add(t);
                    t = 0;
                }
            } else {

            }
            t++;
        }

        String[] answer = new String[list.size()];

        pre = "";
        int j = 0;
        for(int i = 0; i < path.length(); i++) {
            String tmp = String.valueOf(path.charAt(i));
            if(!tmp.equals(pre) && j < answer.length) {
                int dis = list.get(j) > 5 ? 5 : list.get(j);
                int time = list.get(j) > 5 ? list.get(j)-5+i : i;

                answer[j] = "Time " + time + ": Go straight " + dis + "00m and turn " + turn(tmp, String.valueOf(path.charAt(list.get(j)+i)));
                j++;
                pre = tmp;
            }
        }

        return answer;
    }

    // 방향
    public static String turn(String pre, String next) {
        String left = "EN, NW, WS, SE";
        if(left.contains(pre+next)) {
            return "left";
        } else {
            return "right";
        }
    }
}
