package com.onethink.sort;

public  class InsertSort2 extends BaseSort {

    /**
     * 对插入排序的优化 优化swap操作，原有的swap需要操作三次
     * 优化： 对于a[i] 元素 插入到[0,i-1]时候，如果a[i]小于已经排序的元素j，
     * 将[j-1,i-1]的元素移动一位，a[j]= a[i]
     *
     * @param a:
     * @return void
     * @author wangjie
     * @date 2023/3/8 22:12
     * @since 1.0.0
     */
    @Override
    public <E extends Comparable<E>> void sort(E[] a) {
        //默认0为已经排序的，外层循环从1开始，代表未排序的
        for (int i = 1; i < a.length; i++) {
            //倒序遍历已经排序的数组
            E temp = a[i];
            int j = i;
            for (; j > 0; j--) {
                //如果已经排序的数组元素大于未排序元素，则交换
                if ((a[j - 1].compareTo(temp)) > 0) {
                    a[j] = a[j - 1];
                } else {
                    //找到已经排序的数组元素小于等于未排序，则找到了待排序元素位置，停止遍历已经排序的数组
                    break;
                }
                //
            }
            a[j] = temp;
        }
    }
}