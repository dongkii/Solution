package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.level0.babbling;
import com.dongkii.solution.web.programmers.level0.nextInteger;
<<<<<<< HEAD
import com.dongkii.solution.web.programmers.level0.paperCutting;
import com.dongkii.solution.web.programmers.level0.sumOfConsecutiveNum;
=======
>>>>>>> 9bb9c8c238968a85cedd6a999d4de3418c28ae6d
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

    //20221201
    @Test
    public void 연속된수의합() {
        assertThat(sumOfConsecutiveNum.solution(3, 12)).isEqualTo(new int[] {3, 4, 5});
        assertThat(sumOfConsecutiveNum.solution(5, 15)).isEqualTo(new int[] {1, 2, 3, 4, 5});
        assertThat(sumOfConsecutiveNum.solution(4, 14)).isEqualTo(new int[] {2, 3, 4, 5});
        assertThat(sumOfConsecutiveNum.solution(5, 5)).isEqualTo(new int[] {-1, 0, 1, 2, 3});
        assertThat(sumOfConsecutiveNum.solution(3, 0)).isEqualTo(new int[] {-1, 0, 1});
        assertThat(sumOfConsecutiveNum.solution(1, 4)).isEqualTo(new int[] {4});
    }

    //20221201
    @Test
    public void 종이자르기() {
        assertThat(paperCutting.solution(2, 2)).isEqualTo(3);
        assertThat(paperCutting.solution(2, 5)).isEqualTo(9);
        assertThat(paperCutting.solution(1, 1)).isEqualTo(0);
        assertThat(paperCutting.solution(3, 5)).isEqualTo(14);
    }
}
