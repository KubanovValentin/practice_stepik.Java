package AlishevCourse.Day2.Conditional_if_statement;

public class If {
    public static void main(String[] args) {
        int myInt=15;
        if (myInt<10){//условие выполняеться пока true
            System.out.println("да верно");

        }else if (myInt>20){
            System.out.println("не верно");
        }
        else {//если 1 и 2 блок не true а fulse то выполняется этот
            System.out.println("ни один не верный");
        }
        //условия выполнения логического оператора с верху вниз,если 1 условие true то все заканчиваеться,
        // если fulse то идем дальше до true либо до последнего else
    }
}
