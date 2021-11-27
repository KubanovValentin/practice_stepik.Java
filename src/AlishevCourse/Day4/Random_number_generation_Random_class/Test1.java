package AlishevCourse.Day4.Random_number_generation_Random_class;

import java.util.Random;

//2 сдесь  помощью класса
public class Test1 {
    public static void main(String[] args) {
//        создадим объект класса рандом
        Random rand=new Random();

        for (int i=0;i<100;i++){
            System.out.println(rand.nextInt(6)+1);//<--мы захотели бросить кубик от 1 до 6 = 100 раз
        }
    }
}
