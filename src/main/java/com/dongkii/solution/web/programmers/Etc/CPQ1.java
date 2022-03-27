package com.dongkii.solution.web.programmers.Etc;

import java.util.Arrays;
import java.util.Comparator;

public class CPQ1 {
    public static String solution(int n, int[][] delivery) {
        String answer = "";
        String[] deliveryCheck = new String[n];

        // 배송 된 것부터 처리하기 위해 2번째 인덱스를 기준으로 내림차순 정렬
        Arrays.sort(delivery, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2] - o1[2];
            }
        });

        for(int i = 0; i < delivery.length; i++) {
            int a = delivery[i][0]; // 첫번째 상품
            int b = delivery[i][1]; // 두번째 상품
            int yn = delivery[i][2]; // 배송여부

            if(yn == 1) { // 배송했을경우 둘다 재고 있음
                deliveryCheck[a-1] = "O";
                deliveryCheck[b-1] = "O";
            } else if(yn == 0 && "O".equals(deliveryCheck[a-1])) { // 배송하지 않았는데 첫번째 상품 재고가 있을 경우
                deliveryCheck[b-1] = "X";
            } else if(yn == 0 && "O".equals(deliveryCheck[b-1])) { // 배송하지 않았는데 두번째 상품 재고가 있을 경우
                deliveryCheck[a-1] = "X";
            }
        }

        for(int i = 0; i < deliveryCheck.length; i++) {
            if(!"O".equals(deliveryCheck[i]) && !"X".equals(deliveryCheck[i])) {
                answer += "?";
            } else {
                answer += deliveryCheck[i];
            }
        }

        return answer;
    }
}
