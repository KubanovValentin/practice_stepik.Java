package Homework.homework.lesson10.p4;

import Homework.homework.lesson10.p1.A;
import static Homework.homework.lesson10.p1.A.*;

import Homework.homework.lesson10.p1.p2.B;
import static Homework.homework.lesson10.p1.p2.B.b1;

import Homework.homework.lesson10.p1.p2.p3.C;
import static Homework.homework.lesson10.p1.p2.p3.C.*;

public class D {
    void sum(){
    int sum=a1+b1+c1;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.a);
        System.out.println(a1);
        a.infoA();

        B b=new B();
        System.out.println(b.b);
        System.out.println(b1);

        C c=new C();
        System.out.println(c.c);
        System.out.println(c1);

        D d=new D();
        d.sum();

        }
    }


