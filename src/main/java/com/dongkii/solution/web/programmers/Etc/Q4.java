package com.dongkii.solution.web.programmers.Etc;

import java.util.Arrays;

public class Q4 {
    public static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            if (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
            if(B[i] < A[k]) k-=1;
        }
        return -1;
    }
}

/*
A 1 2 3 4
B 4 5 6 7

 */
