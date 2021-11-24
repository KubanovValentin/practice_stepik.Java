package AlishevCourse.Day1.The_while_loop;

public class WhileLoops {
    public static void main(String[] args) {
        boolean b=5==5;
        System.out.println(b);
//в цикле нужен какой либо логический оператор(какое либо условие)
        int value=0;
        boolean t= value>5;
        //while выполняется до тех пор пока true
        while (value<5){
            System.out.println("Hello "+value);
            value=value+1;
        }

    }
}
