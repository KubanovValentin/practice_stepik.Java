package practice_stepik;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class MethodsArray {
    public static void main(String[] args) {


        //-------------------------------------------------------------------------
// На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом,
// а на следующей строке - натуральное число k.
//Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".
//      Scanner sc = new Scanner(System.in);
//       int n = sc.nextInt();
//       int array[] = new int[n];
//       int i;
//       for ( i = 0; i < n; i++){
//            array[i] = sc.nextInt();
//      }
//       Arrays.sort(array);
//       int z = sc.nextInt();
//        if(z > n || z < 0) {
//            System.out.println("Ошибка ввода");
//        }
//        else {
//            System.out.println(array[z-1]);
//        }
//----------------------------------------------------------------------------
// На вход подаётся последовательность целых чисел.
// Создайте из этой последовательности массив чисел, отсортированный по возрастанию, и выведите на печать.
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String [] arr=line.split(" ");
//        int n = arr.length;
//        int [] arr1=new int [n];
//        for (int i=0; i<arr.length; i++){
////            arr[i]=sc.next();
//            arr1[i]=Integer.parseInt(arr[i]);
//            int number=Integer.valueOf(arr[i]);
//            arr1[i]=number;
//        }
//        Arrays.sort(arr1);
//        System.out.print(Arrays.toString(arr1));
//------------------------------------------------------------не решенная
// На ввод подаётся последовательность целых чисел.
// Поменяйте местами соседние элементы последовательности (второй с третьим, четвёртый с пятым и т.д.),
// кроме первого и последнего. Если находится "одинокий" элемент, который не с чем поменять -
// необходимо оставить его на месте.

//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String [] arr=line.split(" ");
//        int n = arr.length;
//        int [] arr1=new int [n];
//        for (int i=1; i <=n; i++) {
//            if (i == 1) {
//                System.out.print(i + " ");
//            } else if (n == 2) {
//                System.out.print(n);
//                break;
//            } else if (i == n) {
//                System.out.print(n + " ");
//                break;
//            }else if (i==n-1){
//                System.out.print(n-1+" ");
//            }
//            while (i % 2 == 0 && i!=n-1) {
//                if (n == 3) {
//                    System.out.print(i + " " + n);
//                    break;
//                }
//                System.out.print(i + 1 + " ");
//                System.out.print(i + " ");
//                i++;
//
//            }
//        }
//

//        ---------------------------------------
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        for (String el : arr) {
//            System.out.print(el);

        }
        int[] numArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numArr[i] = Integer.parseInt(arr[i]);
//            System.out.print(numArr[i]);
        }

        for(int j=0; j < numArr.length; j++){
            if (j==0){
                System.out.print(numArr[j]+ " ");
            } else if (numArr.length<=3){
                System.out.print(numArr[j]+ " ");
            } else if (j == numArr.length-1){
                System.out.print(numArr[j]+" ");
            }else if (j%2==0){
                System.out.print(numArr[j] + " ");
                System.out.print(numArr[j-1] +" ");
            }else if (j == numArr.length-2){
                System.out.print(numArr[j] + " ");
            }
        }



//       System.out.print(arr[0]+arr[i+=2]+arr[i+=1]+arr[arr.length-1]);
//        System.out.print("\n"+ arr[0]);//первый элемент массива
//        System.out.print("\n"+ arr[arr.length-1]);//последний элемент массива
//        System.out.print(arr[0]+ " " + arr[arr.length-1]);
//        System.out.println("\n"+ arr.length);//длина массива
//
//


//      int numArr[] = new int[arr.length];
//      for (int i = 0 ; i < arr.length-1;i++) {
//            numArr[i] = Integer.parseInt(arr[i]);
//          System.out.print(arr[0]+arr[i+=2]+arr[i+=1]+arr[arr.length-1]);

//            System.out.print(arr[i+=2]);
//
//            System.out.print(numArr[i]);
//             System.out.print(numArr[i] + " ");
//      }
//        for(int i=0;i<numArr.length;i++) {
//            for (int j = i + 1; j < numArr.length; j++) {
//                if (numArr[i] > numArr[j]) {
//                    int temp = numArr[i];
//                    numArr[i] = numArr[j];
//                    numArr[j] = temp;
//
//                }
//            }
//        }
//-----------------------------------------------------------------------
// На вход подаётся строка текста.
// Определите, в каком по счёту слове этого предложения меньше всего букв, и выведите на печать.
// Если таких слов несколько, выведите номер первого по порядку.

//   -------------------------------- эта задача выводит количество букв, а надо счет
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String [] arr = line.split(" ");
//        for (String el :arr ) {
//
//        }
//
//        int i;
//        int small;
//        for ( i = 0; i < arr.length; i++) {
//            for(int j=i+1;j<arr.length;j++) {
//                if(arr[i].length() > arr[j].length()) {
//                    small = arr[0].length();
//                    small = arr[i].length();
//                    arr[i] = arr[j];
//                    small=arr[j].length();
//                    System.out.print(small);
//                }

//            }
//        }


//---------------------------------------выявление индексов массива
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String [] arr = line.split(" ");
//        for (String el :arr ) {
//        }
//        int indexOfMax = 0;
//        int indexOfMin = 0;
//        for (int i = 1; i < arr.length; i++)
//        {
//            if (arr[i].length() > arr[indexOfMax].length()) {
//                indexOfMax = i;
//            }
//            else if (arr[i].length() < arr[indexOfMin].length())
//            {
//                indexOfMin = i;
//            }
//        }
//        System.out.println(indexOfMin);
//------------------------------------------правильное решение(счетчик count)
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String [] arr = line.split(" ");
//        for (String el :arr ) {
//        }
//        int i;
//        int small;
//        int count=1;
//        for ( i = 0; i < arr.length; i++ ) {
//            for(int j=i+1;j<arr.length;j++) {
//               if(arr[i].length() > arr[j].length()) {
//                  small = arr[0].length();
//                   small = arr[i].length();
//                   arr[i] = arr[j];
//                   small=arr[j].length();
////                  System.out.print(small);
//                   count++;
//              }
//
//           }
//       }System.out.print(count);

        }
    }
