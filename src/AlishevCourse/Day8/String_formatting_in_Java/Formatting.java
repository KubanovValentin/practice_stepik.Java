package AlishevCourse.Day8.String_formatting_in_Java;

public class Formatting {
    public static void main(String[] args) {
        //%-вставляем нужное(s строку, d число, f число вещественное(с запятой))
//        System.out.printf("This is a string, %s","NICE");
//        System.out.printf("This is a string, %d",23);
//        System.out.printf("%f This is %s a string, %d",23.23,"HIPI",23);
        //ширина пробела
//        System.out.printf("String %-10d \n",342);
//        System.out.printf("String %10d\n",3);
//        System.out.printf("String %-10d\n",342000);
//        System.out.printf("String %10d\n",342000000);

        //ограничение после запятой
        System.out.printf("String %.2f\n",34.2364);
        System.out.printf("String %.2f\n",34.2334322);
        System.out.printf("String %.2f\n",34.23);
        System.out.printf("String %.2f\n",34.2384);

        //%[10] ширина пробела [-10] пробел будет справа [.10] ограничение после запятой
    }
}
