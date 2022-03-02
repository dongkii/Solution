package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.level2.*;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class Level2ControllerTest {
    // 1st week Q2
    @Test
    public void 문자열압축() {
        assertThat(String_zip.solution("aabbacc")).isEqualTo(7);
        assertThat(String_zip.solution("ababcdcdababcdcd")).isEqualTo(9);
        assertThat(String_zip.solution("abcabcdede")).isEqualTo(8);
        assertThat(String_zip.solution("abcabcabcabcdededededede")).isEqualTo(14);
        assertThat(String_zip.solution("xababcdcdababcdcd")).isEqualTo(17);
    }

    // 2nd week Q2
    @Test
    public void 더_맵게() {
        assertThat(The_spicy.solution(new int[] {1, 2, 3, 9, 10, 12}, 7)).isEqualTo(2);
        assertThat(The_spicy.solution(new int[] {5, 5, 6, 6, 9, 9}, 8)).isEqualTo(2);
        assertThat(The_spicy.solution(new int[] {5, 5, 5, 5, 5, 5}, 7)).isEqualTo(3);
        assertThat(The_spicy.solution(new int[] {1, 7, 9}, 7)).isEqualTo(1);
    }

    // 2nd week Q3
    @Test
    public void 오픈채팅방() {
        assertThat(OpenChatting_room
                .solution(new String[] {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"}))
                .isEqualTo(new String[] {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."});
    }

    // 4st week Q2
    @Test
    public void 멀쩡한사각형() {
        assertThat(Normal_square.solution(8, 12)).isEqualTo(80);
        assertThat(Normal_square.solution(5, 2)).isEqualTo(4);
        assertThat(Normal_square.solution(3, 5)).isEqualTo(8);
        assertThat(Normal_square.solution(7, 3)).isEqualTo(12);
        assertThat(Normal_square.solution(5, 19)).isEqualTo(72);
    }

    // 5st week Q1
    @Test
    public void 나라의숫자_124() {
        assertThat(Contry_num_124.solution(1)).isEqualTo("1");
        assertThat(Contry_num_124.solution(2)).isEqualTo("2");
        assertThat(Contry_num_124.solution(3)).isEqualTo("4");
        assertThat(Contry_num_124.solution(4)).isEqualTo("11");
        assertThat(Contry_num_124.solution(5)).isEqualTo("12");
        assertThat(Contry_num_124.solution(6)).isEqualTo("14");
        assertThat(Contry_num_124.solution(7)).isEqualTo("21");
        assertThat(Contry_num_124.solution(8)).isEqualTo("22");
        assertThat(Contry_num_124.solution(9)).isEqualTo("24");
        assertThat(Contry_num_124.solution(10)).isEqualTo("41");
    }

    // 5st week
    @Test
    public void 거리두기_확인하기() {
        assertThat(Keep_distance.solution(new String[][] {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}})).isEqualTo(new int[] {1, 0, 1, 1, 1});
    }

    // Practice 2022-02-20
    @Test
    public void 행렬의곱셈() {
        assertThat(Matrix.solution(new int[][] {{1 ,4}, {3, 2}, {4, 1}}, new int[][] {{3, 3}, {3, 3}})).isEqualTo(new int[][] {{15, 15}, {15, 15}, {15, 15}});
    }

    // Practice 2022-02-20
    @Test
    public void 피보나치_수() {
        assertThat(Fibonachi.solution(3)).isEqualTo(2);
        assertThat(Fibonachi.solution(5)).isEqualTo(5);
        assertThat(Fibonachi.solution(6)).isEqualTo(8);
        assertThat(Fibonachi.solution(7)).isEqualTo(13);
    }

    // Practice 2022-02-20
    @Test
    public void n진수게임() {
        assertThat(Ngame.solution(2, 4, 2, 1)).isEqualTo("0111");
        assertThat(Ngame.solution(16, 16, 2, 1)).isEqualTo("02468ACE11111111");
        assertThat(Ngame.solution(16, 16, 2, 2)).isEqualTo("13579BDF01234567");
    }

    // Practice 2022-02-21
    @Test
    public void 숫자의표현() {
        assertThat(ExpressionOfNumber.solution(15)).isEqualTo(4);
    }

    // Practice 2022-02-21
    @Test
    public void 최솟값_만들기() {
        assertThat(MinNumber.solution(new int[] {1, 4, 2}, new int[] {5, 4, 4})).isEqualTo(29);
        assertThat(MinNumber.solution(new int[] {1, 2}, new int[] {3, 4})).isEqualTo(10);
    }

    // Practice 2022-02-21
    @Test
    public void 최댓값과_최솟값() {
        assertThat(MinMax.solution("1 2 3 4")).isEqualTo("1 4");
        assertThat(MinMax.solution("-1 -2 -3 -4")).isEqualTo("-4 -1");
        assertThat(MinMax.solution("-1 -1")).isEqualTo("-1 -1");
    }

    // Practice 2022-02-21
    @Test
    public void 다음_큰_숫자() {
        assertThat(NextBigNumber.solution(78)).isEqualTo(83);
        assertThat(NextBigNumber.solution(15)).isEqualTo(23);
    }

    // Practice 2022-02-21
    @Test
    public void 올바른괄호() {
        assertThat(Correct_parenthesis.solution("()()")).isEqualTo(true);
        assertThat(Correct_parenthesis.solution("(())()")).isEqualTo(true);
        assertThat(Correct_parenthesis.solution(")()(")).isEqualTo(false);
        assertThat(Correct_parenthesis.solution("(()(")).isEqualTo(false);
    }

    // Practice 2022-02-21
    @Test
    public void 땅따먹기() {
        assertThat(Eat_the_ground.solution(new int[][] {{1, 2, 3, 5}, {5, 6, 7, 8}, {4, 3, 2, 1}})).isEqualTo(16);
        assertThat(Eat_the_ground.solution(new int[][] {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}})).isEqualTo(11);
        assertThat(Eat_the_ground.solution(new int[][] {{4, 3, 2, 1}, {2, 2, 2, 1}, {6, 6, 6, 4}, {8, 7, 6, 5}})).isEqualTo(20);
        assertThat(Eat_the_ground.solution(new int[][] {{4, 3, 2, 1}})).isEqualTo(4);
        assertThat(Eat_the_ground.solution(new int[][] {{1, 1, 1, 1}, {2, 2, 2, 3}, {3, 3, 3, 6}, {4, 4, 4, 7}})).isEqualTo(14);
    }

    // Practice 2022-02-21
    @Test
    public void 가장_큰_정사각형_찾기() {
        assertThat(Find_the_largest_square.solution(new int[][] {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}})).isEqualTo(9);
        assertThat(Find_the_largest_square.solution(new int[][] {{0,0,1,1},{1,1,1,1}})).isEqualTo(4);
    }

    // Practice 2022-02-21
    @Test
    public void 가장큰수() {
        assertThat(Biggest_number.solution(new int[] {6, 10, 2})).isEqualTo("6210");
        assertThat(Biggest_number.solution(new int[] {3, 30, 34, 5, 9})).isEqualTo("9534330");
    }

    // Practice 2022-02-22
    @Test
    public void 행렬_테두리_회전하기() {
        assertThat(Rotate_Matrix_Borders.solution(6, 6, new int[][] {{2,2,5,4},{3,3,6,6},{5,1,6,3}})).isEqualTo(new int[] {8, 10, 25});
        assertThat(Rotate_Matrix_Borders.solution(3, 3, new int[][] {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}})).isEqualTo(new int[] {1,1,5,3});
        assertThat(Rotate_Matrix_Borders.solution(100, 97, new int[][] {{1,1,2,2}, {1,1,2,2}, {1,1,100,97}})).isEqualTo(new int[] {1,1,2});
    }

    // Practice 2022-02-24
    @Test
    public void k진수에서_소수_개수_구하기() {
        assertThat(Find_the_number_of_decimalls.solution(437674, 3)).isEqualTo(3);
        assertThat(Find_the_number_of_decimalls.solution(110011, 10)).isEqualTo(2);
    }

    // Practice 2022-02-24
    @Test
    public void 방금그곡() {
        assertThat(Just_that_song.solution("ABCDEFG", new String[] {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"})).isEqualTo("HELLO");
        assertThat(Just_that_song.solution("CC#BCC#BCC#BCC#B", new String[] {"03:00,03:30,FOO,CC#B", "04:00,04:08,BAR,CC#BCC#BCC#B"})).isEqualTo("FOO");
        assertThat(Just_that_song.solution("ABC", new String[] {"12:00,12:14,HELLO,C#DEFGAB", "13:00,13:05,WORLD,ABCDEF"})).isEqualTo("WORLD");
        assertThat(Just_that_song.solution("CCB", new String[] {"03:00,03:10,FOO,CCB#CCB", "04:00,04:08,BAR,ABC"})).isEqualTo("FOO");
    }

    // Practice 2022-02-25
    @Test
    public void 주차요금계산() {
        assertThat(Parking_Fee_Calculation.solution(new int[] {180, 5000, 10, 600}, new String[] {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})).isEqualTo(new int[] {14600, 34400, 5000});
        assertThat(Parking_Fee_Calculation.solution(new int[] {120, 0, 60, 591}, new String[] {"16:00 3961 IN","16:00 0202 IN","18:00 3961 OUT","18:00 0202 OUT","23:58 3961 IN"})).isEqualTo(new int[] {0, 591});
        assertThat(Parking_Fee_Calculation.solution(new int[] {1, 461, 1, 10}, new String[] {"00:00 1234 IN"})).isEqualTo(new int[] {14841});
    }

    // Practice 2022-02-25
    @Test
    public void JadenCase_문자열_만들기() {
        assertThat(JadenCase.solution("3people unFollowed me")).isEqualTo("3people Unfollowed Me");
        assertThat(JadenCase.solution("for the last week")).isEqualTo("For The Last Week");
        assertThat(JadenCase.solution(" adgagd 3eagdag ")).isEqualTo(" Adgagd 3eagdag ");
    }

    // Practice 2022-02-25
    @Test
    public void 영어끝말잇기() {
        //assertThat(Ending_in_english.solution(3, new String[] {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})).isEqualTo(new int[] {3, 3});
        //assertThat(Ending_in_english.solution(5, new String[] {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})).isEqualTo(new int[] {0, 0});
        //assertThat(Ending_in_english.solution(2, new String[] {"hello", "one", "even", "never", "now", "world", "draw"})).isEqualTo(new int[] {1, 3});
        assertThat(Ending_in_english.solution(2, new String[] {"aaab","baa","aa","ba"})).isEqualTo(new int[] {2, 2});
    }

    // Practice 2022-02-26
    @Test
    public void N개의_최소공배수() {
        assertThat(Nnumber_LCM.solution(new int[] {2, 6, 8, 14})).isEqualTo(168);
        assertThat(Nnumber_LCM.solution(new int[] {1, 2, 3})).isEqualTo(6);
    }

    // Practice 2022-02-26
    @Test
    public void 주식가격() {
        assertThat(Stock_price.solution(new int[] {1, 2, 3, 2, 3})).isEqualTo(new int[] {4, 3, 1, 1, 0});
    }

    // Practice 2022-02-26
    @Test
    public void 다리를_지나는_트럭() {
        assertThat(Truck_crossing_the_bridge.solution(2, 10, new int[] {7, 4, 5, 6})).isEqualTo(8);
        assertThat(Truck_crossing_the_bridge.solution(100, 100, new int[] {10})).isEqualTo(101);
        assertThat(Truck_crossing_the_bridge.solution(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10})).isEqualTo(110);
        assertThat(Truck_crossing_the_bridge.solution(5, 5, new int[] {2, 2, 2, 2, 1, 1, 1, 1, 1})).isEqualTo(19);
    }

    // Practice 2022-02-27
    @Test
    public void 피로도() {
        assertThat(Dungeon.solution(80, new int[][] {{80, 20}, {50, 40}, {30, 10}})).isEqualTo(3);
    }

    // -- 못품
    @Test
    public void 양궁대회() {
        assertThat(Archery_competition.solution(5, new int[] {2,1,1,1,0,0,0,0,0,0,0})).isEqualTo(new int[] {0,2,2,0,1,0,0,0,0,0,0});
        assertThat(Archery_competition.solution(1, new int[] {1,0,0,0,0,0,0,0,0,0,0})).isEqualTo(new int[] {-1});
        assertThat(Archery_competition.solution(9, new int[] {0,0,1,2,0,1,1,1,1,1,1})).isEqualTo(new int[] {1,1,2,0,1,2,2,0,0,0,0});
        assertThat(Archery_competition.solution(10, new int[] {0,0,0,0,0,0,0,0,3,4,3})).isEqualTo(new int[] {1,1,1,1,1,1,1,1,0,0,2});
    }

    // -- 못품
    @Test
    public void 컬러링북() {
        assertThat(Coloring.solution(6, 4, new int[][] {{1,1,1,0}, {1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}})).isEqualTo(new int[] {4,5});
    }
}
