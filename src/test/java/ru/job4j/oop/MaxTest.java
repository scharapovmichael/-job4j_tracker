package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    void whenMax4To6Then6To8Then8() {
        int left = 4;
        int right = 6;
        int m = 8;
        int result = Max.max(left, right, m);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax9To3Then3To5Then5To1Then1() {
        int left = 9;
        int right = 3;
        int m = 5;
        int v = 1;
        int result = Max.max(left, right, m, v);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }
}