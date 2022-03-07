package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skilltree {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;

        // 스킬트리 배열 반복문
        for(int i = 0; i < skill_trees.length; i++) {
            String tmp = "";    // 스킬트리배열에서 순서와 일치하는 문자열을 만들기 위해

            for(int j = 0; j < skill_trees[i].length(); j++) {  // 스킬트리배열의 원소의 각 스킬 순서 반복
                for(int t = 0; t < skill.length(); t++) {
                    if(skill_trees[i].charAt(j) == skill.charAt(t)) {   // 스킬트리의 순서와 스킬순서가 일치하는게 있으면
                        tmp += String.valueOf(skill.charAt(t));         // tmp 에 저장
                        break;
                    }
                }
            }

            if(skill.matches(tmp + ".*")) answer += 1;      // tmp의 저장된 내용이 skill에 포함되는경우 결과 1 추가
        }

        return answer;
    }
}
