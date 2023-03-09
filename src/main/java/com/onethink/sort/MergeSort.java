package com.onethink.sort;

import java.util.Arrays;

/**
 * 二路归并排序,
 * 1. 按照下标将整个数组分为两组
 * 2. 分别让每个子组有序，然后合并两个子组
 * 3. 合并的时候,分别比较两个子组对应索引的元素大小，小的放在辅助数组对应位置
 */
public class MergeSort extends BaseSort {

    public static Comparable[] temp;

    @Override
    public <E extends Comparable<E>> void sort(E[] a) {

    }

//    public static void main(String[] args) {
//        Comparable[] a = {1213, 121, 312, 31312, 1, 311};
//        sort(a);
//        System.out.println(Arrays.toString(a));
//    }
//
//    public static void sort(Comparable[] arr) {
//        int lo = 0;
//        int hi = arr.length - 1;
//        temp = new Comparable[arr.length];
//        sort(arr, lo, hi);
//    }
//
//
//    private static void sort(Comparable[] arr, int lo, int hi) {
//        if (lo >= hi) {
//            //递归结束
//            return;
//        }
//        int mid = (lo + hi) / 2;
//        sort(arr, lo, mid);
//        sort(arr, mid + 1, hi);
//        merge(arr, lo, mid, hi);
//    }
//
//    /**
//     * 合并有序数组
//     *
//     * @param arr:          原数组
//     * @param lo:           左有序数组起始元素索引
//     * @param mid:左有序数组末尾索引
//     * @param hi:           右有序数组末尾索引
//     * @return void
//     * @author wangjie
//     * @date 2022/12/27 19:20
//     * @since 1.0.0
//     */
//    private static void merge(Comparable[] arr, int lo, int mid, int hi) {
//        //待填充的辅助数组索引起始位置
//        int i = lo;
//        //左数组移动指针
//        int p1 = lo;
//        //右数组移动指针
//        int p2 = mid + 1;
//        while (p1 <= mid && p2 <= hi) {
//            //P1指针不超过左数组索引返回[lo，mid]，p2指针不超过右数组移动范围[mid+1，hi];
//            if (greater(arr[p2], arr[p1])) {
//                temp[i++] = arr[p1++];
//            } else {
//                temp[i++] = arr[p2++];
//            }
//        }
//        //对于 左右数组不等长的特殊处理
//        while (p1 <= mid) {
//            //左数组区间大于右数组区间
//            temp[i++] = arr[p1++];
//        }
//        while (p2 <= hi) {
//            //左数组区间大于右数组区间
//            temp[i++] = arr[p2++];
//        }
//        //复制数组
//        for (int j = lo; j <= hi; j++) {
//            arr[j] = temp[j];
//        }
//    }
}
