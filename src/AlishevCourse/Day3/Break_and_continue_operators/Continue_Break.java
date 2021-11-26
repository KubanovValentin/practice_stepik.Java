package AlishevCourse.Day3.Break_and_continue_operators;

public class Continue_Break {
    public static void main(String[] args) {
        for (int i=0; i<15;i++){
            if (i%2==0){
                continue;
            }
            System.out.println("это нечетное число - "+i);
        }

    }
}
