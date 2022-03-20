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
}
