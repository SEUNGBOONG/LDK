package com.mentoring.mju.v1.racing.domain.car.Move;

import java.util.Random;

public class CarRandomNumber {

    private int[] randomNumberStore;

    public void generateNumbers(int chanceNumber) {
        randomNumberStore = new int[chanceNumber]; // 배열 초기화

        Random random = new Random();
        for (int i = 0; i < chanceNumber; i++) {
            randomNumberStore[i] = random.nextInt(10); // 0부터 9까지의 임의의 정수 생성
        }
    }

    public void printNumbers() {
        for (int number : randomNumberStore) {
            System.out.println(number);
        }
    }
}
