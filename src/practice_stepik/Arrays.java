package practice_stepik;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Arrays {
    public static void main(String[] args) {
//        int [] arr = new int[5];
//        arr[2] = 42;
//        arr [1]= 1234;
//        System.out.println(arr[2]);
//        System.out.println(arr[1]);
//        --------------------------------
//        String[] names= {"A", "B", "C", "D"};
//        System.out.println(names[1]);
//        ----------------------------------
//        Создадим массив натуральных чисел от 10 до 20:
//            int[] numbers = new int[11];
//
//            for (int i = 10; i <= 20; i++) {
//                numbers[i - 10] = i;
//            }System.out.println(numbers[7]);
//            ---------------------------------
//            умножим все элементы массива numbers на 2:
//            int[] numbers = new int[11];
//            for (int i = 0; i < numbers.length; i++) {
//                numbers[i] = numbers[i] * 2;
//            }
//             ------------------------------
//                int[] numbers = new int[11];
//                for (int i = 10; i <= 20; i++) {
//                        numbers[i - 10] = i;
//                    }
//                for (int i = 0; i < numbers.length; i++) {
//                        numbers[i] = numbers[i] * 2;
//                    }
//                for (int i = 0; i < numbers.length; i++) {
//                    System.out.print(numbers[i] + " ");
//                }

        // 20 22 24 26 28 30 32 34 36 38 40
//--------------------------------------------------------------------------------
//        На вход подаётся натуральное число n.
//        Создайте массив натуральных чисел от единицы до n включительно и выведите его на печать
//        (в одной строке, через пробел).
//        ----------------------1 решение правильное
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] numbers = new int[n];
//                for (int i = 1; i <= n; i++) {
//                        numbers[i - 1] = i;
//                }
//                for (int i = 0; i < n; i++) {
//                    System.out.print(numbers[i] + " ");
//                }
//        --------------------2 правильное решение
//                Scanner sc = new Scanner(System.in);
//                int n = sc.nextInt();
//                int[] numbers = new int[n];
//                for (int i = 1; i <= n; i++) {
//                    System.out.print(i + " ");
//                }
//-----------------------------------
// Вычислим, сколько всего было продано единиц товара за всю неделю.
//        int[] myArr = {6, 42, 3, 7, 16, 10, 22};
//        int summ = 0;
//        for(int x = 0; x < myArr.length; x++) {
//            summ += myArr[x];
//        }
//        System.out.println(summ);
//-----------------------------------------------
// Если необходимо обойти весь массив (все элементы),
// удобно использовать сокращённый цикл, вот его запись:
//        String[] beatles = {"John", "Paul", "Ringo", "George"};
//
//        for (String person: beatles) {
//            System.out.println(person);
//        }
//  --------------------------------------------------------------
//  На вход подаётся натуральное число n > 0 (длина массива),
//  а на следующей строке - последовательность целых чисел.
//  Создайте из неё массив и выведите на печать значение последнего элемента массива.
//        Scanner sc = new Scanner(System.in); // Объявляем Scanner
//        int n = sc.nextInt(); // с ввода размер массива и записываем в n
//        int array[] = new int[n]; // Создаём массив int размером в n
//        /*Пройдёмся по всему массиву, заполняя его*/
//        for (int i = 0; i < n; i++) {
//            array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными
//        }
//        for (int i = 0; i < n; i++) {
////            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
//        }
//        int lastNum=array[array.length-1];
//        System.out.print(lastNum);

//---------------------------------------------------------------------
// На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел,
// а затем - индекс id < n.
// Создайте из неё массив и выведите на печать значение элемента массива c индексом id.
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int array[] = new int[n];
//        for (int i = 0; i < n; i++){
//            array[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//        }
//        int z = sc.nextInt();
//        System.out.print(array[z]);
//------------------------------------------------------------------------
// На вход подаётся целое число n > 1.
// Сформируйте массив чётных чисел от 2 до n (включительно).
//Выведите на печать массив в одной строке, через пробел.
//Посчитайте и выведите на печать сумму элементов массива.

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] numbers = new int[n];
//        int sum=0;
//                for (int i = 1; i <= n; i++) {
//                       numbers[i-1] = i;
//               }
//                for (int i = 1; i < n; i++) {
//                   if(i%2!=0){
//                       sum+=numbers[i];
//                       System.out.print(" " + numbers[i]);
//                   }
//               }System.out.println();
//            System.out.println(sum);

