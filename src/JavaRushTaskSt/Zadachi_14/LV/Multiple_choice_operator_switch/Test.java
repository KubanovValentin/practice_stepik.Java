package JavaRushTaskSt.Zadachi_14.LV.Multiple_choice_operator_switch;

public class Test {

    public static void main(String[] args) {
        int temperature = 40;
        switch(temperature)
        {
            case 36:
                System.out.println("Низкая");
                break;
            case 37:
                System.out.println("Нормальная");
                break;
            case 38:
                System.out.println("Высокая");
            default:
                System.out.println("Нужна скорая");
        }
    }
}
