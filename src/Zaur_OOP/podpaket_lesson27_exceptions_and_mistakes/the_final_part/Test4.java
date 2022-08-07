package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.the_final_part;

public class Test4 {
    static String str="";
    void ghi()throws Exception{//метод выбрасывает Exception
        throw new Exception();
    }
    void def()throws Exception{//метод выбрасывает Exception
        ghi();//затем вызывает метод ghi(); и на этой строчке этот метод заканчивает работу
        //пытается что-то сделать, но из-за Exception этот код не выполняется
        str+="2";
        ghi();
        str+="3";
    }
    void abc(){
        try {
            def();//вызываем метод def()
        }catch (Exception e){ //ловим Exception
            str+="1";
        }
    }

    public static void main(String[] args) {
        Test4 t4=new Test4();
        t4.abc();
        System.out.println(str);
    }
}
