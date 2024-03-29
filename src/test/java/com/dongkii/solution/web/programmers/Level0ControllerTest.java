package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.level0.*;
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

    //20221201
    @Test
    public void 문자열밀기() {
        assertThat(stringPush.solution("hello", "ohell")).isEqualTo(1);
        assertThat(stringPush.solution("apple", "elppa")).isEqualTo(-1);
    }

    //20221201
    @Test
    public void 잘라서배열로저장하기() {
        assertThat(cutAndSaveArray.solution("abc1Addfggg4556b", 6)).isEqualTo(new String[] {"abc1Ad", "dfggg4", "556b"});
        assertThat(cutAndSaveArray.solution("abcdef123", 3)).isEqualTo(new String[] {"abc", "def", "123"});
    }

    //20221201
    @Test
    public void 문자열에서7의개수() {
        assertThat(sevenCount.solution(new int[] {7, 77, 17})).isEqualTo(4);
        assertThat(sevenCount.solution(new int[] {10, 29})).isEqualTo(0);
    }

    //20221201
    @Test
    public void 문자열정렬하기() {
        assertThat(stringSort.solution("Bcad")).isEqualTo("abcd");
        assertThat(stringSort.solution("heLLo")).isEqualTo("ehllo");
        assertThat(stringSort.solution("Python")).isEqualTo("hnopty");
    }

    //20221201
    @Test
    public void 세균증식() {
        assertThat(bacterialGrowth.solution(2, 10)).isEqualTo(2048);
        assertThat(bacterialGrowth.solution(7, 15)).isEqualTo(229376);
    }

    //20221201
    @Test
    public void 제곱수판별() {
        assertThat(squareNumber.solution(144)).isEqualTo(1);
        assertThat(squareNumber.solution(976)).isEqualTo(2);
    }

    //20221201
    @Test
    public void 문자안에문자열() {
        assertThat(stringInString.solution("ab6CDE443fgh22iJKlmn1o", "6CD")).isEqualTo(1);
        assertThat(stringInString.solution("ppprrrogrammers", "pppp")).isEqualTo(2);
    }

    //20221201
    @Test
    public void OX퀴즈() {
        assertThat(oxQuiz.solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"})).isEqualTo(new String[] {"X", "O"});
        assertThat(oxQuiz.solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})).isEqualTo(new String[] {"O", "O", "X", "O"});
    }

    //20221201
    @Test
    public void 자리수더하기() {
        assertThat(addDigit.solution(1234)).isEqualTo(10);
        assertThat(addDigit.solution(930211)).isEqualTo(16);
    }

    //20221202
    @Test
    public void 모스부호() {
        assertThat(morseCode.solution(".... . .-.. .-.. ---")).isEqualTo("hello");
        assertThat(morseCode.solution(".--. -.-- - .... --- -.")).isEqualTo("python");
    }

    //20221214
    @Test
    public void 팩토리얼() {
        assertThat(factorial.solution(3628800)).isEqualTo(10);
        assertThat(factorial.solution(7)).isEqualTo(3);
    }

    //20221227
    @Test
    public void 아이스아메리카노() {
        assertThat(iceAmericano.solution(5500)).isEqualTo(new int[] {1, 0});
        assertThat(iceAmericano.solution(15000)).isEqualTo(new int[] {2, 4000});
    }

    //20230102
    @Test
    public void 중복된숫자개수() {
        assertThat(numberOfDuplicate.solution(new int[] {1, 1, 2, 3, 4, 5}, 1)).isEqualTo(2);
        assertThat(numberOfDuplicate.solution(new int[] {0, 2, 3, 4}, 1)).isEqualTo(0);
    }
    
    //20230102
    @Test
    public void 배열뒤집기() {
        assertThat(reverseArray.solution(new int[] {1, 2, 3, 4, 5})).isEqualTo(new int[] {5, 4, 3, 2, 1});
        assertThat(reverseArray.solution(new int[] {1, 1, 1, 1, 1, 2})).isEqualTo(new int[] {2, 1, 1, 1, 1, 1});
        assertThat(reverseArray.solution(new int[] {1, 0, 1, 1, 1, 3, 5})).isEqualTo(new int[] {5, 3, 1, 1, 1, 0, 1});
    }
    
    //20230102
    @Test
    public void 배열의유사도() {
        assertThat(ArraySimilarity.solution(new String[] {"a", "b", "c"}, new String[] {"com", "b", "d", "p", "c"})).isEqualTo(2);
    }
    
    //20230102
    @Test
    public void n의배수고르기() {
        assertThat(pickMultiple.solution(3, new int[] {4, 5, 6, 7, 8, 9, 10, 11, 12})).isEqualTo(new int[] {6,  9, 12});
    }

    //20230102
    @Test
    public void 배열회전() {
        assertThat(rotateArray.solution(new int[] {1, 2, 3}, "right")).isEqualTo(new int[] {3, 1, 2});
        assertThat(rotateArray.solution(new int[] {4, 455, 6, 4, -1, 45, 6}, "left")).isEqualTo(new int[] {455, 6, 4, -1, 45, 6, 4});
    }

    //20230102
    @Test
    public void 진료순서정하기() {
        assertThat(emergencyOrder.solution(new int[] {3, 76, 24})).isEqualTo(new int[] {3, 1, 2});
    }
    
    //02230103
    @Test
    public void 한번만_등장한_문자() {
        assertThat(oneAppear.solution("abcabcadc")).isEqualTo("d");
        assertThat(oneAppear.solution("abdc")).isEqualTo("abcd");
        assertThat(oneAppear.solution("hello")).isEqualTo("eho");
    }

    //20230103
    @Test
    public void 이진수더하기() {
        assertThat(binarySum.solution("10", "11")).isEqualTo("101");
    }
    
    //20230103
    @Test
    public void 소인수분해() {
        assertThat(factorization.solution(12)).isEqualTo(new int[] {2, 3});
        assertThat(factorization.solution(420)).isEqualTo(new int[] {2, 3, 5, 7});
    }

    //20230104
    @Test
    public void 구슬을_나누는_경우의_수() {
        assertThat(combi.solution(3, 2)).isEqualTo(3);
    }

    //20230104
    @Test
    public void 등수매기기() {
        assertThat(orderFix.solution(new int[][] {{80, 70}, {90, 50}, {40, 70}, {50, 80}})).isEqualTo(new int[] {1, 2, 4, 3});
    }

    //20230105
    @Test
    public void 특이한정렬() {
        assertThat(unusualArrangement.solution(new int[] {1, 2, 3, 4, 5, 6}, 4)).isEqualTo(new int[] {4, 5, 3, 6, 2, 1});
        assertThat(unusualArrangement.solution(new int[] {600, 400, 300, 200, 700, 800, 100, 900}, 500)).isEqualTo(new int[] {600, 400, 700, 300, 800, 200, 900, 100});
    }
    
    //20230105
    @Test
    public void 다항식더하기() {
        assertThat(polynomialSum.solution("3x + 7 + x")).isEqualTo("4x + 7");
        assertThat(polynomialSum.solution("x + x + x")).isEqualTo("3x");
    }
    
    //20230105
    @Test
    public void 분수의덧셈() {
        //assertThat(fractionalAdd.solution(1, 2, 3, 4)).isEqualTo(new int[] {5, 4});
        assertThat(fractionalAdd.solution(9, 2, 1, 3)).isEqualTo(new int[] {29, 6});
    }

    //20230105
    @Test
    public void 안전지대() {
        assertThat(safetyZone.solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}})).isEqualTo(16);
    }
}
