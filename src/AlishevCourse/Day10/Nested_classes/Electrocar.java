package AlishevCourse.Day10.Nested_classes;

public class Electrocar {
    private int id;
    //вложенный не статический класс
    // под объект(не статический) и они в сновном идут с модификатором private
    // он имеет доступ к полям private int id


    private class Motor{
        public void startMotor(){
            System.out.println("Motor is starting...");
        }
    }
    //вложенный статический класс
    // (он не имеет доступа к полям главного класса private int id)
    // если поля имеют static то этот класс будет иметь доступ к ним
    public static class Battery {
        public void charge(){
            System.out.println("Battery is charging...");
        }
    }
    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor=new Motor();
        motor.startMotor();
        //он имеет доступ к нестатическим полям класса(Motor) и к переменным метода start(к константам)
        class SomeClass{
            public void someMethod(){
                System.out.println(id);
            }
        }
        SomeClass someClass=new SomeClass();
        test(someClass);
        System.out.println("Electrocar " + id + " is starting...");
    }
    private void test(Object object){

    }
}
