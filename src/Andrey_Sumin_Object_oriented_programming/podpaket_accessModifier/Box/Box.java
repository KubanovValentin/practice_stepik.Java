
package Andrey_Sumin_Object_oriented_programming.podpaket_accessModifier.Box;


//первую часть взяли из урока конструктор
public class Box {
    double width;
    double height;

    double length;


    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    public Box() {
        width = 0;
        height = 0;
        length = 0;
    }
    //5.создаем новый конструктор в качестве параметра принимает другую коробку
    Box(Box box){
        this.width= box.width;
        this.height= box.height;
        this.length= box.length;
    }
//5.после создания этого конструктора идем удалять в метод майн коробки и создавать новые

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;

    }

    double volume() {

        return width * height * length;
    }


    void showVolume() {
        double volume = width * height * length;
        System.out.println(volume);
    }
    //6. создаем метод увеличивающий размеры коробки 2 раза больше
// он возращает новую коробку
//increase -увеличение
//добавляем параметр i раз
    Box increase(int i){
        // Box box=new Box(width*2,height*2,length*2);
        // return box;
        //можно и так ниже
        return new Box(width*i,height*i,length*i);
    }




    //второя часть добавим метод который в качестве параметра принимает другую коробку,
    // и выводит на экран результат(просто будет выводить данные на экран)
    // сравнивает(в параметре-другая коробка, с которой будем сравнивать)

    //2.коментим этот код и пишем новый ниже
    //   void compare(Box box){
//создадим две переменные которые будут хранить объем коробок
    //       double thisVolume= volume();//присвоим значение volume т.е обсчитываем объем и сохраняем в thisVolume
    //      double boxVolume= box.volume();
    //теперь создаем условие---
    //      if (thisVolume>boxVolume){
    //      System.out.println("наша коробка больше");
    //   }else if (thisVolume<boxVolume){
    //       System.out.println("наша коробка меньше");
    //  }else {
    //       System.out.println("коробки равны");
    //    }//1.после этого идем в метод майн----
    // }

    //   ----------------------2.коментим этот код и пишем новый ниже
    //возращает тип инт
    int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;//4.но большинство делают так(3.комент)
        if (thisVolume > boxVolume) {
//3.            return 1; //можно и так
            result=1;
        } else if (thisVolume < boxVolume) {
//3.           return -1;//можно и так
            result=-1;
        } else {
//3.          return 0;//можно и так
            result=0;
        }
        return result;//4.идем в метод майн
    }


}
