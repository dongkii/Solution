package com.dongkii.solution.web.programmers.Etc;

import java.util.*;

public class HQ1 {
    public static int solution(int n, int[][] meetings) {
        int answer = 0;

        HashMap<Integer, Integer> sch = new LinkedHashMap<>();
        int[] cnt = new int[n];
        int[] room = new int[n];


        for(int i = 0; i < meetings.length; i++) {
            // 시작시간, 회의시간
            sch.put(meetings[i][0], meetings[i][1]-meetings[i][0]);
        }

        int t = 0;
        int i = 0;
        while(sch.size() > 0) {
            if(sch.get(t) != null) {
                System.out.println("시작시간 : " + t + " / 걸리는시간 " + sch.get(t));
                for(int j = 0; j < n; j++) {
                    if(room[j] == 0) {
                        System.out.println("room 번호(초기화) : " + j);
                        room[j] = sch.get(t)+t;
                        cnt[j] += 1;
                        sch.remove(t);
                        t++;
                        break;
                    } else if(room[j] <= i) {
                        System.out.println("room 번호 : " + j);
                        room[j] += sch.get(t);
                        cnt[j] +=1;
                        sch.remove(t);
                        t++;
                        break;
                    }
                }
            } else {
                t++;
            }

            i++;
        }

        System.out.println(Arrays.toString(Arrays.stream(cnt).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(room).toArray()));

        int[] srt = Arrays.copyOf(cnt, cnt.length);
        Arrays.sort(srt);

        for(int k = 0; k < srt.length; k++) {
            if(srt[srt.length-1] == cnt[k]) {
                answer = k;
                break;
            }

        }

        return answer;
    }
}
