package Zaur_OOP.podpaket_lesson27_exceptions_and_mistakes.exception_classes;

import java.util.ArrayList;
import java.util.List;

public class Test20 {
    /*NullPointerException
    static ArrayList<String> list;
     */

    public static void main(String[] args) {
        /*ArrayIndexOutOfBoundsException
        ArrayList<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));
         */
        //------------------------------
        /*ArithmeticException
        System.out.println(5/0);
         */
        //------------------------------
        /*ClassCastException
        Doctor d= new Doctor();
        Teacher t=new Teacher();
        Employee[]array1={d,t};
        Teacher t2=(Teacher) array1[0];
         */
        //--------------------------------
        /*IllegalArgumentException
        createPwd("weqq");
         */
        //-----------------------------------
        /*NullPointerException
            list.add("!!!");
         */
        //------------------------------------
        /*NumberFormatException
        System.out.println(Integer.parseInt("44dfsdfsd"));
        //-------------------------------------------------
        //NumberFormatException нет 16 система счисления
        System.out.println(Integer.parseInt("44ab",16));
         */


    }
    /*IllegalArgumentException
    public static void createPwd(String pwd){
        if (pwd.length()<6){
            throw new IllegalArgumentException("dlina parolay malenkaya");
        }
        if (pwd.length()>12){
            throw new IllegalArgumentException("dlina parolay bolshaya");
        }
        System.out.println("parol prinayt");
    }
     */

}
/*ClassCastException
class Employee{}
class Doctor extends Employee{}
class Teacher extends Employee{}
 */
