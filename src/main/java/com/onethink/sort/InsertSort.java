package com.onethink.sort;

import com.onethink.util.ArrayGenerator;
import com.onethink.util.SortHelper;

/**
 * 插入排序: 类似于打牌的放牌
 * 分两组，一组已经排序，一组没有排序，将没有排序的插入到已经排序的数组
 */
public class InsertSort extends BaseSort {

    @Override
    public <E extends Comparable<E>> void sort(E[] a) {
        //默认0为已经排序的，外层循环从1开始，代表未排序的
        for (int i = 1; i < a.length; i++) {
            //倒序遍历已经排序的数组
            for (int j = i; j > 0; j--) {
                //如果已经排序的数组元素大于未排序元素，则交换
                if ((a[j - 1].compareTo(a[j])) > 0) {
                    swap(a, j - 1, j);
                } else {
                    //找到已经排序的数组元素小于等于未排序，则找到了待排序元素位置，停止遍历已经排序的数组
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortHelper.sortTest("com.onethink.sort.InsertSort", arr);
        }
        //com.onethink.sort.InsertSort算法，数据规模n = 10000 , 耗时0.095334  s
        //com.onethink.sort.InsertSort算法，数据规模n = 100000 , 耗时8.954800  s
        //根据结果 O(n)

        int[] dataSize2 = {10000, 100000};
        for (int n : dataSize2) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortHelper.sortTest("com.onethink.sort.InsertSort2", arr);
        }
//        com.onethink.sort.InsertSort2算法，数据规模n = 10000 , 耗时0.087319  s
//        com.onethink.sort.InsertSort2算法，数据规模n = 100000 , 耗时7.186170  s
    }


}
