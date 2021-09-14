package practice_stepik;
import java.util.Locale;
import java.util.Scanner;
public class test_condition_constructions {
    public static void main(String[] args){


//------------------------------------------
//        Задана логическая переменная z:
//        При каких значениях переменных a, b и c значение переменной z точно будет равно false?
//        int a = 12;
//        int b;
//        int c= 12;
//        boolean z = a == 12 || b != 5 && c <= 10;

//        a != 12, b = любое натуральное число, c = 12
//        _________________________________________
//        На вход подаётся  целое число.
//        Выведите "YES", если введено трёхзначное положительное число, а в противном случае - "NO".
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            if (a>99 && a<1000) {
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        ----------------------------------------------------
//        На вход подается строка, а затем слово.
//        Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.
//        abracadabra
//        Cadabra
        
//            Scanner sc = new Scanner(System.in);
//            String str1 = sc.nextLine();
//            String str2 = sc.nextLine();
//            boolean rez = str1.toUpperCase().contains(str2.toUpperCase());
//            System.out.println(rez);

//_____________________________________________________________________
// На вход подаётся целое трёхзначное число, а затем цифра.
// Выведите true, если эта цифра является средней в числе (разряд десятков), и false - если нет.
// Если введённое число не является трёхзначным, выведите "error".
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a > 99 && a < 1000){
//            if(((a%=100)/10) == b) {
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }
//        }else {
//            System.out.println("error");
//        }


//  ------другое решение через строки

//        boolean rez = a > 99 && a < 1000;
//        if (rez==true){
//            String str1 = Integer.toString(a);
//            String str2 = Integer.toString(b);
//            char letter_2 = str1.charAt(1);
//            char letter_0 = str2.charAt(0);
//
//            if(str1.charAt(1)==str2.charAt(0)){
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }
//
//
//
//        }else {
//            System.out.println("error");
//        }
//-------другое решение
//        Scanner cs = new Scanner(System.in);
//        int a = cs.nextInt();
//        int b = cs.nextInt();
//        if (a<0) {
//            a*=-1;
//        }
//        if (b<0) {
//            b*=-1;
//        }
//        String x = Integer.toString(a);
//        String y = Integer.toString(b);
//        char a1 = x.charAt(1);
//        char a2 = y.charAt(0);
//        int f =a1;
//        int g =a2;
//
//        if (a<100 || a>999) {System.out.println("error");
//        }else if (f==g) {System.out.println("true");
//        }else {System.out.println("false");
//        }
//-------------------------------------------------------------------------------
// На вход подаётся два числа - a и b.
// Выведите знак отношения между числами: один символ "<", если a < b, ">", если a > b и "=", если a=b.
//        Scanner cs = new Scanner(System.in);
//        double a = cs.nextDouble();
//        double b = cs.nextDouble();
//        if(a>b){
//            System.out.println(">");
//        }else if(a<b){
//            System.out.println("<");
//        }else if(a==b){
//            System.out.println("=");
//        }
// --------------------------------------------------------------------------------------
    }
}
