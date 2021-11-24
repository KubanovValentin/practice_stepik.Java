package AlishevCourse.Day1.The_for_loop;

public class ForLoop {
    public static void main(String[] args) {
        //начинаеться с оператора for, дальше в скобках блок условий,тело цикла в фигурных скобках
        //1.блоке декларируеться и инициализируеться счетчик
        // 2.блок условий-до каких пор будет выполняться цикл
        // 3. блок изменения переменной i

        for (int i=0; i<=10; i=i+5){
            System.out.println("Hello!!! " + i); //i++ == i=i+1 (true)
        }
        for (int i=10; i>=0; i=i-5){
            System.out.println("Hello!!! " + i);
        }
    }
}
