package com.dongkii.solution.web.programmers.level2;

public class Target_Number {

    public static int answer = 0;

    public static int solution(int[] numbers, int target) {
        dfs(numbers, numbers[0], 0, target);               // 첫번째 수가 양수라 가정
        dfs(numbers, numbers[0] * -1, 0, target);   // 첫번째 수가 음수라 가정

        return answer;
    }

    public static void dfs(int[] numbers, int number, int depth, int target) {
        if(depth == numbers.length-1) { // depth == index  depth가 length-1이면 마지막 인덱스
            if(number == target) {      // num가 target이랑 같으면 answer 추가
                answer++;
            }
            return;
        }

        // 재귀
        dfs(numbers, number + numbers[depth + 1], depth + 1, target); // 다음 수가 양수라 가정할 때
        dfs(numbers, number - numbers[depth + 1], depth + 1, target); // 다음 수가 음수라 가정할 때
    }
}
