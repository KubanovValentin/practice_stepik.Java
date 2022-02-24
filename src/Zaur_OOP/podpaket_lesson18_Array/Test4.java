package Zaur_OOP.podpaket_lesson18_Array;

public class Test4 {
 public static void bar(){
     int x;
     int[]nums={1,2,3};
     for (x=0;x< nums.length;x++){
         x+=nums[x];
     }
     System.out.println(x);
 }

    public static void main(String[] args) {
        bar();
    }
}
