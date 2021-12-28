package JavaRushTaskSt.Zadachi_4.LV_cycle;

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int start = sc.nextInt();
//            int end = sc.nextInt();
//            int multiple = sc.nextInt();
//            int sum = 0;
//            for (int x=start;x<end;x++){
//                if (x%multiple==0){
//                    sum+=x;
//                    continue;
//                }
//            }
//            System.out.println(sum);

//        --------------------------------
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int multiple = scanner.nextInt();

        int sum = 0;
        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);

    }
}