//-------------------------------------------------------------------
// На вход подаётся целое число n - длина последовательности, а затем сама последовательность целых чисел.
// Выведите на печать все числа, большие предыдущего числа.
//        Scanner sc = new Scanner(System.in); // Объявляем Scanner
//       int n = sc.nextInt(); // с ввода размер массива и записываем в n
//        int array[] = new int[n]; // Создаём массив int размером в n
////        /*Пройдёмся по всему массиву, заполняя его*/
//       for (int i = 0; i < n; i++) {
//           array[i] = sc.nextInt(); // Заполняем массив элементами, введёнными
//       }
//       for (int i = 0; i < n; i++) {
//           if (i > 0 && array[i] > array[i - 1]){
//               System.out.print (" " + array[i]); // Выводим на экран, полученный массив
//           }

//       }
//        int lastNum=array[array.length-1];
//        System.out.print(lastNum);

// -------------------------------------------------------------------------
// Метод split() разрезает строку по элементу, указанному в скобках.
//        String str = "I'll be back";
//        String[] words = str.split(" ");
//        for (String word: words) {
//            System.out.println(word);
//        }
//-----------------------
//        String dataLine = "158;190;178;186;174";
//        String[] dataHeight = dataLine.split(";");
//
//        for (String el: dataHeight) {
//            System.out.println(el);
//        }
// ---------------------------------------------------------------------------
// На вход подаётся строка из элементов, разделённых запятой.
// Создайте из неё массив и выведите элементы массива каждый в отдельной строке.
//        String dataLine = "1,2,3,4,5";
//        String[] dataHeight = dataLine.split(",");
//
//       for (String el: dataHeight) {
//           System.out.println(el);
//       }
//--------------------------------------------------
// создаем массив с месяцами и днями
//        int []daysInMonth = new int[12];
//        daysInMonth[0]=31;
//        daysInMonth[1]=28;
//        daysInMonth[2]=31;
//        daysInMonth[3]=30;
//        daysInMonth[4]=31;
//        daysInMonth[5]=30;
//        daysInMonth[6]=31;
//        daysInMonth[7]=31;
//        daysInMonth[8]=30;
//        daysInMonth[9]=31;
//        daysInMonth[10]=30;
//        daysInMonth[11]=31;
////        int march = daysInMonth[2];
////        System.out.println(march);
//        for (int i=0;i< daysInMonth.length;i++){
//            System.out.println(daysInMonth[i]);
//        }
//----------------------------------------------
//        int[] nums = new int[100];
//        for (int i=0;i<nums.length;i++){
//            nums[i]=i*10;
//        }
//        for (int i= 0;i< nums.length;i++){
//            System.out.println(nums[i]);
//        }
//        for (int i : nums){
//            System.out.println(i);
//        }
//        char[] chars = new char[10];
//        for (char ch:chars){
//            System.out.println(ch);
//        }
//------------------------------------------------------------
// создать 1 массив чисел и проинициализировать его значениями от 100 до 1000

// создать 2 массив по длине равный 1 (использовать свойство лейт).проинициализировать его значениями взятыми
// из 1 массива но в обратном порядке
//
// в цикле фор итч вывести все элементы 2 массива
//----------------------------- 1решение
//        int count=0;
//        for(int i = 100; i <=1000;i++){
//            count++;
//        }
//        int[]num1=new int[count];
//        for (int x = 0;x<num1.length;x++){
//            num1[x]=x+100;
//        }
//        for (int x = 0;x<num1.length;x++){
////            System.out.println(num1[x]);
//        }
//        int[] num2=new int[num1.length];
//        for (int y=num1.length-1;y>=0;y--){
//            num2[y]=y+100;
//            System.out.println(num2[y]);
//        }

//        for (int y : num2){
//            System.out.println(y);
//       }

//  --------------------------------2решение
//        int[] first = new int[900];
//        for (int i=0;i<first.length;i++){
//            first[i]=i+100;
////            System.out.println(first[i]);
//        }
//        int[]second = new int[first.length];
//        for (int i=0,  j = first.length-1;i< first.length;i++, j--){
//            second[j] = first[i];
//        }
//        for (int i:second){
//            System.out.println(i);
//        }
//---------------------
//        String s1 = 'A' + '1' + "2";
//        System.out.println("что вышло ^: " + s1);
//        String  s2 = "A" + 12;
//        System.out.println("что вышло ^: " + s2);
//        String  s3 = "A" + ('\t' + '\u0003');
//        System.out.println("что вышло ^: " + s3);
//        String  s4 = 'A' + "12";
//        System.out.println("что вышло ^: " + s4);





    }

}