//================================================================================
//---------------------------------Задачи на массивы
//==================================================================================
//пусть задан массив строк, и давайте напечатаем все, которые начинаются на букву f:

//        String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
//        for (int i=0; i < numbers.length; i++) {
//            if (numbers[i].charAt(0) == 'f') {
//                System.out.println(numbers[i]);
//            }
//        }
//-------------------------------------
//        String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
//        for (String s: numbers) {
//            if (s.charAt(0) == 'f') {
//                System.out.println(s);
//            }
//        }
//--------------------------------------
//        String[] numbers = {"one", "two", "three", "four", "five", "forty two"};
//        for (int i=0; i < numbers.length; i++) {
//            if (numbers[i].charAt(0) == 'f') {
//                numbers[i] = "deleted";
//            }
//        }
//        System.out.println(numbers[3]);    // deleted
//        String[] numbers1 = {"one", "two", "three", "four", "five", "forty two"};
//        for (String s: numbers1) {
//            if (s.charAt(0) == 'f') {
//                s = "deleted";
//            }
//        }
//        System.out.println(numbers1[3]);    // four
//        ----------------------------------------------------
//        boolean ffff = booleanExpression(false, false, false, false);
//        boolean ffft = booleanExpression(false, false, false, true);
//        boolean fftf = booleanExpression(false, false, true, false);
//        boolean fftt  = booleanExpression(false, false, true, true); //Searching for this
//
//        boolean ftff = booleanExpression(false, true, false, false);
//        boolean ftft = booleanExpression(false, true, false, true); //Searching for this
//        boolean fttf = booleanExpression(false, true, true, false); //Searching for this
//        boolean fttt = booleanExpression(false, true, true, true);
//
//        boolean tfff = booleanExpression(true, false, false, false);
//        boolean tfft = booleanExpression(true, false, false, true); //Searching for this
//        boolean tftf = booleanExpression(true, false, true, false); //Searching for this
//        boolean tftt = booleanExpression(true, false, true, true);
//
//        boolean ttff = booleanExpression(true, true, false, false); //Searching for this
//        boolean ttft = booleanExpression(true, true, false, true);
//        boolean tttf = booleanExpression(true, true, true, false);
//        boolean tttt = booleanExpression(true, true, true, true);
//
//        System.out.println("ffff " + ffff);
//        System.out.println("ffft " + ffft);
//        System.out.println("fftf " + fftf);
//        System.out.println("fftt " + fftt + " <- ");
//
//        System.out.println("ftff " + ftff);
//        System.out.println("ftft " + ftft + " <- ");
//        System.out.println("fttf " + fttf + " <- ");
//        System.out.println("fttt " + fttt);
//
//        System.out.println("tfff " + tfff);
//        System.out.println("tfft " + tfft + " <- ");
//        System.out.println("tftf " + tftf + " <- ");
//        System.out.println("tftt " + tftt);
//
//        System.out.println("ttff " + ttff + " <- ");
//        System.out.println("ttft " + ttft);
//        System.out.println("tttf " + tttf);
//        System.out.println("tttt " + tttt);
//
//
//        boolean allCorrectAreTrue = fftt & ftft & fttf & tfft & tftf & ttff;
//
//        boolean allIncorrectAreTrue = ffff | ffft | fftf | ftff | fttt |  tfff | tftt | ttft | tttf | tttt;
//
//        boolean correctAnswerCondition = allCorrectAreTrue & !allIncorrectAreTrue;
//
//        if (correctAnswerCondition) {
//            System.out.println(" You have found the correct answer!!! :) ");
//        } else {
//            System.out.println(" Correct answer still to be found... :( ");
//        }
//
//
//    }
//
//    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
//        /*
//        Ваш код решения заключается в изменении того, что будете возвращать! Изменяйте возвращаемое значение
//        до тех пор, пока метод выше не поздравит Вас с корректно найденным сочетанием.
//        ВАЖНО!!!
//        В моём примере после return - НЕПРАВИЛЬНЫЙ вариант! Ищите свой, правильный :)
//        */
//        return (a & b) ^ (b & c) ^ (c & d) ^ (a & c) ^ (a & d) ^ (b & d);
//    }
//}
