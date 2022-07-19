package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }
    public static void main(String[] args) {
        Battery charger = new Battery(250);
        Battery another = new Battery(50);
        System.out.println("charger : " + charger.load + ". another : " + another.load);
        another.exchange(charger);
        System.out.println("charger : " + charger.load + ". another : " + another.load);
    }
}