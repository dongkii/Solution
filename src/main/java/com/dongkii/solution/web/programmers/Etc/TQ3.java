package com.dongkii.solution.web.programmers.Etc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TQ3 {
    public static String solution(String tstring, String[][] variables) {
        String answer = tstring;

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put(answer, 1);

        while(true) {
            System.out.println(answer);
            if(map.get(answer) == null || map.get(answer) < 2) {
                List<Integer> left = new ArrayList<Integer>();
                List<Integer> right = new ArrayList<Integer>();
                List<String> str = new ArrayList<String>();
                List<String> ext = new ArrayList<String>();

                for(int i = 0; i < answer.length(); i++) {
                    if('{' == answer.charAt(i)) left.add(i);
                    if('}' == answer.charAt(i)) right.add(i);
                }

                for(int i = 0; i < left.size(); i++) {
                    if(i == 0) {
                        ext.add(answer.substring(0, left.get(i)));
                    } else {
                        ext.add(answer.substring(right.get(i-1)+1, left.get(i)));
                    }

                    boolean chk = false;
                    for(int j = 0; j < variables.length; j++) {
                        if(answer.substring(left.get(i)+1, right.get(i)).equals(variables[j][0])) {
                            str.add(variables[j][1]);
                            chk = true;
                            break;
                        }
                    }

                    if(!chk) str.add("{" + answer.substring(left.get(i)+1, right.get(i)) + "}");
                }

                if(str.size() > 0) {
                    String temp = "";
                    for (int i = 0; i < str.size(); i++) {
                        temp = temp + ext.get(i) + str.get(i);
                    }

                    answer = temp;
                    if (ext.size() != str.size()) {
                        answer += ext.get(ext.size() - 1);
                    }
                }

                if(map.get(answer) == null) {
                    map.put(answer, 1);
                } else {
                    map.put(answer, map.get(answer)+1);
                }

            } else {
                break;
            }
        }

        return answer;
    }
}
