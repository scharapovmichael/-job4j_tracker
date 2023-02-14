package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To6Then6To8Then8() {
        int left = 4;
        int right = 6;
        int middle = 8;
        int result = Max.max(left, right, middle);
        int expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax9To3Then3To5Then5() {
        int left = 9;
        int right = 3;
        int middle = 5;
        int result = Max.max(left, right, middle);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}