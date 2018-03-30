package com.seveniu.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by seveniu on 3/28/18.
 * *
 */
public class SelfDividingNumbers {
    /*
    1. 如何判断一个整数的长度
     */
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new LinkedList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isDividingSelf(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isDividingSelf(int num) {
        int temp = num;
        while (true) {
            int i = temp % 10;
            if (i == 0) {
                return false;
            }
            if (num % i != 0) {
                return false;
            }
            temp = temp / 10;
            if (temp == 0) {
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        List<Integer> list = selfDividingNumbers.selfDividingNumbers(2, 10000);
        System.out.println(list);
    }
}
