package Zaur_OOP.podpaket_lesson14.Cicle_for;

public class Test5 {
    public void time() {

        OUTER: for (int chas = 0; chas <= 23; chas++) {
            System.out.println("начало outer loop");
            INNER: for (int minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + ":" + minuta);
                //если мы хотим выйти из внутреннего loop в 30 минутах то делаем так
                if (minuta == 30) {
                   System.out.println("выход из внутреннего loop в 30 минутах");
    //                break OUTER; прекращает OUTER loop (результат = 0:30)
                    break INNER;//прекращает INNER loop
                }
            }
            System.out.println("конец outer loop");
        }
    }

    public static void main(String[] args) {
        Test5 t=new Test5();
        t.time();
    }
}
