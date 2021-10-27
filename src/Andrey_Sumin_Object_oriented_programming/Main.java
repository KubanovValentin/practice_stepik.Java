package Andrey_Sumin_Object_oriented_programming;

public class Main {
    public static void main(String[] args) {
//        Box myBox = new Box();
////        myBox = new Box();
//        myBox.height = 10.2;
//        myBox.length = 15;
//        myBox.width = 11.3;
//
//        Box myBox2 = new Box();
//        myBox2.height = 5;
//        myBox2.length = 5;
//        myBox2.width = 5;
//
//        Box myBox3 = new Box();
//        myBox3.height = 10;
//        myBox3.length = 10;
//        myBox3.width = 10;
//
//        double volume = myBox.height * myBox.length * myBox.width;
//        double volume2 = myBox2.height * myBox2.length * myBox2.width;
//        double volume3 = myBox3.height * myBox3.length * myBox3.width;

//        System.out.println("Объем коробки 1 - " + volume + "\nОбъем коробки 2 - " + volume2 + "\nОбъем коробки 3 - " + volume3);

//---------------------------дз
//        Human chel1 = new Human();
//        chel1.name = "Вася";
//        chel1.age = 35;
//        chel1.weight = 78.5;
//
//        Human chel2 = new Human();
//        chel2.name = "Петя";
//        chel2.age = 45;
//        chel2.weight = 98.8;
//        Human chel3 = new Human();
//        chel3.name = "Вова";
//        chel3.age = 64;
//        chel3.weight = 58.1;
//        Human chel4 = new Human();
//        chel4.name = "Саня";
//        chel4.age = 15;
//        chel4.weight = 48.9;
//        Human chel5 = new Human();
//        chel5.name = "Толя";
//        chel5.age = 57;
//        chel5.weight = 83.7;
//        int result = (chel1.age + chel2.age + chel3.age + chel4.age + chel5.age) / 5;
//        System.out.println(result);

//-----------------------
//        Box box1=new Box();
//        Box box2=new Box();
//        box1.height = 5;
//        box1.length = 5;
//        box1.width = 5;
//
//        box2.height = 10;
//        box2.length = 10;
//        box2.width = 10;
//
//        box1.showVolume();
//        box2.showVolume();

//        double volume1 = box1.volume();
//        double volume2 = box2.volume();
//        System.out.println(volume1);
//        System.out.println(volume2);

//-------------------------

//        Test test = new  Test();
//        int square= test.square(80);
//        double sqrt = Math.sqrt(36);
//        System.out.println(sqrt);
//        System.out.println(square);

//------------------------------
        Box box = new Box();
        box.setDimens(15,15,15);
        System.out.println(box.volume());

    }
}
