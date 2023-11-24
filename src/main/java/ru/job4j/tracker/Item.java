package ru.job4j.tracker;

public class Item {
    private int id;
    private String name;

    public Item() {
    }

    public Item(String name) {
        this.name = name;
    }

    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println();
        System.out.println("айди" + id);
        System.out.println("Имя" + name);
    }

    public static void main(String[] args) {
        Item first = new Item();
        first.printInfo();
        Item second = new Item("Паша");
        second.printInfo();
        Item third = new Item(10, "Степа");
        third.printInfo();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}