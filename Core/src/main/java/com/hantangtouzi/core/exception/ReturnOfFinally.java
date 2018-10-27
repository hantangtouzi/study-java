package com.hantangtouzi.core.exception;

/**
 * @author WilliamChang.
 * @since 2018/7/5 13:02
 */

public class ReturnOfFinally {
    public static void main(String[] args) {
        int retrunValue = test();
        System.out.println("retrunValue = " + retrunValue);
    }

    private static int test() {
        try {
            System.out.println("this is try");
            throw new RuntimeException();
//            return 1;
        } catch (Exception e) {
            System.out.println("this is catch");
        } finally {
            System.out.println("this is finally");
            return 0;
        }
    }
}
