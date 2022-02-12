package com.dongkii.solution.web.programmers.level2;

public class Normal_square {
    public static long solution(long w, long h) {
        long answer = 1;

        // 높이와 넓이가 같을 경우
        if( w == h ){
            return w * w - w;
        }

        // a에 큰값, b에 작은 값
        long a = w > h ? w : h;
        long b = w < h ? w : h;

        // 최대공약수를 구함
        long cnt = gcd(a, b);

        answer = w * h - (w + h - cnt);

        return answer;
    }

    public static long gcd(long a, long b) {
        if(a % b == 0) {
            return b;
        }

        return gcd(b, a%b);
    }
}
