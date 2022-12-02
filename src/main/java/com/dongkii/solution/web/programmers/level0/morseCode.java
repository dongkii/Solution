package com.dongkii.solution.web.programmers.level0;

public class morseCode {
    public static String solution (String letter) {
        String answer = "";

        String[] morse = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        String[] arr = letter.split("\\s");

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < morse.length; j++) {
                if(arr[i].equals(morse[j])) {
                    char tmp = (char) (97 + j);
                    answer += tmp;
                    break;
                }
            }
        }

        return answer;
    }
}
