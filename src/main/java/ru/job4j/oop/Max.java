package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
         return = max(left, right) <= right ? right : left;
    }

    public static int max(int left, int right, int m) {
        return = max(left, right) <= m ? m : max(left, right);
        return;
    }

    public static int max(int left, int right, int m, int v) {
        return= max(left, right, m) <= v ? v : max(left, right, m);
        return;
    }
}