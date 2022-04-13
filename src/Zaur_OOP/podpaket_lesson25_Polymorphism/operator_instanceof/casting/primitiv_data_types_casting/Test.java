package Zaur_OOP.podpaket_lesson25_Polymorphism.operator_instanceof.casting.primitiv_data_types_casting;

public class Test {
    public static void main(String[] args) {
        {
            byte b = 10;
            int a = b;//это и есть расширение
            System.out.println(a);
        }
        {
            byte b2 = 3;//3 это инт и он переходит в байт
            short s1 = -6;// это инт и он переходит в шорт
            char c1 = 100;//это инт и он переходит в чар
            //это и есть narrowing
            int i1 = 3;
            short sh = (short) i1;
        }

        {
            final int a = 12;
            short sh1 = a;
            System.out.println(sh1);
        }
        {
            int i = 5;
            long l = 10;
            i = (int) (i * l);
            i *= l;
            System.out.println(i + l);
        }
        {

        }
    }
}
