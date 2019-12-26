package com.next.abstractDemo;

public class B extends A {

    public B() {
        System.out.println("i am B class constructor");
    }

    public static void main(String[] args) {

        A a = new B();
        System.out.println(a.hashCode());
        a.add();
        a.sub();
        a.div();

        B b = new B();
        System.out.println(b.hashCode());
        b.add();
        b.sub();

    }

    public void add() {
        System.out.println("i am add from B class");
    }

    public void sub() {
        System.out.println("i am sub from B class");
    }
    public void div()
    {
        System.out.println("i am div from B class");

    }
    public void mul()
    {
        System.out.println("i am mul from B class");
    }

}
