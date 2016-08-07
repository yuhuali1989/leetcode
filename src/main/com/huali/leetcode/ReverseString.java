package com.huali.leetcode;

/**
 * Example:
 * Given s = "hello", return "olleh".
 */
public class ReverseString {
    public String reverseString(String s) {
        StringBuilder sr=new StringBuilder();;
        if (s == null){
            return null;
        }
        if (s.equals("")){
            return sr.toString();
        }
        int length = s.length();

        for ( int i = 0 ; i <length;i++){
            sr.append( s.charAt(length-i-1));
        }
        return sr.toString();
    }
}
