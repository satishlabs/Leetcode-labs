package com.satishlabs.leetcode;
/*
 387. First Unique Character in a String
 Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

Example 1:
Input: s = "leetcode"
Output: 0

Example 2:
Input: s = "loveleetcode"
Output: 2

Example 3:
Input: s = "aabb"
Output: -1
 

Constraints:

1 <= s.length <= 105
s consists of only lowercase English letters.
 * */
public class LC387 {
	public static void main(String[] args) {
		String str = "1Ab2D1cd5Ab";
		int index = firstUniqChar(str);
		System.out.println(index);
	}

	private static int firstUniqChar(String str) {
		int n = str.length();
		int count[] = new int[26];
		
		for(int i=0; i<n; i++) {
			count[str.charAt(i)-97]++;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(count[str.charAt(i)-97] == 1) {
				return i;
			}
		}
		return -1;
	}
	
}
