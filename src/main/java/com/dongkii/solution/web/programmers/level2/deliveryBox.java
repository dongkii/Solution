package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class deliveryBox {
    public static int solution(int[] order) {
        Stack<Integer> st = new Stack<>();
        int idx = 0;
        int start = 1;

        while(start <= order.length) {
            st.push(start++);

            while(st.peek() == order[idx]) {
                st.pop();
                idx++;
                if(st.empty()) break;
            }
        }

        return idx;
    }
}
