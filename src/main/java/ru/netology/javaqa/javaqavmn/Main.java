package ru.netology.javaqa.javaqavmn;

import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int counter = service.sqrSearch(100, 9801);
        System.out.println(counter);
    }
}