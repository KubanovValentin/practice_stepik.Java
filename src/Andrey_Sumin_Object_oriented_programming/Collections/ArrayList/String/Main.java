package Andrey_Sumin_Object_oriented_programming.Collections.ArrayList.String;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        //данная коллекция может хранить только String тип!!! для этого нужно <>и в них указать тип
        employees.add("Kolia");
        employees.add("Valek");
        employees.add("Sveta");
        employees.add("Olia");
        employees.add("Katia");
        //удаляем из списка
        employees.remove(0);
        employees.remove("Katia");
        employees.add("Petia");
        employees.add("Valera");
//        выведим все это в нашей коллекции
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }
//        это коллекция String и поэтому можно выводить строки с помощью метода форич
        for (String name : employees) {
            System.out.println(name);
//        }
        }
    }
}