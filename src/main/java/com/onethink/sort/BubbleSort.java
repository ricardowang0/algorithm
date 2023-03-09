package com.onethink.sort;

import java.util.Arrays;

/**
 * 冒泡算法步骤
 * 1 相邻元素互相交换，将大的往往右放(正序)，每轮结束，最右边都是最大的
 * 2 共多少轮 总数-1
 * 3 每一轮截止下标= 总数-1-轮数
 *
 * @author wangjie
 * &#064;date  2022/11/24 21:34
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 7, 8, 1};
//        optimizeSort(a);3
        sort(a);//7
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a) {
        int num = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
            num++;
        }
        System.out.println(num);
    }

    /**
     * 鸡尾酒排序,数组元素部分有序的优化
     *
     * @param a:
     * @return void
     * @author wangjie
     * @date 2022/12/26 21:41
     * @since 1.0.0
     */
    public static void optimizeSort(int[] a) {
        int min = 0;
        int max = 0;
        int num = 0;
        for (int i = 0; i < a.length - 1; i++) {
            boolean isSorted1 = true;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                    isSorted1 = false;
                }
            }
            num++;
            if (isSorted1) {
                break;
            }
            max = a.length - 1 - i;
            boolean isSorted2 = true;
            for (int j = max - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                    isSorted2 = false;
                }
            }
            min = i;
            num++;
            if (isSorted2) {
                break;
            }

            if (min >= max) {
                break;
            }
        }
        System.out.println(num);
    }

    public static void reverseSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = a.length - 1; j > i; j--) {
                if (a[j - 1] < a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

    }
}