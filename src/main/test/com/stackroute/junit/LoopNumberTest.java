package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopNumberTest {
    LoopNumber obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new LoopNumber();
    }

    @After
    public void tearDown() {
        System.out.println("After");
        obj = null;
    }

    @Before
    public void setUpBeforeClass() {
        System.out.println("BeforeClass");

    }

    @After
    public void tearDownAfterClass() {
        System.out.println("AfterClass");

    }
    @Test
    public void givenIntegerShouldReturnSeries()
    {
        //Act

        String result = obj.loopSeries(3);
        //Assert
        assertEquals("", "122333", result);

    }
    @Test
    public void givenIntegerShouldReturnnoseriesAsTheInputIsZero()
    {
        //Act
        LoopNumber loopobj = new LoopNumber();
        String result = obj.loopSeries(0);
        //Assert
        assertEquals("", result);

    }

}