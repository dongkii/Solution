package com.dongkii.solution.web.programmers.Etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class YQ1 {
    static String[] arr;
    static int len;
    static int max;

    public static int solution(String[] A) {
        arr = Arrays.copyOf(A, A.length);
        len = arr.length;

        for(int i = len; i > 1; i--) {
            combination(new ArrayList<String>(), 0, i);
        }

        return max;
    }

    public static void combination(ArrayList<String> list, int idx, int cnt) {
        if(cnt == 0) {
            String tmp = String.join("", list);
            if(calculate(tmp)) {
                max = max > tmp.length() ? max : tmp.length();
            }
            return;
        }

        for(int i = idx; i < len; i++) {
            list.add(arr[i]);
            combination(list, i + 1, cnt - 1);
            list.remove(list.size() - 1);
        }
    }

    public static boolean calculate(String B) {
        boolean result = true;

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < B.length(); i++) {
            char tmp = B.charAt(i);
            if(map.get(tmp) == null) {
                map.put(tmp, 1);
            } else {
                return false;
            }
        }

        return result;
    }
}
