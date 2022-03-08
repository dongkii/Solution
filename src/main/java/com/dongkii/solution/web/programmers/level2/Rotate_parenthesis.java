package com.dongkii.solution.web.programmers.level2;

import java.util.Stack;

public class Rotate_parenthesis {
    public static int solution(String s) {
        int answer = 0;

        String tmp = s;

        for(int i = 0; i < s.length(); i++) {
            if(i != 0) {        // 회전
                tmp = tmp.substring(1, tmp.length()) + tmp.charAt(0);
            }

            // 괄호가 올바른지 확인
            Stack<Character> st = new Stack<Character>();
            boolean chk = true;
            for(int j = 0; j < tmp.length(); j++) {
                char ch = tmp.charAt(j);

                if((ch == ']' || ch == ')' || ch == '}')) {
                    if(st.empty()) {
                        chk = false;
                        break;
                    } else {
                        char tmpCh = st.pop();
                        if((tmpCh == '[' && ch != ']') || (tmpCh == '{' && ch != '}') || (tmpCh == '(' && ch != ')')) {
                            chk = false;
                            break;
                        }
                    }
                } else {
                    st.push(ch);
                }
            }

            if(chk && st.empty()) answer += 1;
        }

        return answer;
    }
}
