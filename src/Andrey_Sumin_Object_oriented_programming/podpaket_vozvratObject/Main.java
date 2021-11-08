package Andrey_Sumin_Object_oriented_programming.podpaket_vozvratObject;

public class Main {
    public static void main(String[] args) {
//5.        Box box = new Box(10);
//5.       Box box2 = new Box(10, 20, 15);

        //5.закоментили выше после создания конструктора и создаем
        //это совершенно разные коробки
        Box box1 = new Box(10);

        //6.коментим ниже для нового метода
        //   Box box2=new Box(box1);
        //    box1.setDimens(10,20,30);
        //6.и пишем новую коробку
        Box box2 = box1.increase(3);
        box1.showVolume();
        box2.showVolume();
        //1.у первой коробки вызовем метод compare
        //в качестве параметра передадим 2 коробку
// 3. box.compare(box2);
        //поменяем местами
//3. box2.compare(box);
        //теперь сравним с собой
// 3. box.compare(box);


//    -------------------  мы не хотим выводить инфу о том какая коробка больше
//    есть другой метод который получает данные от метода compare сравнивает и возвращает данные тип инт
//2. коментим метод и делаем другой

//4.вызываем метод
        int result = box1.compare(box2);
        switch (result) {
            case -1:
                System.out.println("наша коробка меньше");
                break;

            case 0:
                System.out.println("коробки равны");
                break;

            case 1:
                System.out.println("наша коробка больше");
                break;
        }
//5.сделаем возможность создавать коробки по размеру как те которые передадим в качестве параметра
//5.для этого создадим новый конструктор

//6.создаем метод возвращающий коробку с размерами в 2 раза больше
    }
}

