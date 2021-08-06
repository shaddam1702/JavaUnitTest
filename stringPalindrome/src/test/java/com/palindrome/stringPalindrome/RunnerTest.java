package com.palindrome.stringPalindrome;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RunnerTest {
	
	
	Runner runner = new Runner();
    @Test
    public void test()
    {
    	 assertEquals(29 , runner.number(29));
    }
}
