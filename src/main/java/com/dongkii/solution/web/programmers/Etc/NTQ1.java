package com.dongkii.solution.web.programmers.Etc;

public class NTQ1 {
    public static String fizzBuzz(int n) {
        for(int i = 1; i < n+1; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if(i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        return "";
    }
}
