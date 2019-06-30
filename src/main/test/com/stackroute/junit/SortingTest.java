package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    Sorting obj;
    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Sorting();
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
    public void givenNumberShouldSortNumberandCalculateEvenSum()
    {
        //Act

        String result = obj.sortingDesc(234678);
        //Assert
        assertEquals("Test case passed", "true", result);

    }
    @Test
    public void givenNumberShouldSortNumberandCalculateEvenSumIncorrectly()
    {
        //Act
        Sorting sortobj = new Sorting();
        String result = obj.sortingDesc(112346);
        //Assert
        assertEquals("", "false", result);

    }
    @Test
    public void givenNumberShouldSortNumberandCalculatesumAndDispalyWrongSum()
    {
        //Act
        Sorting sortobj = new Sorting();
        String result = sortobj.sortingDesc(234678);
        //Assert
        assertEquals("", "true", result);

    }
    public void givenNumberShouldreturnErrorMessage()
    {
        //Act
        Sorting sortobj = new Sorting();
        String result = sortobj.sortingDesc(0);
        //Assert
        assertEquals("", "entered number is zero.Cant calculate sum", result);

    }


}