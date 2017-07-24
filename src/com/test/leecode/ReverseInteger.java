package com.test.leecode;

/**
 * Created by vincent on 2017/7/24.
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(321));
        System.out.println(ri.smartReverse(1000000032));
    }

    public int reverse(int x) {

        if (x > 0) {
            String res = String.valueOf(x);
            try {
                return Integer.valueOf(new StringBuilder(res).reverse().toString());
            } catch (Exception e) {
                return 0;
            }
        } else {
            String res = String.valueOf(0 - x);
            try {
                return -Integer.valueOf(new StringBuilder(res).reverse().toString());
            } catch (Exception e) {
                return 0;
            }
        }

    }

    public int smartReverse(int x) {

        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;

        }
        return result;
    }
}
