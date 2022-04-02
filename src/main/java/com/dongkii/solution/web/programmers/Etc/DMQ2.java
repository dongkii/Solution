package com.dongkii.solution.web.programmers.Etc;

import java.util.HashSet;
import java.util.Set;

public class DMQ2 {
    public static int solution(String[] grid) {
        int answer = -1;

        for(int i = 0; i < grid.length; i++) {
            int rowcase = 0;
            for(int j = 0; j < grid[i].length(); j++) {
                if('?' == grid[i].charAt(j)) {
                    Set<Character> set = new HashSet<Character>();
                    if(j == 0) {
                        set.add(grid[i].charAt(j + 1));
                    } else if(j == grid[i].length()-1) {
                        set.add(grid[i].charAt(j - 1));
                    } else {
                        set.add(grid[i].charAt(j + 1));
                        set.add(grid[i].charAt(j - 1));
                    }

                    if(i == 0) {
                        set.add(grid[i+1].charAt(j));
                    } else if(i == grid.length-1) {
                        set.add(grid[i-1].charAt(j));
                    } else {
                        set.add(grid[i+1].charAt(j));
                        set.add(grid[i-1].charAt(j));
                    }

                    System.out.println(set.size());

                    rowcase = set.size();
                }
            }

            if(rowcase > 0) {
                answer *= rowcase;
            }
        }

        return answer;
    }
}
