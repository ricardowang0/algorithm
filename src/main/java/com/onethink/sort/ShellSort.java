package com.onethink.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 算法逻辑：
 * 对插入排序的优化,
 * 按照一定步长对原有的数组进行分组，每组进行插入排序
 * 分组， 步长h=3 则0和3为一组，1和4为一组，2和为1组
 * 不断缩小步长
 */
public class ShellSort extends BaseSort {
    @Override
    public <E extends Comparable<E>> void sort(E[] a) {

    }
//    public static void main(String[] args) {
//        Comparable[] a = {1213, 121, 312, 31312, 1, 311, 3, 211, 33};
//        sort(a);
//        System.out.println(Arrays.toString(a));
//
//    }
//
//    public static void sort(Comparable[] a) {
//        int h = a.length % 2 == 0 ? a.length / 2 : (a.length / 2 + 1);
//        while (h > 0) {
//            for (int i = h; i < a.length; i++) {
//                for (int j = i; j >=h; j -= h) {
//                    if (greater(a[j - h], a[j])) {
//                        exec(a, j - h, j);
//                    } else {
//                        break;
//                    }
//                }
//            }
//            h = h / 2;
//        }
//    }
}
