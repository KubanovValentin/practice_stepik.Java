package JavaRushTaskSt.Zadachi_10.LV.A_device_of_the_String_class.Auxiliary_classes_for_working_with_strings.StringFormat_method_and_StringFormatter_class;

public class Test {
    //И еще один интересный метод класса String — format().
    public static void main(String[] args) {
        String name = "Amigo";
        int age = 12;
        String friend = "Diego";
        int weight = 200;
        System.out.println("User = {name: " + name + ", age:" + age + " years, friend: " + friend+", weight: " + weight + " kg.}");

        //Вывод на экран-->User = {name: Amigo, age: 12 years, friend: Diego, weight: 200 kg.}
        //Такой код не слишком читабельный. !!!!!
        // Более того, если бы имена переменных были длиннее, код стал бы еще сложнее:!!!!
    }
}
//Не очень читаемо, не так ли?
//class User {
//    String name = "Amigo";
//    int age = 12;
//    String friend = "Diego";
//    int weight = 200;
//
//    public String getName() {
//        return name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public List<String> getFriends() {
//        return friends;
//    }
//
//    public ExtraInformation getExtraInformation() {
//        return extraInformation;
//    }
//}
//
//    User user = new User();
//
//System.out.println("User = {name: " + user.getName() + ",
//                        age:" + user.getAge() + " years, friend: " + user.getFriends().get(0) + ",
//                        weight: " + user.getExtraInformation().getWeight() + " kg.}");
//

//Не очень читаемо, не так ли?
//Однако в реальных программах такая ситуация встречается часто, поэтому я хочу рассказать о способе,
// как проще и короче записать этот код.
//
//String.format