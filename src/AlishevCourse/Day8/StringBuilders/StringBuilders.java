package AlishevCourse.Day8.StringBuilders;

public class StringBuilders {
    public static void main(String[] args) {
        //2 типа объекта
        // 1 это изменяемый
        // 2 это неизменяемый
//        String x ="Hello";
//        //переопределить
//        x=x.toUpperCase();
//        System.out.println(x);

//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " friend";
//        String stringAll = string1+string2+string3;
//        System.out.println(string1+string2+string3);
//        System.out.println(stringAll);

// если много конкатенации String(образуются много новых объектов)
// программа медленнее или плохо начинает работать для этого есть StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
//        System.out.println(sb.toString());
//        sb.append(" my");
//        sb.append(" friend!");
        //можно выше сделать так
        sb.append(" my").append(" friend!");
        System.out.println(sb.toString());
        //ЗАПОМНИТЬ если у нас совершаться множество конкатенаций
        // или с помощью цикла изменяете строку то нужно помнить что строка не меняется,
        // а каждый раз создается новая уже измененная и если делается это часто
        // то такой процесс очень сильно замедляет исполнение программы и затрачивает много памяти
        // и поэтому чтобы избежать этого использовать нужно вместо String ->  StringBuilder
    }
}
