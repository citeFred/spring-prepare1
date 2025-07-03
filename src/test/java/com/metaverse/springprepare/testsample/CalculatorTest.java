package com.metaverse.springprepare.testsample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        // given (테스트에 사용될 값들)
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "+";

        // when (테스트실행)
        Double result = calculator.operate(num1, op, num2);

        // then (결과)
        System.out.println("result = " + result);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void test2() {
        // given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        String op = "/";

        // when
        Double result = calculator.operate(num1, op, num2);

        // then
        System.out.println("result = " + result);
        Assertions.assertEquals(4, result);
    }

}