package com.mentoring.mju.v1.racing.view;

import com.mentoring.mju.v1.racing.domain.car.Move.CarRandomNumber;

import java.util.Scanner;

public class InputView {
    private static final Scanner input = new Scanner(System.in);
    public static String[] carNamesArray;

    public static int Chance() {
        System.out.println("시도할 횟수는 몇회 인가요?");
        int chance = input.nextInt();
        input.nextLine(); // 개행 문자 소비
        return chance;
    }

    public static InputView CarNameInput() {
        int maxLength = 5;
        System.out.println("경주할 자동차 이름을 입력하세요:(이름은 , (쉼표)를 기준으로 구분");
        String carsName;
        do {
            carsName = input.nextLine();
            carNamesArray = carsName.split(",");
            if (carsName.length() > maxLength) {
                System.out.println("이름은 최대 5글자까지 입력할 수 있습니다. 다시 입력해주세요.");
            }
        } while (carsName.length() > maxLength);

        int chance = Chance(); // 시도할 횟수를 입력받음
        CarRandomNumber carRandomNumber = new CarRandomNumber();
        carRandomNumber.generateNumbers(chance); // 시도할 횟수를 전달하여 번호를 생성
        return new InputView();
    }
}
