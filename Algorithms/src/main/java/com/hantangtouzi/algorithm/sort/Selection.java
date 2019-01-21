package com.hantangtouzi.algorithm.sort;

/**
 * @author WilliamChang.
 * Created on 2019-01-22 01-17
 */

public class Selection {
    private static final int[] samples = {9, 6, 5, 8};

    public static void main(String[] args) {
        show(samples);
        Selection.sort(samples);
        show(samples);
    }

    private static void show(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * 找出最小的元素对应的下标.
     */
    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            exchange(a, i, min);
        }
    }

    private static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
