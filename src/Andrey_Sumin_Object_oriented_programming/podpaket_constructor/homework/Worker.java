package Andrey_Sumin_Object_oriented_programming.podpaket_constructor.homework;

public class Worker {
    String name;
    String post;
    int salary;

    Worker(String name,String post,int salary){
        this.name=name;
        this.post=post;
        this.salary=salary;
    }
    String infoWorker(int mount){
        int result=salary*mount;
        return "наш сотрудник: " + name+ " получил зарплату  за "+ mount +" месяцев"+" = " + result+" рублей.";

    }
}

class Main{
    public static void main(String[] args) {
    Worker worker1=new Worker("Вася","монтажник",1200);
    System.out.println(worker1.infoWorker(12));
    }
}