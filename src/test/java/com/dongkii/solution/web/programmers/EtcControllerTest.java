package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.Etc.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class EtcControllerTest {
    // 오토에버 코딩테스트 1
    @Test
    public void 문자열() {
        assertThat(String_cnt.solution("abbbcbbb", "bbb")).isEqualTo(4);
        assertThat(String_cnt.solution("abcabcabc", "abc")).isEqualTo(4);
        assertThat(String_cnt.solution("abacaba", "acb")).isEqualTo(0);
    }

    // Q1
    @Test
    public void Q1() {
        assertThat(Q1.solution(3, 2, new int[] {2, 1, 1, 0, 1})).isEqualTo("11100,10001");
    }

    // Q2
    @Test
    public void Q2() {
        assertThat(Q2.solution("my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "not3.txt 5b\n" +
                "video.mp4 200b\n" +
                "game.exe 100b\n" +
                "mov!e.mkv 10000b")).isEqualTo("a");
    }

    // Q3
    @Test
    public void Q3() {
        assertThat(Q3.solution(new int[] {3, 2, -2, 5, -3})).isEqualTo(3);
        assertThat(Q3.solution(new int[] {1, 1, 2, -1, 2, -1})).isEqualTo(1);
        assertThat(Q3.solution(new int[] {1, 2, 3,-4})).isEqualTo(0);
    }

    // Q4
    @Test
    public void Q4() {
       assertThat(Q4.solution(new int[] {1,3,2,1}, new int[] {4,2,5,3,2})).isEqualTo(2);
       assertThat(Q4.solution(new int[] {2,1}, new int[] {3,3})).isEqualTo(-1);
       assertThat(Q4.solution(new int[] {7,6,5,4}, new int[] {1,2,3,4})).isEqualTo(4);
       assertThat(Q4.solution(new int[] {1,2,3,4}, new int[] {4,5,6,7})).isEqualTo(4);
       assertThat(Q4.solution(new int[] {1,2,3,4}, new int[] {4,5,6,7})).isEqualTo(4);
    }

    // CP Q1
    @Test
    public void CPQ1() {
        assertThat(CPQ1.solution(6, new int[][] {{1,3,1},{3,5,0},{5,4,0},{2,5,0}})).isEqualTo("O?O?X?");
        assertThat(CPQ1.solution(7, new int[][] {{5,6,0},{1,3,1},{1,5,0},{7,6,0},{3,7,1},{2,5,0}})).isEqualTo("O?O?XXO");
    }

    // CP Q2
    @Test
    public void CPQ2() {
        assertThat(CPQ2.solution(4)).isEqualTo(new long[] {-1, -1});
        assertThat(CPQ2.solution(6)).isEqualTo(new long[] {2, 3});
        assertThat(CPQ2.solution(12)).isEqualTo(new long[] {-1, -1});
        assertThat(CPQ2.solution(39)).isEqualTo(new long[] {3, 13});
        assertThat(CPQ2.solution(26)).isEqualTo(new long[] {2, 13});
        assertThat(CPQ2.solution(77)).isEqualTo(new long[] {7, 11});
    }

    // CP Q3
    @Test
    public void CPQ3() {
        assertThat(CPQ3.solution(new int[][] {{3,2,3,2},{2,1,1,2},{1,1,2,1},{4,1,1,1}})).isEqualTo(7);
        assertThat(CPQ3.solution(new int[][] {{4,2,3,2},{2,1,2,4},{1,2,3,1},{4,1,4,3}})).isEqualTo(-1);
    }

    // DMQ1
    @Test
    public void DMQ1() {
        assertThat(DMQ1.solution(new int[][] {{0,5,2,4,1},{5,0,3,9,6},{2,3,0,6,3},{4,9,6,0,3},{1,6,3,3,0}})).isEqualTo(new int[][] {{1,2,0,4,3},{3,4,0,2,1}});
        assertThat(DMQ1.solution(new int[][] {{0,2,3,1},{2,0,1,1},{3,1,0,2},{1,1,2,0}})).isEqualTo(new int[][] {{0,3,1,2},{2,1,3,0}});
    }

    // DMQ2
    @Test
    public void DMQ2() {
        assertThat(DMQ2.solution(new String[] {"??b", "abc", "cc?"})).isEqualTo(2);
        assertThat(DMQ2.solution(new String[] {"abcabcab","????????"})).isEqualTo(0);
        assertThat(DMQ2.solution(new String[] {"aa?"})).isEqualTo(3);
    }

    // TQ1
    @Test
    public void TQ1() {
        assertThat(TQ1.solution("EEESEEEEEENNNN")).isEqualTo(new String[] {"Time 0: Go straight 300m and turn right","Time 3: Go straight 100m and turn left","Time 5: Go straight 500m and turn left"});
        assertThat(TQ1.solution("SSSSSSWWWNNNNNN")).isEqualTo(new String[] {"Time 1: Go straight 500m and turn right","Time 6: Go straight 300m and turn right"});
    }

    // TQ2
    @Test
    public void TQ2() {
        assertThat(TQ2.solution("abcabcdefabc")).isEqualTo("def");
        assertThat(TQ2.solution("abxdeydeabz")).isEqualTo("xyz");
        assertThat(TQ2.solution("abcabca")).isEqualTo("bcbc");
        assertThat(TQ2.solution("ABCabcA")).isEqualTo("BCbc");
    }

    // TQ3
    @Test
    public void TQ3() {
        //assertThat(TQ3.solution("this is {template} {template} is {state}", new String[][] {{"template", "string"}, {"state", "changed"}})).isEqualTo("this is string string is changed");
        //assertThat(TQ3.solution("this is {template} {template} is {state}", new String[][] {{"template", "string"}, {"state", "{template}"}})).isEqualTo("this is string string is string");
        //assertThat(TQ3.solution("this is {template} {template} is {state}", new String[][] {{"template", "{state}"}, {"state", "{templates}"}})).isEqualTo("this is {templates} {templates} is {templates}");

        assertThat(TQ3.solution("this is {template} {template} is {state}", new String[][] {{"template", "{state}"}, {"state", "{template}"}})).isEqualTo("this is {template} {template} is {state}");
        //assertThat(TQ3.solution("{a} {b} {c} {d} {i}", new String[][] {{"b", "{c}"}, {"a", "{b}"}, {"e", "{f}"}, {"h", "i"}, {"d", "{e}"}, {"f", "{d}"}, {"c", "d"}})).isEqualTo("d d d {d} {i}");
    }

    // NTQ1
    @Test
    public void NTQ1() {
        assertThat(NTQ1.fizzBuzz(15)).isEqualTo("");
    }

    // NQ1
    @Test
    public void NQ1() {
        assertThat(NQ1.solution(Arrays.asList(new Integer[]{20, 5, 6, 7, 12}),
                            Arrays.asList(Arrays.asList(new Integer[]{10, 20}),
                                                        Arrays.asList(new Integer[]{5, 15}),
                                                        Arrays.asList(new Integer[]{5, 30})))).isEqualTo(1);
    }

    // NQ2
    @Test
    public void NQ2() {
        assertThat(NQ2.decode("23511011501782351112179911801562340161171141148")).isEqualTo("Truth Always Wins ");
        assertThat(NQ2.decode("2312179862310199501872379231018117927")).isEqualTo("Have a Nice Day ");
        assertThat(NQ2.decode("1219950180111108236115111016623101401611235115012312161151110101111127")).isEqualTo("Honesty is the Best Policy");
    }
}
