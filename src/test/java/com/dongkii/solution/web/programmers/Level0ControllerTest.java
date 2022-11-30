package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.level0.babbling;
import com.dongkii.solution.web.programmers.level0.nextInteger;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Level0ControllerTest {

    //20221130
    @Test
    public void 옹알이() {
        assertThat(babbling.solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"})).isEqualTo(1);
        assertThat(babbling.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})).isEqualTo(3);
    }

    //20221130
    @Test
    public void 다음에올숫자() {
        assertThat(nextInteger.solution(new int[] {1, 2, 3, 4})).isEqualTo(5);
        assertThat(nextInteger.solution(new int[] {2, 4, 8})).isEqualTo(16);
        assertThat(nextInteger.solution(new int[] {-10, -9, -8})).isEqualTo(-7);
        assertThat(nextInteger.solution(new int[] {-2, 4, -8})).isEqualTo(16);
    }
}
