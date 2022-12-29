package com.dongkii.solution.web.programmers.level2;

import org.springframework.aop.scope.ScopedProxyUtils;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class nQueen {
    public static int solution(int n) {
        int answer = 0;

        int[][] arr = new int[n][n];

        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            System.out.println();
            for(int t = 0; t < n; t++) {
                for(int k = 0; k < n; k++) {
                    arr[t][k] = 0;
                }
            }

            for(int a = 0; a < n; a++) {
                for(int b = 0; b < n; b++) {
                    if(a == 0 && i == b) {
                        arr[a][b] = 1;
                        break;
                    } else if(a != 0 && checkQueen(a, b, arr)) {
                        arr[a][b] = 1;
                        break;
                    }
                }
            }

            set.add(Arrays.deepToString(arr));
            set.add(Arrays.deepToString(reverseTopBottom(n, arr)));
            set.add(Arrays.deepToString(reverseLeftRight(n, arr)));
            set.add(Arrays.deepToString(reverseLeftRight(n, reverseTopBottom(n ,arr))));
        }

        for (String s : set) {
            if(s.length() - s.replaceAll("1", "").length() == n)
                answer++;
        }

        return answer;
    }

    public static boolean checkQueen(int a, int b, int[][] arr) {
        // 같은 행에 1이 있는지 체크
        for(int i = 0; i < b; i++) {
            if(arr[a][i] == 1){
                return false;
            }
        }

        // 같은 열에 1이 있는지 체크
        for(int i = 0; i < a; i++) {
            if(arr[i][b] == 1) {
                return false;
            }
        }

        // 좌측 위 대각선에 1이 있는지 체크
        int i = a-1, j = b-1;
        while(i > -1 && j > -1) {
            if(arr[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        // 우측 위 대각선에 1이 있는지 체크
        i = a-1;
        j = b+1;
        while(i > -1 && j < arr[a].length) {
            if(arr[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    public static int[][] reverseTopBottom(int n, int[][] arr) {
        int[][] A = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = arr[n-i-1][j];
            }
        }

        return A;
    }

    public static int[][] reverseLeftRight(int n, int[][] arr) {
        int[][] A = new int[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                A[i][j] = arr[i][n-j-1];
            }
        }

        return A;
    }
}
