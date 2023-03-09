package com.onethink.sort;


import java.util.Arrays;

/**
 * 快速排序：
 * 也是分治思想， 不过不是简单的按索引大小二分，
 * 而是按照一定基准二分
 * 1. 基准值默认第一个或者最后一个元素
 * 2. 左指针从左往右遍历，比基准值大的则停止移动左指针
 * 3. 右指针从右往左遍历，遇到比基准值小的则停止移动右边指针
 * 4. 交换左右指针的值
 * 5. 重复2，3，4 直到左指针>=右指针
 * 6. 右指针指向的位置则为分组索引值
 */
public class QuickSort extends BaseSort {
    @Override
    public <E extends Comparable<E>> void sort(E[] a) {

    }
//    public static void main(String[] args) {
//        Comparable[] a = {1213, 121, 312, 31312, 1, 311};
//        sort(a);
//        System.out.println(Arrays.toString(a));
//    }

//    public static void sort(Comparable[] arr) {
//        int lo = 0;
//        int hi = arr.length - 1;
//        sort(arr, lo, hi);
//    }
//
//    private static void sort(Comparable[] arr, int lo, int hi) {
//        if (lo >= hi) {
//            return;
//        }
//        //获得分组的索引值，分组让左组的元素都小于右边
//        int index = partition(arr, lo, hi);
//        //递归让左边有序
//        sort(arr, lo, index - 1);
//        //递归让右边有序
//        sort(arr, index + 1, hi);
//    }
//
//    private static int partition(Comparable[] arr, int lo, int hi) {
//
//        //基准元素初始下标
//        int k = lo;
//        //左指针，从左往右遍历，将left指针移动到比基准值大的元素位置
//        int left = lo;
//        //右指针，从右往左遍历，将right指针移动到比基准值小的元素位置
//        int right = hi;
//        while (true) {
//            while (greater(arr[k], arr[left])) {
//                //没有找到比基准元素大的，则一直遍历
//                if (left == hi) {
//                    break;
//                }
//                left++;
//            }
//            while (greater(arr[right], arr[k])) {
//                //没有找到比基准元素小的，则一直遍历
//                if (right == lo) {
//                    break;
//                }
//                right--;
//            }
//            //交换左右指针的元素,
//            if (right <= left) {
//                break;
//            } else {
//                exec(arr, left, right);
//            }
//        }
//        //此时right <= left;交换基准元素
//
//        exec(arr, lo, right);
//        return right;
//    }
}
