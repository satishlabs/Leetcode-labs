package com.satishlabs.leetcode;

/*
 Reverse Words in a String
 
 Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 

Constraints:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s
 * */
public class LC151 {
	public static void main(String[] args) {
		//Case :1
		String str = "SP OK";
		System.out.println(str);
		reverseWords(str);
		String revStr = reverseWords(str);
		System.out.println(revStr);
		
		//Case :2
		String str1 = "  hello world  ";
		System.out.println(str1);
		reverseWords(str1);
		String revStr1 = reverseWords(str1);
		System.out.println(revStr1);
		
		//Case :3
		String str3 = "a good   example";
		System.out.println(str3);
		reverseWords(str3);
		String revStr3 = reverseWords(str3);
		System.out.println(revStr3);

	}

	private static String reverseWords(String str) {
		//str = str.replace("\\s","").trim();
		str = trimsSpaces(str);
		char[] charArr = str.toCharArray();
		int n = charArr.length;
		int start = 0;
		int end = 0;
		while(end < n) {
			if(charArr[end] ==' ') {
				reverse(charArr,start,end-1);
				start = end+1;
			}
			end++;
		}
		reverse(charArr,start,end-1); //Reverse Last Word
		reverse(charArr, 0, n-1); //Reverse the Entire String
		
		String revStr = new String(charArr);
		return revStr;
	}

	public static String trimsSpaces(String str) {//"  hello world  ";
		int left = 0;
		int right = str.length()-1;
		while(left <= right && str.charAt(left)==' ') {
			++left;
		}
		while(left <= right && str.charAt(right)==' ') {
			--right;
		}
		StringBuilder sb = new StringBuilder();
		while(left <= right) {
			char c = str.charAt(left);
			
			if(c!=' ')
				sb.append(c);
			else if(sb.charAt(sb.length()-1)!=' ')
				sb.append(c);
			++left;
		}
		return sb.toString();
	}

	private static void reverse(char[] charArr, int start, int end) {
		while(start < end) {
			char temp = charArr[start];
			charArr[start] = charArr[end];
			charArr[end] = temp;
			start++;
			end--;
		}
	}
}
