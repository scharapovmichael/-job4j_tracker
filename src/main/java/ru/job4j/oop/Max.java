package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int m) {
        return max(m, max(left, right));
    }

    public static int max(int left, int right, int m, int v) {
        return max(v, max(left, right, m));
    }
}