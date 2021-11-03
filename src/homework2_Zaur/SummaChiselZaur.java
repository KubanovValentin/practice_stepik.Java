package homework2_Zaur;
//создайте класс,в котором будут 5 overloaded методов,
// которые вычисляют сумму нуля, одного, двух, трех и четырех целых чисел соответственно,
// передают эту сумму в output и выводят ее на экран. в случае, когда слагаемые отсутствуют
// (т.е когда параметров нет) сумма пусть равняеться 0.


public class SummaChiselZaur {
    //у этих оверлоадов разный список параметров
    //метод (без параметров) с переменной result
    // в условии домаш.задан
    int sum() {
        int result = 0;
        System.out.println("Сумма всех чисел: " + result);
        return result;
    }

    int sum(int a) {
        int result1 = a;
        System.out.println("Сумма всех чисел: " + result1);
        return result1;
    }

    int sum(int b, int c) {
        int result2 = b + c;
        System.out.println("Сумма всех чисел: " + result2);
        return result2;
    }

    int sum(int d, int e, int f) {
        int result3 = d + e + f;
        System.out.println("Сумма всех чисел: " + result3);
        return result3;
    }

    int sum(int g, int h, int i, int j) {
        int result4 = g + h + i + j;
        System.out.println("Сумма всех чисел: " + result4);
        return result4;
    }
}

class SummaChiselZaurTest {
    public static void main(String[] args) {
        //создаем класс SummaChiselZaur и вызываем все 5 методов
        SummaChiselZaur s = new SummaChiselZaur();
        s.sum();
        s.sum(3);
        s.sum(3, 5);
        s.sum(3, 5, 7);
        s.sum(3, 5, 7, 11);
    }
}