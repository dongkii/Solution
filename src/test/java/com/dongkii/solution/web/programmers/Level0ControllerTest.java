package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.level0.babbling;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Level0ControllerTest {

    //
    @Test
    public void 옹알이() {
        assertThat(babbling.solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"})).isEqualTo(1);
        assertThat(babbling.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"})).isEqualTo(3);
    }
}
