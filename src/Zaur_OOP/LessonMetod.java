package Zaur_OOP;

public class LessonMetod {
    //шаблон метода(описали логику),это создание метода(method creation)
    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    //что бы это сработало надо запустить метод main


    //это пример - метод в методе правило LiFo
    int sredneeArifm(int a1, int b1, int c1){
        int result2=summa(a1,b1,c1);
        return result2;
    }
}

class LessonMetodYest {
    public static void main(String[] args) {
        //т.к метод sum принадлежит LessonMetod мы должны создать объект
        LessonMetod t = new LessonMetod();
        //вызов метода(method coll)
        int summaTrexChisel = t.summa(10, 5, 12);
        System.out.println(summaTrexChisel);
        //можно и так
        System.out.println(t.summa(12, 2, 34));


        //выводим результат 2 метода
        System.out.println(t.sredneeArifm(20,45,79));
    }
}
