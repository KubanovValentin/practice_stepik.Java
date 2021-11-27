package AlishevCourse.Day4.Random_number_generation_Random_class;
//сдесь использовали методы рандомных чисел
public class Test {
    public static void main(String[] args) {
        //1 используем метод генерации чисел
        // сгенерируем 100 случайных чисел с помощью цикла
        for (int i=0;i<100;i++){
            //будем выводить с помощью ниже
//            System.out.println(Math.random());//метод Math.random выводит число в диапазоне от 0 до 1
            //чтоб вывести именно число от 1 до 100 мы используем умножение и
            // метод округления в большую сторону
//            System.out.println(Math.ceil(Math.random()*100));

//           но лучше использовать метод round
            System.out.print(Math.round(Math.random()*100)+" ");
        }
    }
}
