package com.mentoring.mju.v1.racing.domain.car.Move;

import com.mentoring.mju.v1.racing.view.InputView;
import org.junit.jupiter.api.Test;

public class CarRandomNumberTest {
    @Test
    void 랜덤숫자_배열에저장() {
        //given
        int chanceNumber = 5; // 예시로 5회 설정
        //when
        CarRandomNumber carRandomNumber = new CarRandomNumber();
        carRandomNumber.generateNumbers(chanceNumber);

        //then
        carRandomNumber.printNumbers();
    }
}
