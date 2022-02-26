package com.dongkii.solution.web.programmers.level2;

public class Stock_price {
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        for(int i = 0; i < prices.length; i++) {
            int j;
            for(j = i+1; j < prices.length; j++) {
                answer[i] += 1;
                if(prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;
    }
}
