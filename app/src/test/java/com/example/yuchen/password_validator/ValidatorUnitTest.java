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
}