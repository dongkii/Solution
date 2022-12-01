package com.dongkii.solution.web.programmers.level0;

public class oxQuiz {
    public static String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for(int i = 0; i < quiz.length; i++) {
            String[] tmp = quiz[i].split("\\s");

            int lAns = "+".equals(tmp[1])?Integer.parseInt(tmp[0])+Integer.parseInt(tmp[2]):Integer.parseInt(tmp[0])-Integer.parseInt(tmp[2]);
            int rAns = Integer.parseInt(tmp[4]);

            answer[i] = lAns==rAns?"O":"X";
        }

        return answer;
    }
}
