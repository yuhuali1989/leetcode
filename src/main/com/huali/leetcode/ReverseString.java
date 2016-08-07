package com.huali.leetcode;

/**
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s) {
        int len = s.length();
        String sr = "";
        for (int i = 0; i <= len; i++) {
            sr += s.charAt(len - i - 1);
        }
        return sr;
    }
}
