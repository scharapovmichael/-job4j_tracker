package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] index) {
        array = index;
    }

    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        Reduce reduse = new Reduce();
        reduse.to(array);
        reduse.print();
    }
}