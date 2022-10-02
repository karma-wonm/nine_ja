package ru.netology.sqr;

public class SQRService {
    public int sqrSearch(int min, int max) {
        int sqrCounter = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i < min) {
                continue;
            } else if (i * i >= min && i * i <= max) {
                sqrCounter++;
            } else {
                break;
            }
        }
        return sqrCounter;
    }
}
