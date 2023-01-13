package com.satishlabs.leetcode;


/*
 Reverse Vowels of a String 

Given a string s, reverse only all the vowels in the string and return it.

The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

 

Example 1:

Input: s = "hello"
Output: "holle"
Example 2:

Input: s = "leetcode"
Output: "leotcede"
 

Constraints:

1 <= s.length <= 3 * 105
s consist of printable ASCII characters.

 * */
public class LC345 {
	public static void main(String[] args) {
		//Case 1:
		String str = "hello";
		String revStr = reverseVowels(str);
		System.out.println(revStr);
		//Case 2:
		String str2 = "leetcode";
		String revStr2 = reverseVowels(str2);
		System.out.println(revStr2);
		
		//Case 3:
		String str3 = "Satish";
		String revStr3 = reverseVowels(str3);
		System.out.println(revStr3);
		
	}

	private static String reverseVowels(String str) {
		int n = str.length();
		char[] charArr = str.toCharArray();
		
		int start = 0;
		int end = charArr.length-1;
		while(start<end) {
			while(start<n && !isVowel(charArr[start])) {
				start++;
			}
			while(end >=0 && !isVowel(charArr[end])) {
				end--;
			}
			if(start < end) {
				char temp = charArr[start];
				charArr[start] = charArr[end];
				charArr[end] = temp;
			}
			start++;
			end--;
		}
		String resultStr = new String(charArr);
		return resultStr;
	}

	private static boolean isVowel(char c) {
		return c =='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
	}
}
