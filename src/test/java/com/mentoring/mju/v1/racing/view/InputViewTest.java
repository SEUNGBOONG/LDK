package com.mentoring.mju.v1.racing.view;

import org.junit.jupiter.api.Test;

import static com.mentoring.mju.v1.racing.view.InputView.CarNameInput;
import static com.mentoring.mju.v1.racing.view.InputView.carNamesArray;

class InputViewTest {
    @Test
    void 자동차_이름_테스트( ){

        //given
        InputView inputView =new InputView();
        //when
//        InputView.Chance(5);
        InputView.CarNameInput("41,312,dad,22");

        //then
        System.out.println();


    }


}