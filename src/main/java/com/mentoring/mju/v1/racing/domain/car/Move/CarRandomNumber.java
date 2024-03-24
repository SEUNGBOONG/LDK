package com.mentoring.mju.v1.racing.domain.car.Move;

import com.mentoring.mju.v1.racing.view.InputView;

import java.util.Random;

public class CarRandomNumber extends InputView {

    private static int[] randomNumberStore;
    public static void generateNumbers(int chanceNumber) {
        randomNumberStore = new int[chanceNumber]; // 배열 초기화

        Random random = new Random(); //chanceNumber에 삽입
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
