package com.training.example.JacocoExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void whenEmptyString_thenAccept() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome(""));
	}

	@Test
	public void check_palindrome_true() {
	    Palindrome palindromeTester = new Palindrome();
	    assertTrue(palindromeTester.isPalindrome("abcba"));
	}
	
	@Test
	public void check_palindrome_false() {
	    Palindrome palindromeTester = new Palindrome();
	    assertFalse(palindromeTester.isPalindrome("Anand"));
	}
}
