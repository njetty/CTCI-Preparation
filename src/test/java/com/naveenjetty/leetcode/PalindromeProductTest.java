package com.naveenjetty.leetcode;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by naveenjetty on 1/23/17.
 */
class PalindromeProductTest {

    static PalindromeProduct pp;

    @BeforeAll
    static void init(){
        pp = new PalindromeProduct();
    }

    @Test
    void isCorrectforTwo(){
        assertTrue(987==pp.largestPalindrome(2));
    }

    @Test
    void isCorrectforThree(){
        assertTrue(123==pp.largestPalindrome(3));
    }

    @Test
    void isCorrectforFour(){
        assertTrue(597==pp.largestPalindrome(4));
    }

    @Test
    void isCorrectforFive(){
        assertTrue(677==pp.largestPalindrome(5));
    }

    @Test
    void isCorrectforSix(){
        assertTrue(1218==pp.largestPalindrome(6));
    }

    @Test
    void isCorrectforSeven(){
        assertTrue(877==pp.largestPalindrome(7));
    }

    @Test
    void isCorrectforEight(){
        assertTrue(475==pp.largestPalindrome(8));
    }


}