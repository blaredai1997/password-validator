package com.example.yuchen.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorUnitTest {
    /* JUnit test cases of stage 1
     * Rule 1 - it is not “password” (case insensitive)
     * Rule 2 - it is at least 8 characters long
     */
    @Test
    public void testStage1_Case1() {
        assertEquals(Validator.stage1(""), 0);
    }

    @Test
    public void testStage1_Case2() {
        assertEquals(Validator.stage1("PaSsWoRd"), 1);
    }

    @Test
    public void testStage1_Case3() {
        assertEquals(Validator.stage1("asdfg"), 1);
    }

    @Test
    public void testStage1_Case4() {
        assertEquals(Validator.stage1("qwertyuiop"), 2);
    }

    /* JUnit test cases of stage 2
     * Rule 3 - requiring at least 1 special character
     * Rule 4 - requiring at least 1 digit
     * Rule 5 - requiring both upper and lower case
     */
    @Test
    public void testStage2_Case1() {
        assertEquals(Validator.stage2("zxcv!"), 2);
    }

    @Test
    public void testStage2_Case2() {
        assertEquals(Validator.stage2("zxcvbnm@"), 3);
    }

    @Test
    public void testStage2_Case3() {
        assertEquals(Validator.stage2("zxcvbnm1234"), 3);
    }

    @Test
    public void testStage2_Case4() {
        assertEquals(Validator.stage2("ZXCVbnm#"), 4);
    }

    @Test
    public void testStage2_Case5() {
        assertEquals(Validator.stage2("ASDFghjk1234"), 4);
    }

    @Test
    public void testStage2_Case6() {
        assertEquals(Validator.stage2("ASDFghjk$5678"), 5);
    }

    @Test
    public void testStage2_Case7() {
        assertEquals(Validator.stage2("QwErTyUiOp&*1234567890"), 5);
    }
}