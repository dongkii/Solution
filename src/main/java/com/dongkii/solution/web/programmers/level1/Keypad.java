package com.dongkii.solution.web.programmers.level1;

public class Keypad {
    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int left = 10;      // 이동거리를 계산하기 위해 *은 10으로 계산
        int right = 12;     // 이동거리를 계산하기 위해 #은 12로 계산

        for(int num : numbers) {
            // 왼쪽 키패드 일 때
            if(num == 1 || num == 4 || num == 7) {
                answer += "L";
                left = num;
            }
            // 오른쪽 키패드 일 때
            else if(num == 3 || num == 6 || num == 9) {
                answer += "R";
                right = num;
            }

            // 가운데 키패드일 땐 이동거리를 구해야됨
            else {
                if(num == 0) num = 11;  // 0의 자리에 있을 땐 거리를 구하기 위해 11로 계산
                // 이동 거리는 음수가 나올 수 없으므로 abs 함수 이용
                // 위나 아래로 갈 경우 3으로 나눈 몫이 이동거리
                // 왼쪽이나 오른쪽으로 갈경우 3으로 나눈 나머지가 이동거리
                // 3으로 나눈 몫과 나머지를 더하면 이동거리가 나옴
                int leftmi = Math.abs(num-left)/3 + Math.abs(num-left)%3;     // 이전 키패드 위치에서 왼손의 이동거리
                int rightmi = Math.abs(num-right)/3 + Math.abs(num-right)%3;  // 이전 키패드 위치에서 오른손의 이동거리

                if(leftmi > rightmi) { // 오른손이 가까울경우
                    answer += "R";
                    right = num;
                } else if(leftmi < rightmi) { // 왼손이 가까울 경우
                    answer += "L";
                    left = num;
                } else {    // 거리가 같을 경우 오른손잡이인지 왼손잡이인지
                    if("right".equals(hand)) {
                        answer += "R";
                        right = num;
                    } else {
                        answer += "L";
                        left = num;
                    }
                }
            }
        }

        return answer;
    }
}
