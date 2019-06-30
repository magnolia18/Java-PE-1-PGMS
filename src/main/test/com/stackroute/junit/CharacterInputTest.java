package com.stackroute.junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class CharacterInputTest {

        CharacterInput obj;

        @Before
        public void setUp() {
            System.out.println("Before");
            obj = new CharacterInput();
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
        public void givenCharacterShouldReturnCapital() {
            //Act

            String result = obj.characterCheck('A');
            //Assert
            assertEquals("testcase passed", "The entered input is a capital letter", result);

        }

        public void givenCharacterShouldReturnSmall() {
            //Act

            String result = obj.characterCheck('c');
            //Assert
            assertEquals("testcase passed", "The entered input is a small letter", result);

        }

        public void givenCharacterShouldReturnDigit() {
            //Act

            String result = obj.characterCheck('9');
            //Assert
            assertEquals("testcase passed", "The entered input is a digit", result);

        }
        public void givenCharacterShouldReturnErrorMessage()
        {
            //Act

            String result = obj.characterCheck('$');
            //Assert
            assertEquals("testcase passed", "The entered input is a special character", result);

        }
    }

