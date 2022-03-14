package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Maximize_the_formula {
    static char[] prior = {'+', '-', '*'};
    static boolean[] check = new boolean[3];
    static List<Long> numArr = new ArrayList<Long>();  // 숫자만을 가지는 배열
    static List<Character> calArr = new ArrayList<Character>(); // 연산만을 가지는 배열
    static long answer = 0;

    public static long solution(String expression) {
        // 문자열을 리스트로 변환
        String val = "";
       for(int i = 0; i < expression.length(); i++) {
            String tmp = String.valueOf(expression.charAt(i));

            if(Pattern.matches("[0-9]", tmp)) { // 숫자일 경우 concat
                val += tmp;
            } else {                                  // 숫자가 아닐경우 각각 리스트에 저장
                numArr.add(Long.parseLong(val));
                val = "";
                calArr.add(expression.charAt(i));
            }

        }
        if(!"".equals(val)) numArr.add(Long.parseLong(val));

        dfs(0, new char[3]);

        return answer;
    }

    public static void dfs(int count, char[] p) {
        if(count == 3) {
            ArrayList<Long> copyNum = new ArrayList<Long>(numArr);
            ArrayList<Character> copyCal = new ArrayList<Character>(calArr);

            // 우선순위에 맞게 계산. list index 주의
            // 숫자ㅡㄴ 연산자보다 항상 1개가 많다.
            for(int i = 0; i < p.length; i++) {
                for(int j = 0; j < copyCal.size(); j++) {
                    if(p[i] == copyCal.get(j)) {
                        // 리스트는 지울 때 한칸씩 밀리고 배열의 사이즈가 변하므로
                        // j를 두번 remove하고 j-- 처리
                        Long res = calc(copyNum.remove(j), copyNum.remove(j), p[i]);
                        copyNum.add(j, res);
                        copyCal.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(copyNum.get(0)));
            return;
        }

        for(int i = 0; i < 3; i++) {
            if(!check[i]) {
                check[i] = true;
                p[count] = prior[i];
                dfs(count + 1, p);
                check[i] = false;
            }
        }
    }

    public static Long calc(Long num1, Long num2, char op) {
        long num = 0;
        switch(op) {
            case '+' :
                return num1 + num2;
            case '-' :
                return num1 - num2;
            case '*' :
                return num1 * num2;
        }

        return num;
    }
}
