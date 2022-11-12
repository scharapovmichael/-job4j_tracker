package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int q) {
        return q - x;
    }

    public int divide(int p) {
        return p / x;
    }

    public int sumAllOperation(int z) {
        return z;
    }

    public static void main(String[] args) {
        int pos = sum(10);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int result = minus(8);
        Calculator cal = new Calculator();
        int var = cal.divide(30);
        Calculator counter = new Calculator();
        int wep = counter.sumAllOperation(pos + rsl + result + var);
        System.out.println(var);
        System.out.println(pos);
        System.out.println(result);
        System.out.println(rsl);
        System.out.println(wep)
    }
}