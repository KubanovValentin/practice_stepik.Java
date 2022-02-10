package Zaur_OOP.podpsket_lesson14.Cicle_for;

public class Test4 {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if (i==3){
                System.out.println("перескакиваем");
                continue;
            } else if (i==7){
                System.out.println("перескакиваем");
                continue;
            } else if (i==9){
                System.out.println("мы покидаем цикл на 9");
                break;
            }
            System.out.println(i);
        }
    }
}
