package Zaur_OOP.podpaket_lesson30.Test2;
/*
1.static переменные и инициализаторы
2.non-static
3.конструктор
 */
public class Test2 {
}

class A {
    public A() {//конструктор
        str1 = abc("String1");//3
    }

    static String str1 = abc("String2");//1
    String str3 = abc("String3");//2

    {
        str1 = abc("String4");//2
    }

    static {//1
        str1 = abc("String5");
    }

    static String str2 = abc("String6");//1
    String str4 = abc("String7");//2

    public static void main(String[] args) {//создаем обьект,перед тем как сработает конструктор выполниться 2
        A a = new A();
    }

    static String abc(String str) {//статический метод
        System.out.println(str);
        return str;
    }
}