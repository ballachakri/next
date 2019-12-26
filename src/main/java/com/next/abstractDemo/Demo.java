package com.next.abstractDemo;

public class Demo {

int x;
        public enum Student{
            ID,
            NAME,
            CLASS;
        }
        public void setStudentInfo(int i)    {
            this.x=i;
        }

        public int getStudentInfo() {
            return x;
        }

  public Demo m1()
  {
      System.out.println("hello m1");
      return this;
  }
  public Demo  m2()
  {
      System.out.println("hello m2 ");
   return this;
  }

    public static void main(String[] args) {
            Demo d=new Demo();
            d.setStudentInfo(14);
            int y=d.getStudentInfo();
            System.out.println(y);

        System.out.println("hashcode of d : "+d.hashCode());
        System.out.println("hashcode of d.m1 :  "+d.m1().hashCode());
        System.out.println("hashcode of d.m2 :  "+d.m2().hashCode());

        Demo ddd=new Demo().m1();
        System.out.println("hashcode of ddd :    "+ ddd.hashCode());

        System.out.println("hashcode of d.m1 :  "+ddd.m1().hashCode());
        System.out.println("hashcode of d.m2 :  "+ddd.m2().hashCode());
        System.out.println(!d.equals(ddd));

    }
    }

