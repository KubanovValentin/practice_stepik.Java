package Zaur_OOP.podpaket_lesson30.Test41;



public class Test {
    public static void main(String[] args) {
        String[]array=new String[7];
        for (int i=0;i< args.length;i++){
            if (i< args.length)
                array[i]=args[i];
                System.out.println(array[i].toUpperCase());
        }
    }
}
