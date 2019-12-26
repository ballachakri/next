package com.next.SingleTon;

public class AccessSingleTon {
// object cannot be created directly due to private constructor
// this way it is forced to create object via method where
// the logic for creating object only once written
    public static void main(String[] args) {
        SingletonDemo s=SingletonDemo.createObjectOnce();
        s.m1();
    }
}
