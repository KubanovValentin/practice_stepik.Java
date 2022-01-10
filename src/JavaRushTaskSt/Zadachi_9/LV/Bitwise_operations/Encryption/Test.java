package JavaRushTaskSt.Zadachi_9.LV.Bitwise_operations.Encryption;
//Шифрование
import java.util.Arrays;
/*
Побитовая операция XOR часто применяется программистами для самого простого шифрования.
В общем виде операция шифрования выглядит так:

результат = число ^ пароль;

Где число — это данные, которые мы хотим зашифровать,
пароль — специальное число, используемое в качестве «пароля» к данным, а результат — зашифрованное число.

число == (число ^ пароль) ^ пароль;

Все дело в том, что оператор XOR, дважды примененный к числу, дает исходное число, независимо от пароля.

Чтобы получить искомое число из зашифрованного, нужно просто выполнить операцию повторно:

оригинальное число = результат ^ пароль;
 */
public class Test {
    public static int[] cript(int[] data, int password)
    {
        int[] result = new int[data.length];
        for (int i = 0; i <  data.length; i++)
            result[i] = data[i] ^ password;
        return result;
    }

    public static void main(String[] args)
    {
        int[] data =  {1, 3, 5, 7, 9, 11};
        int password = 199;

        // зашифровываем массив данных
        int[] encrypted = cript(data, password) ;
        System.out.println(Arrays.toString(encrypted));

        // расшифровываем массив данных
        int[] decrypted = cript(encrypted, password) ;
        System.out.println(Arrays.toString(decrypted));
    }
}
