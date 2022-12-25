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
        return sum(z) + minus(z) + multiply(z) + divide(z);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int summ = calculator.sum(10);
        int rsl = calculator.multiply(5);
        int result = calculator.minus(8);
        int div = calculator.divide(30);
        int suma = calculator.sumAllOperation(summ + rsl + result + div);
        System.out.println(summ);
        System.out.println(rsl);
        System.out.println(result);
        System.out.println(div);
        System.out.println(suma) ;
    }
}