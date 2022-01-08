package JavaRushTaskSt.Zadachi_9.LV.Random_numbers;

public class Random_rounding_method {
    public static int getRandomDiceNumber()
    {
        return (int) (Math.random() * 10);//0,1,2,3,4........8,9
        //Если требуются именно числа из набора 1,2,3,4...8,9,10 нужно просто ко всем случайным числам добавлять единицу:
        //return (int) (Math.random() * 10)+1;
    }

    public static void main(String[] args)
    {
        for (int i = 0; i < 10; i++) {
            int x = getRandomDiceNumber();
            System.out.println(x);
        }
    }
}
