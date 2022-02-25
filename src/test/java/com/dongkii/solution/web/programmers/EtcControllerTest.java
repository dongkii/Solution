package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.Etc.String_cnt;
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
}
