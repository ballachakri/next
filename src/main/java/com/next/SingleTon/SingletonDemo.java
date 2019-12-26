package com.next.SingleTon;

public class SingletonDemo {

    // static class reference as null;
    private static SingletonDemo obj = null;

    // private constructor to restrict instantiation of the class directly
    private SingletonDemo() {
    }

    //
    public static SingletonDemo createObjectOnce() {
        if (obj == null) {
            obj = new SingletonDemo();
        }
        return obj;
    }

    // method of the singleton class
    public void m1() {
        System.out.println("i am method m1 from singleton class");
    }
// code to demonstrate objects can created within the same class
    public static void main(String[] args) {
        SingletonDemo obj1 = new SingletonDemo();
        obj1.m1();
        SingletonDemo obj2 = new SingletonDemo();
        obj2.m1();
      }
}
