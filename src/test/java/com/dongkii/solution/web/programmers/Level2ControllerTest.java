package com.dongkii.solution.web.programmers;

import com.dongkii.solution.web.programmers.level2.*;
import org.junit.jupiter.api.Test;

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
}
