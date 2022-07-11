package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public void printPos() {
        System.out.println("Активна: " + active);
        System.out.println("Статус ошибки: " + status);
        System.out.println("Сообщение: " + message);
    }

    public Error() {
        active = true;
        status = 505;
        message = "HTTP Version Not Supported";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error error = new Error(true, 505, "HTTP Version Not Supported");
        error.printPos();
        Error error1 = new Error(true, 404, "Not Found");
        error1.printPos();
        Error error2 = new Error();
        error2.printPos();
    }
}