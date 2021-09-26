package practice_stepik;
import java.util.Scanner;
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





        }

    }