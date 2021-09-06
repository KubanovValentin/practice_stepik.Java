package practice_stepik;
import java.util.Locale;
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
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        boolean value = str1.contains(str2);
//        System.out.println(value);
//        sc.close();

//--------------------------------------------
//На вход подаётся строка. Выведите её на печать сначала строчными, а затем прописными буквами.
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        sc.close();
// -------------------------
// На вход подаётся строка, а затем целое число n > 0. Выведите n- й символ с начала строки.
//        Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//        int n = sc.nextInt();
//        char letter = str.charAt(--n);
//        System.out.println(letter);
//       sc.close();
//--------------------------------------------
        //На вход подаются две строки текста.
        // Выведите на печать true, если строки совпадают, и false - если нет.

//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        boolean value = str1.contains(str2);
//        System.out.println(value);
//        sc.close();
//----------------------------------------------------
//На вход подаются две строки.
// Объедините их в предложение, а на следующей строке выведите общее количество знаков в предложении.
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        String str3 = str1 + " " + str2 ;
//        int x = str3.length();
//        System.out.println(str3);
//        System.out.println(x);


//---------------------------------------------
//На вход подаются два числа.
// Выведите сначала их сумму, а на следующей строке переведите числа в строковый формат и сложите в строковом формате.
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int z = x + y;
//        String str1 = Integer.toString(x);
//        String str2 = Integer.toString(y);
//        System.out.println(z);
//        System.out.println(str1 + str2);

//        _____________________________________
//На вход подаются два слова на одной строке, разделённые пробелом.
// Выведите true, если они идут по алфавиту, и false, если нет.
// Гарантируется, что слова начинаются с разных букв.

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(str1.charAt(0) < str2.charAt(0));

    }

}
