package Andrey_Sumin_Object_oriented_programming.Interface.homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Programmer programmer=new Programmer("Валентин");
        Driver driver=new Driver("Иван");
        Cook cook=new Cook("Валера");

        System.out.print(programmer.infoName()+" ");
        programmer.programming();
        System.out.print(driver.getName()+" ");
        driver.drive();
        System.out.print(cook.getName()+" ");
        cook.cooks();

//        ----------------------------------
        Programmer programmer1 = new Programmer("Иван");
        Programmer programmer2 = new Programmer("Николай");
        Programmer programmer3 = new Programmer("Алена");
        Driver driver1 = new Driver("Сергей");
        Driver driver2 = new Driver("Костя");
        Driver driver3 = new Driver("Лера");
        Cook cooker1 = new Cook("Вадим");
        Cook cooker2 = new Cook ("Виктор");
        Cook cooker3 = new Cook ("Максим");

        ArrayList<Worker> workers=new ArrayList<>();
        workers.add(programmer1);
        workers.add(programmer2);
        workers.add(programmer3);

        workers.add(driver1);
        workers.add(driver2);
        workers.add(driver3);

        workers.add(cooker1);
        workers.add(cooker2);
        workers.add(cooker3);

        for (Worker worker:workers){
            worker.voice();
        }


        ArrayList<Programming> programmings=new ArrayList<>();
        programmings.add(programmer1);
        programmings.add(programmer2);
        programmings.add(programmer3);
        for (Programming programming:programmings){
            programming.programming();
        }


        ArrayList<Drive>drives=new ArrayList<>();
        drives.add(driver1);
        drives.add(driver2);
        drives.add(driver3);
        for (Drive drive:drives){
            drive.drive();
        }


        ArrayList<Cooks>cooks=new ArrayList<>();
        cooks.add(cooker1);
        cooks.add(cooker2);
        cooks.add(cooker3);
        for (Cooks cooks1:cooks){
            cooks1.cooks();
        }
    }
}
