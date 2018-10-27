package com.hantangtouzi.core.exception;

/**
 * @author WilliamChang.
 * @since 2018/7/5 12:53
 */

public class OrderOfTryCatchFinally {
    public static void main(String[] args) {
        try {
            System.out.println("this is try");
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("this is catch");
        } finally {
            System.out.println("this is finally");
        }
    }
}
