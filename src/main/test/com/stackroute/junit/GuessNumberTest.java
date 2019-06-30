package com.stackroute.junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber obj;

    @Before
    public void setUp() {
        System.out.println("Before");
        obj = new GuessNumber();
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

    public class GuessTest {
        @Test
        public void givenNumberShouldMatchTheOriginalNumber() {

            String result = obj.guessInputnumberWithTarget(24);
            //Assert
            assertEquals("", "Number guessed matches the original number", result);

        }

        @Test
        public void givenNumberShouldGuessThatNumberIsLessThanTarget() {
            //Act

            String result = obj.guessInputnumberWithTarget(20);
            //Assert
            assertEquals("", "Number guessed less than the original number", result);

        }

        public void givenNumberShouldGuessNumberMatchesTheTarget() {
            //Act

            String result = obj.guessInputnumberWithTarget(25);
            //Assert
            assertEquals("", "Number guessed matches the original number", result);

        }

        public void givenNumberShouldGuessNumberThatUserEnteredANeagativeNumber() {
            //Act

            String result = obj.guessInputnumberWithTarget(-1);
            //Assert
            assertEquals("", "Entered number is negative", result);

        }


    }

}