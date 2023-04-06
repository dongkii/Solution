package com.dongkii.solution.web.programmers.level1;

public class memoryScore {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for(int i = 0; i < photo.length; i++) {
            int sum = 0;

            for(int j = 0; j < photo[i].length; j++) {
                String temp = photo[i][j];

                for(int t = 0; t < name.length; t++) {
                    if(temp.equals(name[t])) {
                        sum += yearning[t];
                        break;
                    }
                }
            }

            answer[i] = sum;
        }

        return answer;
    }
}
