package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected);
    }

    @Test
    public void when00to00then0() {
        int expected = 0;
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected);
    }

    @Test
    public void when10to00then1() {
        int expected = 1;
        Point a = new Point(1, 0);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected);
    }

    @Test
    public void when01to00then1() {
        int expected = 1;
        Point a = new Point(0, 1);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        assertThat(dist).isEqualTo(expected);
    }

    @Test
    public void when01to00to00then1() {
        int expected = -1;
        Point c = new Point(0, 1, 0);
        Point d = new Point(0, 0, 0);
        double dist = c.distance3d(d);
        assertThat(dist).isEqualTo(expected);
    }
}