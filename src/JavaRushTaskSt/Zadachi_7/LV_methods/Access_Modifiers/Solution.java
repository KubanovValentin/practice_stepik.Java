package JavaRushTaskSt.Zadachi_7.LV_methods.Access_Modifiers;

public class Solution {
    public static void main(String[] args) {
        Person10 person = new Person10("Иван", "Иванов");
        System.out.println("Досье.");
        System.out.println("Имя: " + person.getFirstName());
        System.out.println("Фамилия: " + person.getLastName());
        System.out.println("Полное имя: " + person.getFullName());

    }
}
