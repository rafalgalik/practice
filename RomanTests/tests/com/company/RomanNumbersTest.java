package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumbersTest {

    private RomanNumbers romanNumbers;

    @Before
    public void setUp() throws Exception {
        romanNumbers = new RomanNumbers();
    }

    @Test
    public void Ones() throws Exception {
        assertEquals(1, romanNumbers.RomanToArabic("I"));
        assertEquals(2, romanNumbers.RomanToArabic("II"));
        assertEquals(3, romanNumbers.RomanToArabic("III"));
    }

    @Test
    public void Four() throws Exception {
        assertEquals(4, romanNumbers.RomanToArabic("IV"));
    }

    @Test
    public void Five() throws Exception {
        assertEquals(5, romanNumbers.RomanToArabic("V"));
    }

    @Test
    public void Six() throws Exception {
        assertEquals(6, romanNumbers.RomanToArabic("VI"));
    }

    @Test
    public void Nine() throws Exception {
        assertEquals(9, romanNumbers.RomanToArabic("IX"));
    }

    @Test
    public void Ten() throws Exception {
        assertEquals(10, romanNumbers.RomanToArabic("X"));
    }

    @Test
    public void ThirtyEight() throws Exception {
        assertEquals(890, romanNumbers.RomanToArabic("DCCCXC"));
    }


}