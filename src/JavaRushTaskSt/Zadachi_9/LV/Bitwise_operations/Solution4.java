package JavaRushTaskSt.Zadachi_9.LV.Bitwise_operations;
/*
setFlag(int number, int flagPos)
 — устанавливает значение "1" биту под индексом flagPos числа number и возвращает новое значение.
resetFlag(int number, int flagPos)
 — устанавливает значение "0" биту под индексом flagPos числа number и возвращает новое значение.
checkFlag(int number, int flagPos)
 — проверяет значение бита под индексом flagPos числа number и возвращает true, если значение "1" и false, если "0".
 */
public class Solution4 {
    public static int setFlag(int number, int flagPos) {
        //напишите тут ваш код
        return number | (1 << flagPos);
    }

    public static int resetFlag(int number, int flagPos) {
        //напишите тут ваш код
        return number & ~(1 << flagPos);
    }

    public static boolean checkFlag(int number, int flagPos) {
        //напишите тут ваш код
        return (number & (1 << flagPos)) == (1 << flagPos);
    }
}
