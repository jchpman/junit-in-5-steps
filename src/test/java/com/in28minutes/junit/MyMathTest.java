package com.in28minutes.junit;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    @Before
    public void before(){
        System.out.println("^^ Before method ran ^^");
    }

    @After
    public void after(){
        System.out.println("^^ After method ran ^^");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("^^ Before Class ran ^^");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("^^ After Class ran ^^");
    }
    @Test
    public void sum_with3numbers() {

        System.out.println("Test sum_with3numbers");

        int result = new MyMath().sum(new int[]{1, 2, 3});

        //assertEquals(expected, actual);
        assertEquals(6, result);

        System.out.println(result);
        //fail("Test not implemented yet")
    }

    @Test
    public void sum_with1number() {

        System.out.println("Test sum_with1number");

        MyMath myMath = new MyMath();
        int result1 = myMath.sum(new int[]{7});

        //assertEquals(expected, actual);
        assertEquals(7, result1);
    }



}