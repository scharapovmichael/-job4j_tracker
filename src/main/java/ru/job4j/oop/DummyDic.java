package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String language = "Unknown word";
        return "Неизвестное слово" + eng;
    }

    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = dic.engToRus(" Some word");
        System.out.println(eng);
    }
}