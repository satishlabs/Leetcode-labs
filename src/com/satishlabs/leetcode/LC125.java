package com.satishlabs.leetcode;

/*
 125. Valid Palindrome
 
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

 * */
public class LC125 {
	public static void main(String[] args) {
		// Case:1
		String str = "ababa";
		if (isPalindrome(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not");

		// Case:2
		String str1 = "A man, a plan, a canal: Panama";
		if (isPalindrome(str1))
			System.out.println("Palindrome");
		else
			System.out.println("Not");

		// Case:3
		String str3 = "race a car";
		if (isPalindrome(str3))
			System.out.println("Palindrome");
		else
			System.out.println("Not");

		// Case:4
		String str4 = " ";
		if (isPalindrome(str4))
			System.out.println("Palindrome");
		else
			System.out.println("Not");

	}

	public static boolean isPalindrome(String str) {
		str = str.toLowerCase();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (Character.isLetterOrDigit(ch)) {
				sb.append(ch);
			}

		}

		str = sb.toString();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			if (str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
