package practice_stepik;
import java.util.Scanner;
public class MyString {
    public static void main(String[] args) {
//        String myVar = "Hello, World!";
//        System.out.print(myVar);

//        --------------------------------
// На вход подаётся строка. Выведите её длину.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int x = str.length();
//        System.out.println(x);
//        sc.close();
//----------------------------------------------
//На вход подаётся строка текста. Выведите её первый и последний элемент в одну строку через пробел.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        char letter_first = str.charAt(0);
//        char letter_last = str.charAt(str.length() - 1);
//        System.out.println(letter_first + " " + letter_last);
//        sc.close();

//---------------------------------------------------------------------------
//       На вход подаётся строка текста, затем слово.
// Выведите на печать true, если слово содержится в строке, и false - если не содержится.
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean value = str1.contains(str2);
        System.out.println(value);
        sc.close();
    }

}
