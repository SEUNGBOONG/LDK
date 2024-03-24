package com.mentoring.mju.v1.racing.view;

import com.mentoring.mju.v1.racing.domain.car.Move.CarRandomNumber;

import java.util.Arrays;
import java.util.Scanner;

public class InputView {
    private static final Scanner input = new Scanner(System.in);
    public static String[] carNamesArray;

//    public static void Chance(int CarRandomNuber) {  //여기서 시도할횟수 받고
//        System.out.println("시도할 횟수는 몇회 인가요?");
//        CarRandomNumber.generateNumbers(input.nextInt());
//    }
    public static  void CarNameInput(String carsName) {
        int maxLength = 5;
        System.out.println("경주할 자동차 이름을 입력하세요:(이름은 , (쉼표)를 기준으로 구분");
        do {
            carsName = Arrays.toString(input.nextLine().split(","));
//            carNamesArray = carsName.split(",");
            if (carsName.length() > maxLength) {
                System.out.println("이름은 5글자로 제한합니다.");
            }
        } while (carsName.length() > maxLength);

    }
}
