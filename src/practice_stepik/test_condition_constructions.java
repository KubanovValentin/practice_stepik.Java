package practice_stepik;
//import java.util.Locale;
import java.util.Scanner;
public class test_condition_constructions {
    public static void main(String[] args){


//------------------------------------------
//        Задана логическая переменная z:
//        При каких значениях переменных a, b и c значение переменной z точно будет равно false?
//        int a = 12;
//        int b;
//        int c= 12;
//        boolean z = a == 12 || b != 5 && c <= 10;

//        a != 12, b = любое натуральное число, c = 12
//        _________________________________________
//        На вход подаётся  целое число.
//        Выведите "YES", если введено трёхзначное положительное число, а в противном случае - "NO".
//            Scanner sc = new Scanner(System.in);
//            int a = sc.nextInt();
//            if (a>99 && a<1000) {
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
//            }
//        ----------------------------------------------------
//        На вход подается строка, а затем слово.
//        Выведите true, если слово содержится в строке, и false - если нет, без учёта регистров.
//        abracadabra
//        Cadabra
        
//            Scanner sc = new Scanner(System.in);
//            String str1 = sc.nextLine();
//            String str2 = sc.nextLine();
//            boolean rez = str1.toUpperCase().contains(str2.toUpperCase());
//            System.out.println(rez);

//_____________________________________________________________________
// На вход подаётся целое трёхзначное число, а затем цифра.
// Выведите true, если эта цифра является средней в числе (разряд десятков), и false - если нет.
// Если введённое число не является трёхзначным, выведите "error".
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a > 99 && a < 1000){
//            if(((a%=100)/10) == b) {
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }
//        }else {
//            System.out.println("error");
//        }


//  ------другое решение через строки

//        boolean rez = a > 99 && a < 1000;
//        if (rez==true){
//            String str1 = Integer.toString(a);
//            String str2 = Integer.toString(b);
//            char letter_2 = str1.charAt(1);
//            char letter_0 = str2.charAt(0);
//
//            if(str1.charAt(1)==str2.charAt(0)){
//                System.out.println("true");
//            }else {
//                System.out.println("false");
//            }
//
//
//
//        }else {
//            System.out.println("error");
//        }
//-------другое решение
//        Scanner cs = new Scanner(System.in);
//        int a = cs.nextInt();
//        int b = cs.nextInt();
//        if (a<0) {
//            a*=-1;
//        }
//        if (b<0) {
//            b*=-1;
//        }
//        String x = Integer.toString(a);
//        String y = Integer.toString(b);
//        char a1 = x.charAt(1);
//        char a2 = y.charAt(0);
//        int f =a1;
//        int g =a2;
//
//        if (a<100 || a>999) {System.out.println("error");
//        }else if (f==g) {System.out.println("true");
//        }else {System.out.println("false");
//        }
//-------------------------------------------------------------------------------
// На вход подаётся два числа - a и b.
// Выведите знак отношения между числами: один символ "<", если a < b, ">", если a > b и "=", если a=b.
//        Scanner sc = new Scanner(System.in);
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();
//        if(a>b){
//            System.out.println(">");
//        }else if(a<b){
//            System.out.println("<");
//        }else if(a==b){
//            System.out.println("=");
//        }
// --------------------------------------------------------------------------------------
// Выведите время года по введённому номеру месяца.
// Если введён ошибочный номер месяца, выведите "error".
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        switch (x) {
//            case 1:
//                System.out.println("Зима");
//                break;
//            case 2:
//                System.out.println("Зима");
//                break;
//            case 3:
//                System.out.println("Весна");
//                break;
//            case 4:
//                System.out.println("Весна");
//                break;
//            case 5:
//                System.out.println("Весна");
//                break;
//            case 6:
//                System.out.println("Лето");
//                break;
//            case 7:
//                System.out.println("Лето");
//                break;
//            case 8:
//                System.out.println("Лето");
//                break;
//            case 9:
//                System.out.println("Осень");
//                break;
//            case 10:
//                System.out.println("Осень");
//                break;
//            case 11:
//                System.out.println("Осень");
//                break;
//            case 12:
//                System.out.println("Зима");
//                break;
//            default:
//                System.out.println("error");
//        }
//        ---------------------------------------------------
//        На вход подаются координаты точки x, y.
//        Определите, попадает ли точка в заштрихованную область.Выведите "Yes", если попадает,
//        и "No" - в противном случае.


//        Scanner sc = new Scanner(System.in);
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        if(x < 0 && x<=y && y<=2-x*x){
//                System.out.println("YES");
//        }else if (x>=0 && y>=0 && y<=2-x*x) {
//                System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//        --------------------------------------------------------------
//        Богатейшие люди Земли решили создать тайное мировое правительство
//        ̶и̶ ̶у̶п̶р̶а̶в̶л̶я̶т̶ь̶ ̶п̶л̶а̶н̶е̶т̶о̶й̶,̶ ̶н̶е̶ ̶п̶р̶и̶в̶л̶е̶к̶а̶я̶ ̶в̶н̶и̶м̶а̶н̶и̶я̶ ̶с̶а̶н̶и̶т̶а̶р̶о̶в̶.
//        В кабинет совещаний могут войти только те, кто указан в специальном
//        списке: Джефф Безос, Илон Маск,  Марк Цукерберг, Билл Гейтс.
//        Чтобы получить допуск, нужно сказать фразу-приветствие.
//        Если фраза-приветствие содержит имя из списка, проход разрешается.
//        Если же нет - проход блокируется.
//        На ввод подаётся фраза-приветствие.
//        Выведите "Добро пожаловать!", если имя есть в списке, и "Здесь никого нет,
//        Вы ошиблись дверью" - если нет.
//            Scanner sc = new Scanner(System.in);
//            String mainStr = sc.nextLine();
//            String name1 = "Джефф Безос";
//            String name2 = "Илон Маск";
//            String name3 = "Марк Цукерберг";
//            String name4 = "Билл Гейтс";
//            if (mainStr.contains(name1)==true
//                    || mainStr.contains(name2)==true
//                        || mainStr.contains(name3)==true
//                            ||mainStr.contains(name4)==true){
//                System.out.println("Добро пожаловать!");
//            }else {
//                System.out.println("Здесь никого нет, Вы ошиблись дверью");
//            }
//        ------------------------------------------------
//        На вход подаётся слово.
//        Выведите словами количество букв в этом слове.
//        Если букв больше пяти - выведите "Длинное слово".

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int x = str.length();
        if (x>0 && x<6) {
            if(x==1) {
                System.out.println("Одна буква");
            }else if(x==2) {
                System.out.println("Две буквы");
            }else if(x==3) {
                System.out.println("Три буквы");
            }else if(x==4) {
                System.out.println("Четыре буквы");
            }else if(x==5) {
                System.out.println("Пять букв");
            }
        }else {
            System.out.println("Длинное слово");
        }


    }
}
