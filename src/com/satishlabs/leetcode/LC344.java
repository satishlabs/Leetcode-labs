package com.satishlabs.leetcode;

/*
 344. Reverse String 
Description: 
- Write a function that reverses a string. 
- The input string is given as an array of characters chArr. 
- You must do this by modifying the input array in-place with O(1) extra 
memory. 

Example 1: 
Input: s = ["h","e","l","l","o"] 
Output: ["o","l","l","e","h"] 

Example 2: 
Input: s = ["H","a","n","n","a","h"] 
Output: ["h","a","n","n","a","H"] 


Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.

 * */
public class LC344 {
	public static void main(String[] args) {
		
		//Test Case : 1
		String str = "hello";
		char chArr[] =  str.toCharArray();
		reverseString(chArr);
		String revStr = new String(chArr);
		System.out.println(revStr);
		
		//Test Case : 1
				String str1 = "Hannah";
				char chArr1[] =  str1.toCharArray();
				reverseString(chArr1);
				String revStr1 = new String(chArr1);
				System.out.println(revStr1);
	}

	private static void reverseString(char chArr[]) {
		int start = 0;
		int end = chArr.length-1;
		while(start <end) {
			char temp = chArr[start];
			chArr[start] = chArr[end];
			chArr[end] = temp;
			start++;
			end--;
		}
		
	}
}
