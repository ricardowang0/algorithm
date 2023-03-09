package com.onethink.util;

import com.onethink.sort.BaseSort;

public class SortHelper {
    private SortHelper() {
    }

    /**
     * 判断是否顺序排序完成
     *
     * @return boolean
     * @author wangjie
     * @date 2023/3/8 18:57
     * @since 1.0.0
     */
    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        boolean forwardFlag = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                forwardFlag = false;
            }
        }
        boolean reverseFlag = true;
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i - 1].compareTo(arr[i]) < 0) {
                reverseFlag = false;
            }
        }
        return forwardFlag || reverseFlag;
    }

    /**
     * 判断是否顺序排序完成
     *
     * @return boolean
     * @author wangjie
     * @date 2023/3/8 18:57
     * @since 1.0.0
     */
    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {
        long startTime = System.nanoTime();
        Object o = null;
        try {
            Class<?> clazz = Class.forName(sortName);
            BaseSort sortClas = (BaseSort) clazz.newInstance();
            sortClas.sort(arr);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        long endTime = System.nanoTime();
        double time = (endTime - startTime) / 1000000000.0;
        if (!SortHelper.isSorted(arr)) {
            throw new RuntimeException(sortName + "  failed");
        }
        System.out.println(String.format("%s算法，数据规模n = %d , 耗时%f  s", sortName, arr.length, time));
    }
}
