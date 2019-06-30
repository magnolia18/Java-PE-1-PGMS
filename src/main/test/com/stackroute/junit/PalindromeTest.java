package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new Palindrome();
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
    public void givenNumberShouldReturnPalindromeSumLessThan25()
    {
        //Act

        String result = obj.checkPalindromeNumber(363);
        //Assert
        assertEquals("",363+" is a palindrome with sum of even numbers less than 25",result);

    }
    @Test
    public void givenNumberShouldReturnAPalindromeWithSumGreaterThan25()
    {
        //Act

        String result =obj.checkPalindromeNumber(88388);
        //Assert
        assertEquals("",88388+" is a palindrome with sum of even numbers less than 25",result);


    }

    @Test
    public void givenNumberShouldReturnNotAPalindromePalindrome()
    {
        //Act

        String result = obj.checkPalindromeNumber(363636);
        //Assert
        assertEquals("",363636+" is not a palindrome",result);


    }

}