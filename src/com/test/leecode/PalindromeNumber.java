package com.test.leecode;

/**
 * Created by vincent on 2017/7/25.
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x >= 0) {
            return new StringBuilder(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
        } else {
            return false;
        }


    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(22311322));
        System.out.println(pn.isPalindrome(1900000091));
    }
}
