package practice_stepik;
import java.util.Arrays;
import java.util.Scanner;
public class MethodsArray {
    public static void main(String[] args){
        //-------------------------------------------------------------------------
// На вход подаётся натуральное число n, затем несколько целых чисел, разделённых пробелом,
// а на следующей строке - натуральное число k.
//Выведите k-е по счёту число по возрастанию. Если такого числа нет, выведите "Ошибка ввода".

        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        int array[] = new int[n];
       for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();

      }
       for (int i = 0; i < n; i++) {
           Arrays.sort(array);
      }
       int z = sc.nextInt();
       System.out.print(array[z]);

    }
}
