package com.dongkii.solution.web.programmers.level2;

import java.util.*;
import java.util.stream.Collectors;

public class Coloring {
    public static int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        Map<Integer, List<int[]>> map = new HashMap<Integer, List<int[]>>(); // 각 원소 값 리스트를 만듦

        for(int i = 0; i < picture.length; i++) {
            for(int j = 0; j <picture[0].length; j++) {
                List<int[]> list = new ArrayList<int[]>();  // 각 원소를 키값으로, 각 원소의 좌표를 리스트로 가지는 맵을 만듬
                if(map.get(picture[i][j]) != null) {
                    list = map.get(picture[i][j]);
                }

                list.add(new int[] {i, j});
                map.put(picture[i][j], list);
            }
        }

        Map<Integer, Integer> areaCnt = new HashMap<Integer, Integer>();

        int areaidx = 0;

        for(int t = 0; t < map.size(); t++) {
            List<int[]> areaList = new ArrayList<int[]>();
            areaList = map.get(t);
            for(int a = 0; a < areaList.size()-1; a++) {
                for(int b = a+1; b < areaList.size(); b++) {
                    if(areaList.get(b)[0] == areaList.get(a)[0]-1 || areaList.get(b)[1] == areaList.get(a)[1] -1 ) {  // x좌표가 1차이나거나 y좌표가 1차이면 같은영역으로 취급
                        if(areaCnt.get(areaidx) == null) {
                            areaCnt.put(areaidx, 1);
                        } else {
                            areaCnt.put(areaidx, areaCnt.get(areaidx)+1);
                        }
                    } else {        // x좌표와 y좌표중 둘중 하나라도 1차이가 아닐경우 다른영역이다.

                    }
                }
            }
        }

        int[] answer = new int[2];
        answer[0] = 1; // 영역수
        answer[1] = 1; // 각 영역중 제일 큰값

        System.out.println(answer[0] + " / " + answer[1]);
        return answer;
    }
}

/*

1 1 1 0
1 2 2 0
1 0 0 1
0 0 0 1
0 0 0 3
0 0 0 3

 */