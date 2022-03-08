package com.dongkii.solution.web.programmers.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Candidate_key {

    public static int answer = 0;

    public static int solution(String[][] relation) {
        candidate_check(relation);

        return answer;
    }

    public static void candidate_check(String[][] relation) {
        List<List<String>> mod = new ArrayList<List<String>>();

        for(int i = 0; i < relation[0].length; i++) {
            Set<String> dup = new HashSet<String>();
            List<String> list = new ArrayList<String>();

            // 각 튜플의 컬럼별로 중복되는 값이 있는지 확인
            for(int j = 0; j < relation.length; j++) {
                dup.add(relation[j][i]);
                list.add(relation[j][i]);
            }

            // 컬럼의 튜플 수와 전체 튜플수가 같으면 중복이 없으므로 후보키임
            if(dup.size() == relation.length) {
                answer +=1;
            } else {
                mod.add(list);
            }
        }

        String[][] tmp = new String[mod.get(0).size()][mod.size()-1];

        if(mod.size() != 0) {
            for(int i = 0; i < mod.get(0).size(); i++) {
                for(int j = 0; j < mod.size()-1; j++) {
                    //tmp[i][j] = mod.get(i).get(j);
                    tmp[i][j] = mod.get(j).get(i)+""+mod.get(j+1).get(i);
                }
            }

            System.out.println(tmp.length + "\t" + tmp[0].length);
            //candidate_check(tmp);
        }
    }
}
