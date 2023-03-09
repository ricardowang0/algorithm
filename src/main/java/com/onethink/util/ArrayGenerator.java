package com.onethink.util;

import java.util.Random;

public class ArrayGenerator {
    private ArrayGenerator() {
    }

    /**
     * 生成顺序数组
     *
     * @param n:数组规模
     * @return java.lang.Integer[]
     * @author wangjie
     * @date 2023/3/8 19:27
     * @since 1.0.0
     */
    public static Integer[] generateOrderedArray(int n) {
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        return arr;
    }

    /**
     * 生成随机数组
     *
     * @param n:数组规模
     * @param bound：随机数字的范围 0 <= nextInt结果 < bound。
     * @return java.lang.Integer[]
     * @author wangjie
     * @date 2023/3/8 19:27
     * @since 1.0.0
     */
    public static Integer[] generateRandomArray(int n, int bound) {
        Integer[] arr = new Integer[n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = rnd.nextInt(bound);
        }
        return arr;
    }
}
