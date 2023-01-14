package com.satishlabs.leetcode;
/*
  Is Subsequence
  Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:

Input: s = "abc", t = "ahbgdc"
Output: true
Example 2:

Input: s = "axc", t = "ahbgdc"
Output: false
 

Constraints:

0 <= s.length <= 100
0 <= t.length <= 104
s and t consist only of lowercase English letters.
 

Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
 * */
public class LC392 {
	public static void main(String[] args) {
		//Case 1:
		String main = "ais";
		String sub = "Satish";
		
		boolean b = isSubsequence(main,sub);
		System.out.println(b);
		
		//Case 2:
		String main1 = "abc";
		String sub1 = "ahbgdc";
				
		boolean b1 = isSubsequence(main1,sub1);
		System.out.println(b1);
		
		//Case 3:
		String main2 = "axc";
		String sub2 = "ahbgdc";
				
		boolean b2 = isSubsequence(main2,sub2);
		System.out.println(b2);
	}

	private static boolean isSubsequence(String sub, String main) {
		int m = main.length();
		int n = sub.length();
		
		int i=0;
		int j=0;
		while(i<m && j<n) {
			if(main.charAt(i)==sub.charAt(j)) {
				j++;
			}
			i++;
		}
		return(j==n);
	}
}
