package com.onethink.sort;

import com.onethink.util.ArrayGenerator;
import com.onethink.util.SortHelper;

/**
 * 选择排序
 * 一直寻找最小的元素，依次放到数组0，1，2 ... N
 * 步骤
 * 1 设置一个变量存储最小的下标 ，假定第一个元素是最小的分别和剩下的元素比较,交换最小的元素下标，一轮结束，最小下标在最左
 * 2 在剩下的元素中按上述方法排序
 * 复杂度 n²
 * 比较稳定
 *
 * @author wangjie
 * @date 2022/11/24 21:51
 * @since 1.0.0
 */
public class SelectSort extends BaseSort {

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortHelper.sortTest("com.onethink.sort.SelectSort", arr);
        }
    }


    @Override
    public <E extends Comparable<E>> void sort(E[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i; j < a.length; j++) {
                if (a[min].compareTo(a[j]) > 0) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }
}
