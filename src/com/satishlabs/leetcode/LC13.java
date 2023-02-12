package com.satishlabs.leetcode;

import java.util.HashMap;
import java.util.Map;

/*
 LC-12 Roman to Integer
 
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

 

Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 

Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 
 * */
public class LC13 {
	static Map<String, Integer> mymap = new HashMap<>();
	static {
		mymap.put("M", 1000);
		mymap.put("CM", 900);
		mymap.put("D", 500);
		mymap.put("CD", 400);
		mymap.put("C", 100);
		mymap.put("XC", 90);
		mymap.put("L", 50);
		mymap.put("XL", 40);
		mymap.put("X", 10);
		mymap.put("IX", 9);
		mymap.put("V", 5);
		mymap.put("IV", 4);
		mymap.put("I", 1);

	}

	public static void main(String[] args) {
		int str = romanToInt("XXIV");
		System.out.println(str);
	}

	private static int romanToInt(String str) {
		StringBuilder sb = new StringBuilder();
		int n = str.length();
		int sum = 0;
		int i = 0;
		while (i < n) {
			String currSymbol = str.substring(i, i + 1); // X
			int currValue = mymap.get(currSymbol); // 10

			int nextValue = 0;
			if (i + 1 < n) {
				String nextSymbol = str.substring(i + 1, i + 2);// X
				nextValue = mymap.get(nextSymbol);// 10
			}

			if (currValue >= nextValue) {
				sum = sum + currValue;
				i = i + 1;
			} else {
				sum = sum + (nextValue - currValue);
				i = i + 2;
			}

		}

		return sum;
	}
}

//Time => O(1)
//Space =>O(n)
