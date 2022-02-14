package com.dongkii.solution.web.programmers.level1;

import java.util.*;

public class Mock_exam {
    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[] first = {1, 2, 3, 4, 5};                  // 1번 수포자가 찍는 수
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};        // 2번 수포자가 찍는 수
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};   // 3번 수포자가 찍는 수
        int[] answerCnt = {0, 0, 0};                    // 각 정답 갯수
        int[] repeat = {5, 8, 10};                      // 각 찍는 수 반복

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i%repeat[0]]) {
                answerCnt[0]++;
            }
            if(answers[i] == second[i%repeat[1]]) {
                answerCnt[1]++;
            }
            if(answers[i] == third[i%repeat[2]]) {
                answerCnt[2]++;
            }
        }

        int max = Math.max(answerCnt[0], answerCnt[1]);
        max = Math.max(max, answerCnt[2]);

        List<Integer> answerList = new ArrayList<Integer>();
        if(max == answerCnt[0]) answerList.add(1);
        if(max == answerCnt[1]) answerList.add(2);
        if(max == answerCnt[2]) answerList.add(3);

        return answerList.stream().mapToInt(a -> a).toArray();
    }
}
