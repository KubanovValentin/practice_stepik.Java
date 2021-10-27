package Test_Calculator;

public class Operations {
    int a;
    int b;
    char plus;
    char min;
    char umn;
    char del;
    char zn;

    void matemOperat() {
        int result;

        if (zn == plus) {
            result = a + b;
            System.out.println(result);
        } else if (zn == min) {
            result = a - b;
            System.out.println(result);
        } else if (zn == umn) {
            result = a * b;
            System.out.println(result);
        } else if (zn == del) {
            result = a / b;
            System.out.println(result);
        } else {
            System.out.println("throws Exception");
        }
    }

}
