package com.daniu101.chapter10.hw2;

public class AppleTest {
    public static void main(String[] args) {
        Apple ap = new Apple();

        ap.setSize(20);
        ap.setStatus(false);

        System.out.println(ap.toString());
//        System.out.println("尺寸："+ ap.getSize());
//        System.out.println("状态："+ ap.getStatus());

        ap.call();
        ap.internal();
    }
}
