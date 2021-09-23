package practice_stepik;
import java.util.Scanner;
import java.math.*;
public class Basic_math_Math_Class {
    public static void main(String[] args) {

//---------------------------------------------
// На вход подаются два числа, x и y. Выведите на печать x (в степени y)
//
//        Scanner sc = new Scanner(System.in);
//        int x =  sc.nextInt();
//        int y =  sc.nextInt();
//        double z;
//        z = Math.pow(x, y);
//        System.out.println(z);

//-----------------------------------------------
// Решите задачу, которой учителя мучают многие поколения школьников.
// Что больше, E(в степени pi)или PI(в степени e)
//        double a = Math.pow(Math.E, Math.PI);
//        double b = Math.pow(Math.PI, Math.E);
//        if(a>b){
//            System.out.println("E > PI");
//        }else if (a==b) {
//            System.out.println("E = PI");
//        }else {
//            System.out.println("E < PI");
//        }
//-----------------------------------------------------
// Дан угол (alphaα) градусов. Выведите значение угла в радианах.
//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double y = Math.toRadians(x);
//        System.out.println(y);
//-------------------------------------------------------
// Дан угол (alphaα) градусов. Выведите  y = sin(alpha ) + cos(alpha )\\y=sin(α)+cos(α)..\\
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double r = Math.toRadians(a);
//        double sin = Math.sin(r);
//        double cos = Math.cos(r);
//        double y = sin + cos;
//        System.out.println(y);
//-------------------------------------------------------------
// Дано число 0 <= n <= 10. Выведите число pi(π) с точностью n знаков после запятой.
// Воспользуйтесь константой PI из класса Math.
//        Scanner sc=new Scanner (System.in);
//        int x = sc.nextInt();
//
//       System.out.print(String.format("%."+x+"f",Math.PI));

//--------------------------------------------------------------------------
// Выведите (корень n из x в степени y).Выведите ответ с точностью 5 знаков после запятой.
// Гарантируется, что выражение имеет действительное значение. Результат выведите в виде числа типа double.
//Примечание. Если в ответе получается число с количеством знаков после запятой меньше,
// чем 5, выводить дополнительные нули не нужно!

//----------------1 решение(не прошло скорее всего т.к нет избавления от отрицательного значения)
//        Scanner sc=new Scanner (System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int n = sc.nextInt();
//        double xn = Math.pow(x, y);
//        if (n==2){
//            double nSt1=Math.sqrt(xn);
//            String nSt1Format = String.format("%.5f", nSt1);
//            System.out.print(nSt1Format);
//        }else if (n==3) {
//            double nSt2=Math.cbrt(xn);
////            String nSt2Format = String.format("%.6f", nSt2);
//            System.out.print(Math.floor(nSt2));
//        }else {
//            System.out.print("error.возводим только во 2 или 3 степени");
//        }
//---------------2 решение
//        Scanner sc=new Scanner (System.in);
//        double x = sc.nextInt();
//        double y = sc.nextInt();
//        double n = sc.nextInt();
//        int zn = 5;
//        double scale = Math.pow(10, zn);
//        double z = Math.pow(x, (y / n));
//        double a = Math.abs(z);
//        System.out.println(Math.round(a * scale) / scale);

//---------------------------------------------
// На вход подаются длины двух катетов прямоугольного треугольника a и b.
// Посчитайте и выведите на печать периметр этого треугольника.
// Значение периметра необходимо округлить до целого (в математическом смысле, не типа int).
        Scanner sc=new Scanner (System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = Math.pow(a, 2) + Math.pow(b, 2);
        double c = Math.sqrt(sum);
        double p = a + b + c;
        System.out.println((double) Math.round(p));
//        System.out.println(p);
//        System.out.println(Math.round(p));
    }
}
