package com.next.SingleTon;

public class AccessSingleTon1 {
    public static void main(String[] args) {
        SingletonDemo e=SingletonDemo.createObjectOnce();
        e.m1();
     }
}
