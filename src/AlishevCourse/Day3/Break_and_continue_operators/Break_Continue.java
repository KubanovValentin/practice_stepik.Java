package AlishevCourse.Day3.Break_and_continue_operators;

public class Break_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i = i + 1;
        }
        System.out.println("мы вышли из цикла");
    }
}
