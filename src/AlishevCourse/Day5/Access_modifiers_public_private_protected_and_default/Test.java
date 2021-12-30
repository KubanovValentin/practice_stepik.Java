package AlishevCourse.Day5.Access_modifiers_public_private_protected_and_default;

public class Test  {
//    public static void main(String[] args) {
        //public - везде на проятжении проекта(в любом другом поле, классе, пакете)
        // privat-противоположный первому, доступ только в пределах класса где поле декларированно
        // default по умолчанию (все что default доступно в пределах этого пакета)
        // protected доступны в пределах одного пакета и подклассам вне пакета(детям)
//        Person person1=new Person();
//        person1.name="Bob";
//        System.out.println(Person.CONSTANT);
//        Person p1=new Person();
//        System.out.println(p1.name);
//    }
        protected String name;
        public Test(){
            name="Bob";
        }
}
