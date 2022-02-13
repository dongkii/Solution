package com.dongkii.solution.web.programmers.level1;
;
import java.util.*;

public class Create_Decimal {
    public static int solution(int[] nums) {
        int answer = 0;

        for(int i = 0; i < nums.length-2; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    // 각 인덱스를 더하기위해 3중포문
                    int tmp = nums[i]+nums[j]+nums[k];
                    int devideCnt = 0;
                    for(int m = 2; m <= Math.sqrt(tmp); m++) {
                        if(tmp % m == 0) {
                            devideCnt++;
                        }
                        if(devideCnt > 0) break;
                    }
                    if(devideCnt == 0) {
                        System.out.println(tmp);
                        answer++;
                    }
                }
            }
        }


        return answer;
    }
}
