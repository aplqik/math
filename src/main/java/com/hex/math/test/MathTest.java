package com.hex.math.test;

import java.util.Arrays;

/**
 * @Date 2020-2-18 17:47
 * @Author hex
 * @Desc
 */
public class MathTest {


    // array表示一个长度为n的数组
    // 代码中的array.length就等于n
    int[] array = new int[10];
    int count = 0;

    void insert(int val) {

        if (count == array.length) {
            int sum = 0;
            for (int i = 0; i < array.length; ++i) {
                sum = sum + array[i];
            }
            array[0] = sum;
            count = 1;
        }

        array[count] = val;
        ++count;
    }

    public static void main(String[] args) {
        MathTest mathTest = new MathTest();
        mathTest.insert(10);
    }
}
