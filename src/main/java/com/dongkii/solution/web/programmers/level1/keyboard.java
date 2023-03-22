package com.dongkii.solution.web.programmers.level1;

public class keyboard {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        for(int i = 0; i < targets.length; i++) {
            String tmp = targets[i];
            int sum = 0;
            for(int j = 0; j < tmp.length(); j++) {
                String tmpChar = String.valueOf(tmp.charAt(j));
                int min = 99999;

                for(int t = 0; t < keymap.length; t++) {
                    if(keymap[t].indexOf(tmpChar) > -1) {
                        min = Math.min(min, keymap[t].indexOf(tmpChar) + 1 );
                    }
                }

                sum += min;
            }

            answer[i] = sum >= 99999? -1 : sum;
        }

        return answer;
    }
}
