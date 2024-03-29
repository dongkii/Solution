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

    // Practice 2022-03-03
    @Test
    public void 타겟넘버() {
        assertThat(Target_Number.solution(new int[] {1, 1, 1, 1, 1}, 3)).isEqualTo(5);
        assertThat(Target_Number.solution(new int[] {4, 1, 2, 1}, 4)).isEqualTo(2);
    }

    // Practice 2022-03-04
    @Test
    public void 카펫() {
        assertThat(Carpet.solution(10, 2)).isEqualTo(new int[] {4, 3});
        assertThat(Carpet.solution(8, 1)).isEqualTo(new int[] {3, 3});
        assertThat(Carpet.solution(24, 24)).isEqualTo(new int[] {8, 6});
    }

    // Practice 2022-03-04
    @Test
    public void 프린터() {
        assertThat(Printer.solution(new int[] {2, 1, 3, 2}, 2)).isEqualTo(1);
        assertThat(Printer.solution(new int[] {1, 1, 9, 1, 1, 1}, 0)).isEqualTo(5);
        assertThat(Printer.solution(new int[] {7, 2, 1, 2, 9, 6}, 3)).isEqualTo(5);
    }

    // Practice 2022-03-04
    @Test
    public void 튜플() {
        assertThat(Tuple.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")).isEqualTo(new int[] {2, 1, 3, 4});
        assertThat(Tuple.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")).isEqualTo(new int[] {2, 1, 3, 4});
        assertThat(Tuple.solution("{{20,111},{111}}")).isEqualTo(new int[] {111, 20});
        assertThat(Tuple.solution("{{123}}")).isEqualTo(new int[] {123});
        assertThat(Tuple.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")).isEqualTo(new int[] {3, 2, 4, 1});
    }

    // Practice 2022-03-07
    @Test
    public void 캐시() {
        assertThat(Cache.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"})).isEqualTo(50);
        assertThat(Cache.solution(3, new String[] {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"})).isEqualTo(21);
        assertThat(Cache.solution(2, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})).isEqualTo(60);
        assertThat(Cache.solution(5, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"})).isEqualTo(52);
        assertThat(Cache.solution(2, new String[] {"Jeju", "Pangyo", "NewYork", "newyork"})).isEqualTo(16);
        assertThat(Cache.solution(0, new String[] {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"})).isEqualTo(25);
    }

    // Practice 2022-03-07
    @Test
    public void 점프와_순간_이동() {
        assertThat(Jump_and_teleport.solution(5)).isEqualTo(2);
        assertThat(Jump_and_teleport.solution(6)).isEqualTo(2);
        assertThat(Jump_and_teleport.solution(5000)).isEqualTo(5);
    }

    // Practice 2022-03-07
    @Test
    public void 스킬트리() {
        assertThat(Skilltree.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"})).isEqualTo(2);
    }

    // Practice 2022-03-07
    @Test
    public void 삼각달팽이() {
        assertThat(Triangle_snail.solution(4)).isEqualTo(new int[] {1,2,9,3,10,8,4,5,6,7});
        assertThat(Triangle_snail.solution(5)).isEqualTo(new int[] {1,2,12,3,13,11,4,14,15,10,5,6,7,8,9});
        assertThat(Triangle_snail.solution(6)).isEqualTo(new int[] {1,2,15,3,16,14,4,17,21,13,5,18,19,20,12,6,7,8,9,10,11});
    }

    // Practice 2022-03-08
    @Test
    public void 괄호_회전하기() {
        assertThat(Rotate_parenthesis.solution("[](){}")).isEqualTo(3);
        assertThat(Rotate_parenthesis.solution("}]()[{")).isEqualTo(2);
        assertThat(Rotate_parenthesis.solution("[)(]")).isEqualTo(0);
        assertThat(Rotate_parenthesis.solution("}}}")).isEqualTo(0);
    }

    // Practice 2022-03-08
    @Test
    public void 이진_변환_반복하기() {
        assertThat(Repeat_binary_transformation.solution("110010101001")).isEqualTo(new int[] {3, 8});
        assertThat(Repeat_binary_transformation.solution("01110")).isEqualTo(new int[] {3, 3});
        assertThat(Repeat_binary_transformation.solution("1111111")).isEqualTo(new int[] {4, 1});
    }

    // Practice 2022-03-08
    @Test
    public void 예상_대진표() {
        assertThat(Anticipated_match.solution(8, 4, 7)).isEqualTo(3);
    }

    // Practice 2022-03-09
    @Test
    public void 큰_수_만들기() {
        assertThat(Making_a_big_number.solution("1924", 2)).isEqualTo("94");
        assertThat(Making_a_big_number.solution("1231234", 3)).isEqualTo("3234");
        assertThat(Making_a_big_number.solution("4177252841", 4)).isEqualTo("775841");
        assertThat(Making_a_big_number.solution("987654321", 5)).isEqualTo("9876");
    }

    // Practice 2022-03-09
    @Test
    public void 조이스틱() {
        assertThat(Joystick.solution("JAZ")).isEqualTo(11);
        assertThat(Joystick.solution("JEROEN")).isEqualTo(56);
        assertThat(Joystick.solution("JAN")).isEqualTo(23);
    }

    // Practice 2022-03-10  (테스트케이스 실패하는데 정답은 맞음,, 문제이상)
    @Test
    public void H_Index() {
        assertThat(H_Index.solution(new int[] {3, 0, 6, 1, 5})).isEqualTo(3);
        assertThat(H_Index.solution(new int[] {3, 4, 5, 11, 15, 16, 17, 18, 19, 20})).isEqualTo(7);
        assertThat(H_Index.solution(new int[] {88, 89})).isEqualTo(2);
        assertThat(H_Index.solution(new int[] {0, 1, 2})).isEqualTo(1);
    }

    // Practice 2022-03-10
    @Test
    public void 수식_최대화() {
        assertThat(Maximize_the_formula.solution("100-200*300-500+20")).isEqualTo(60420);
        assertThat(Maximize_the_formula.solution("50*6-3*2")).isEqualTo(300);
    }

    // Practice 2022-03-14
    @Test
    public void 짝지어_제거하기() {
        assertThat(Remove_pair.solution("baabaa")).isEqualTo(1);
        assertThat(Remove_pair.solution("cdcd")).isEqualTo(0);
    }

    // Practice 2022-03-14
    @Test
    public void 구명보트() {
        assertThat(Rescue_boat.solution(new int[] {70,50,80,50}, 100)).isEqualTo(3);
        assertThat(Rescue_boat.solution(new int[] {70,80,50}, 100)).isEqualTo(3);
    }

    // Practice 2022-03-20
    @Test
    public void 배달() {
        //assertThat(Delivery.solution(5, new int[][] {{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}}, 3)).isEqualTo(4);
        assertThat(Delivery.solution(6, new int[][]{{1, 2, 1}, {1, 3, 2}, {2, 3, 2}, {3, 4, 3}, {3, 5, 2}, {3, 5, 3}, {5, 6, 1}}, 4)).isEqualTo(4);
    }

    // -- 못품
    @Test
    public void 후보키() {
        assertThat(Candidate_key.solution(new String[][] {{"100","ryan","music","2"},{"200","apeach","math","2"},{"300","tube","computer","3"},{"400","con","computer","4"},{"500","muzi","music","3"},{"600","apeach","music","2"}})).isEqualTo(2);
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

    @Test
    public void 두_큐_합_같게_만들기() {
        assertThat(QueueSum.solution(new int[] {3, 2, 7, 2}, new int[] {4, 6, 5, 1})).isEqualTo(2);
        assertThat(QueueSum.solution(new int[] {1, 2, 1, 2}, new int[] {1, 10, 1, 2})).isEqualTo(7);
        assertThat(QueueSum.solution(new int[] {1, 1}, new int[] {1, 5})).isEqualTo(-1);
    }

    @Test
    public void 하노이의_탑() {
        assertThat(Hanoi.solution(2)).isEqualTo(new int[][] {{1, 2}, {1, 3}, {2, 3}});
    }

    @Test
    public void 괄호변환() {
        assertThat(ParenthesisConversion.solution("(()())()")).isEqualTo("(()())()");
        assertThat(ParenthesisConversion.solution(")(")).isEqualTo("()");
        assertThat(ParenthesisConversion.solution("))((()")).isEqualTo("(())()");
        assertThat(ParenthesisConversion.solution("()))((()")).isEqualTo("()(())()");
    }

    @Test
    public void 소수찾기() {
        assertThat(Find_Minority.solution("17")).isEqualTo(3);
        assertThat(Find_Minority.solution("011")).isEqualTo(2);
    }

    //20221209
    @Test
    public void 모음사전() {
        assertThat(vowelDictionary.solution("AAAAE")).isEqualTo(6);
        assertThat(vowelDictionary.solution("AAAE")).isEqualTo(10);
        assertThat(vowelDictionary.solution("I")).isEqualTo(1563);
        assertThat(vowelDictionary.solution("EIO")).isEqualTo(1189);
    }

    //20221209
    @Test
    public void 멀리뛰기() {
        assertThat(longJump.solution(4)).isEqualTo(5);
        assertThat(longJump.solution(3)).isEqualTo(3);
    }

    //20221209
    @Test
    public void 배열자르기() {
        assertThat(arrayCutting.solution(3, 2, 5)).isEqualTo(new int[] {3, 2, 2, 3});
        assertThat(arrayCutting.solution(4, 7, 14)).isEqualTo(new int[] {4,3,3,3,4,4,4,4});
    }

    //20221209
    @Test
    public void 다른비트() {
        assertThat(anotherBit.solution(new long[] {2, 7})).isEqualTo(new long[] {3, 11});
    }

    //20221213
    @Test
    public void 할인행사() {
        assertThat(discountEvent.solution(new String[] {"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1}, new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"})).isEqualTo(3);
        assertThat(discountEvent.solution(new String[] {"apple"}, new int[] {10}, new String[] {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"})).isEqualTo(0);
    }
    
    @Test
    public void 숫자블록() {
        assertThat(numberBlock.solution(1, 10)).isEqualTo(new int[] {0, 1, 1, 2, 1, 3, 1, 4, 3, 5});
        assertThat(numberBlock.solution(2, 10)).isEqualTo(new int[] {1, 1, 2, 1, 3, 1, 4, 3, 5});
    }

    //20221215
    @Test
    public void 뉴스클러스터링() {
        assertThat(newsClustering.solution("FRANCE", "french")).isEqualTo(16384);
        assertThat(newsClustering.solution("handshake", "shake hands")).isEqualTo(65536);
        assertThat(newsClustering.solution("aa1+aa2", "AAAA12")).isEqualTo(43690);
        assertThat(newsClustering.solution("E=M*C^2", "e=m*c^2")).isEqualTo(65536);
        assertThat(newsClustering.solution("aaa", "aaaa")).isEqualTo(43690);
        assertThat(newsClustering.solution("BAAAA", "AAA")).isEqualTo(32768);
        assertThat(newsClustering.solution("BBAAAA", "AAABBB")).isEqualTo(28086);
    }

    //20221216
    @Test
    public void 택배상자() {
        assertThat(deliveryBox.solution(new int[] {4, 3, 1, 2, 5})).isEqualTo(2);
        assertThat(deliveryBox.solution(new int[] {5, 4, 3, 2, 1})).isEqualTo(5);
        assertThat(deliveryBox.solution(new int[] {5, 2, 3, 4, 1})).isEqualTo(1);
        assertThat(deliveryBox.solution(new int[] {1, 2, 4, 3, 5})).isEqualTo(5);
        assertThat(deliveryBox.solution(new int[] {1, 5, 3, 2, 4})).isEqualTo(2);
        assertThat(deliveryBox.solution(new int[] {2, 1, 4, 3, 6, 5, 8, 7, 10, 9})).isEqualTo(10);
        assertThat(deliveryBox.solution(new int[] {1, 2, 3, 4, 5})).isEqualTo(5);
        assertThat(deliveryBox.solution(new int[] {4, 5, 3, 2, 1})).isEqualTo(5);
        //assertThat(deliveryBox.solution(new int[] {3, 4, 5, 2, 1})).isEqualTo(5);
        //assertThat(deliveryBox.solution(new int[] {2, 3, 4, 5, 1})).isEqualTo(5);
        assertThat(deliveryBox.solution(new int[] {4, 5, 1, 2, 3})).isEqualTo(2);
        assertThat(deliveryBox.solution(new int[] {1, 5, 2, 4, 3})).isEqualTo(2);
        assertThat(deliveryBox.solution(new int[] {1, 5, 3, 4, 2})).isEqualTo(2);
        assertThat(deliveryBox.solution(new int[] {3, 5, 4, 2, 1})).isEqualTo(5);
        //assertThat(deliveryBox.solution(new int[] {3, 2, 1, 6, 7, 5, 4})).isEqualTo(7);
        assertThat(deliveryBox.solution(new int[] {2, 1, 6, 7, 5, 4, 3})).isEqualTo(7);
        assertThat(deliveryBox.solution(new int[] {2, 1, 6, 5, 4, 8, 9, 7, 3})).isEqualTo(9);
    }

    // 20221219
    @Test
    public void 순위검색() {
        assertThat(searchRank.solution(
                new String[] {
                        "java backend junior pizza 150",
                        "python frontend senior chicken 210",
                        "python frontend senior chicken 150",
                        "cpp backend senior pizza 260",
                        "java backend junior chicken 80",
                        "python backend senior chicken 50"},
                new String[] {
                        "java and backend and junior and pizza 100",
                        "python and frontend and senior and chicken 200",
                        "cpp and - and senior and pizza 250",
                        "- and backend and senior and - 150",
                        "- and - and - and chicken 100",
                        "- and - and - and - 150"})).isEqualTo(new int[] {1, 1, 1, 1, 2, 4});
    }

    //20221220
    @Test
    public void 디펜스게임() {
        assertThat(defenceGame.solution(7, 3, new int[] {4, 2, 4, 5, 3, 3, 1})).isEqualTo(5);
        assertThat(defenceGame.solution(2, 4, new int[] {3, 3, 3, 3})).isEqualTo(4);
    }

    //20221221
    @Test
    public void 숫자카드나누기() {
        assertThat(numberCard.solution(new int[] {10, 17}, new int[] {5, 20})).isEqualTo(0);
        assertThat(numberCard.solution(new int[] {10, 20}, new int[] {5, 17})).isEqualTo(10);
        assertThat(numberCard.solution(new int[] {14, 35, 119}, new int[] {18, 30, 102})).isEqualTo(7);
    }

    //20221222
    @Test
    public void 카카오프렌즈() {
        kakaoFriends kakaoFriends = new kakaoFriends();
        assertThat(kakaoFriends.solution(6, 4, new int[][] {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0 ,1}, {0, 0, 0, 3}, {0, 0, 0, 3}})).isEqualTo(new int[] {4, 5});
    }
    
    //20221223
    @Test
    public void 귤고르기() {
        assertThat(tangerine.solution(6, new int[] {1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(3);
        assertThat(tangerine.solution(4, new int[] {1, 3, 2, 5, 4, 5, 2, 3})).isEqualTo(2);
        assertThat(tangerine.solution(2, new int[] {1, 1, 1, 1, 2, 2, 2, 3})).isEqualTo(1);
    }
    
    //20221227
    @Test
    public void 빛의경로사이클() {
        assertThat(lightPathCycle.solution(new String[] {"SL", "LR"})).isEqualTo(new int[] {16});
        assertThat(lightPathCycle.solution(new String[] {"S"})).isEqualTo(new int[] {1, 1, 1, 1});
        assertThat(lightPathCycle.solution(new String[] {"R", "R"})).isEqualTo(new int[] {4, 4});
    }
    
    //20221228
    @Test
    public void 압축() {
        assertThat(compression.solution("KAKAO")).isEqualTo(new int[] {11, 1, 27, 15});
        assertThat(compression.solution("TOBEORNOTTOBEORTOBEORNOT")).isEqualTo(new int[] {20, 15, 2, 5, 15, 18, 14, 15, 20, 27, 29, 31, 36, 30, 32, 34});
        assertThat(compression.solution("ABABABABABABABAB")).isEqualTo(new int[] {1, 2, 27, 29, 28, 31, 30});
    }

    //20221228
    @Test
    public void 파일명정렬() {
        assertThat(fileNameSort.solution(new String[] {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})).isEqualTo(new String[] {"img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"});
        assertThat(fileNameSort.solution(new String[] {"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"})).isEqualTo(new String[] {"A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"});
    }

    //20221229
    // 테스트 성공 - 실행 실패
    @Test
    public void nQueen() {
        assertThat(nQueen.solution(4)).isEqualTo(2);
        //assertThat(nQueen.solution(5)).isEqualTo(3);
    }

    //20221229
    @Test
    public void nQueen2() {
        assertThat(nQueen2.solution(4)).isEqualTo(2);
    }
    
    //20221230
    @Test
    public void 롤케이크_자르기() {
        assertThat(rollCake.solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2})).isEqualTo(2);
        assertThat(rollCake.solution(new int[] {1, 2, 3, 1, 4})).isEqualTo(0);
    }

    //20230111
    @Test
    public void 마법의엘리베이터() {
        assertThat(storey.solution(16)).isEqualTo(6);
        assertThat(storey.solution(2554)).isEqualTo(16);
        assertThat(storey.solution(678)).isEqualTo(8);
        assertThat(storey.solution(95)).isEqualTo(6);
        assertThat(storey.solution(45)).isEqualTo(9);
        assertThat(storey.solution(55)).isEqualTo(10);
        assertThat(storey.solution(545)).isEqualTo(14);
        assertThat(storey.solution(545)).isEqualTo(14);
    }
    
    //20230111
    @Test
    public void 유사칸토어비트열() {
        assertThat(similarBitArray.solution(2, 4, 17)).isEqualTo(8);
    }
    
    //20230111
    @Test
    public void 점찍기() {
        assertThat(dotted.solution(2, 4)).isEqualTo(6);
        assertThat(dotted.solution(1, 5)).isEqualTo(26);
    }

    //20230112
    @Test
    public void 연속_부분_수열_합의_개수() {
        assertThat(consecutiveSubsequences.solution(new int[] {7, 9, 1, 1, 4})).isEqualTo(18);
    }

    //20230112
    @Test
    public void 줄서는방법() {
        assertThat(lineUp.solution(3, 5)).isEqualTo(new int[] {3, 1, 2});
        assertThat(lineUp.solution(4, 8)).isEqualTo(new int[] {2, 1, 4, 3});
        assertThat(lineUp.solution(4, 1)).isEqualTo(new int[] {1, 2, 3, 4});
        assertThat(lineUp.solution(4, 24)).isEqualTo(new int[] {4, 3, 2, 1});
    }

    //20230116
    @Test
    public void 테이블해시함수() {
        assertThat(tableHashFunction.solution(new int[][] {{2,2,6},{1,5,10},{4,2,9},{3,8,3}}, 2, 2, 3)).isEqualTo(4);
    }

    //20230216
    @Test
    public void 방문길이() {
        assertThat(visitLength.solution("ULURRDLLU")).isEqualTo(7);
        assertThat(visitLength.solution("LULLLLLLU")).isEqualTo(7);
    }

    //20230223
    @Test
    public void 교점에별만들기() {
        assertThat(makingStar.solution(new int[][] {{2 ,-1, 4}, {-2, -1,4},{0,-1,1},{5,-8,-12},{5,8,12}})).isEqualTo(new String[] {"....*....", ".........", ".........", "*.......*", ".........", ".........", ".........", ".........", "*.......*"});
        assertThat(makingStar.solution(new int[][] {{0,1,-1},{1,0,-1},{1,0,1}})).isEqualTo(new String[] {"*.*"});
        assertThat(makingStar.solution(new int[][] {{1,-1,0},{2,-1,0}})).isEqualTo(new String[] {"*"});
        assertThat(makingStar.solution(new int[][] {{1,-1,0},{2,-1,0},{4,-1,0}})).isEqualTo(new String[] {"*"});
    }

    //20230407
    @Test
    public void 프렌즈4블록() {
        assertThat(friends4block.solution(4, 5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"})).isEqualTo(14);
        assertThat(friends4block.solution(6, 6, new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})).isEqualTo(15);
    }

    //20230412
    @Test
    public void 게임맵최단거리() {
        assertThat(gameMap.solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}})).isEqualTo(11);
        //assertThat(gameMap.solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}})).isEqualTo(-1);
    }

    //20230426
    @Test
    public void 뒤에있는큰수찾기() {
        assertThat(findtheLargeNumber.solution(new int[] {2, 3, 3, 5})).isEqualTo(new int[] {3, 5, 5, -1});
        assertThat(findtheLargeNumber.solution(new int[] {9, 1, 5, 3, 6, 2})).isEqualTo(new int[] {-1, 5, 6, 6, -1, -1});
    }
}
