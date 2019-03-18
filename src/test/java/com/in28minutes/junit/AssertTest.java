package com.in28minutes.junit;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AssertTest {

    @Test
    public void test(){


        boolean condition = true;
        assertTrue(condition);
        //assertEquals(true, condition);
    }

    @Test
    public void test1(){

        String a = null;
        assertNull(a);
    }

}