package JavaRushTaskSt.Zadachi_14.LV.Multiple_choice_operator_switch;
//Сравнение switch vs if-else
public class Test1 {
    public static void main(String[] args) {
        int temperature = 40;

        if (temperature == 36)
        {
            System.out.println("Низкая");
        }
        else if (temperature == 37)
        {
            System.out.println("Нормальная");
        }
        else if (temperature == 38)
        {
            System.out.println("Высокая");
        }
        else
        {
            System.out.println("Нужна скорая");
        }
    }
}
