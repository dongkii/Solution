package com.dongkii.solution.web.programmers.level2;

public class Joystick {
    public static int solution(String name) {
        int answer = 0;
        int length = name.length();

        int index;
        int move = length - 1;

        for(int i = 0; i < name.length(); i++) {
            // A에서 위 버튼을 통해 해당 값을
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

            index = i + 1;
            while(index < length && name.charAt(index) == 'A') {
                index++;
            }

            move = Math.min(move, i * 2 + length - index);
            move = Math.min(move, (length - index) * 2 + i);
        }

        return answer + move;
        /*
        좌로 이동하는게 적은지, 우로이동하는게 적은지 커서 이동거리는 따로 구해야함
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int i = 0; i < name.length(); i++) {
            int tmp = alphabet.indexOf(name.charAt(i));
            System.out.println(tmp);
            if(tmp > 13) {
                answer += 26-tmp;
            } else {
                answer += tmp;
            }
        }*/
    }
}
