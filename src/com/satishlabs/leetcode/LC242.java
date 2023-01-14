package com.satishlabs.leetcode;

/*
 Valid Anagram
 Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters.
 * */
public class LC242 {
	public static void main(String[] args) {
		// Case 1:
		String a = "satish";
		String b = "htissa";
		if (isAnagram(a, b)) {
			System.out.println("Anagram");
		} else {
			System.out.println("NoT");
		}

		// Case 1:
		String a1 = "anagram";
		String b1 = "nagaram";
		if (isAnagram(a1, b1)) {
			System.out.println("Anagram");
		} else {
			System.out.println("NoT");
		}

		// Case 3:
		String a2 = "rat";
		String b2 = "car";
		if (isAnagram(a2, b2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("NoT");
		}
	}

	private static boolean isAnagram(String str1, String str2) {
		if (str1.length() != str2.length()) {
			return false;
		}

		int count[] = new int[26];
		for (int i = 0; i < str1.length(); i++) {
			count[str1.charAt(i) - 97]++;
			count[str2.charAt(i) - 97]--;
		}

		for (int i = 0; i < count.length; i++) {
			if (count[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
