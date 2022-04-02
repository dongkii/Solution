package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.Etc.*;
import org.junit.jupiter.api.Test;

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
}
