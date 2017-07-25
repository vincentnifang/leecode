package com.test.leecode;

/**
 * Created by vincent on 2017/7/25.
 * Write a function to find the longest common prefix string amongst an array of strings.
 * [leet,leecode,leea,leedasd] => lee
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String first = strs[0];
        int end = first.length();

        for (String str : strs) {
            if (end > str.length()) {
                end = str.length();
            }
            for (int i = 0; i < first.length(); i++) {
                if (i < str.length() && first.charAt(i) != str.charAt(i) && i <= end) {
                    end = i;
                }
            }
        }
        return first.substring(0, end);
    }

    public String binaryLongestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());
        int low = 1;
        int high = minLen;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (isCommonPrefix(strs, middle))
                low = middle + 1;
            else
                high = middle - 1;
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private boolean isCommonPrefix(String[] strs, int len) {

        String str1 = strs[0].substring(0, len);
        for (int i = 1; i < strs.length; i++)
            if (!strs[i].startsWith(str1))
                return false;
        return true;
    }

    public static void main(String[] args) {

        LongestCommonPrefix lcp = new LongestCommonPrefix();
        System.out.println(lcp.longestCommonPrefix(new String[]{}));
        System.out.println(lcp.binaryLongestCommonPrefix(new String[]{}));
    }
}
