package Zaur_OOP.podpaket_lesson30.Test31;

interface Jumpable {
}

class Cats implements Jumpable {
}

class Tiger extends Cats {
}

class House {
}

public class Test {
    public static void main(String[] args) {
        Jumpable j = new Tiger();
        Tiger t=new Tiger();
        House h=new House();

        if (j instanceof Cats){
            System.out.println("j is Cat");
        }
        if (t instanceof Jumpable){
            System.out.println("t is Jumpable");
        }
        if (h instanceof Jumpable){
            System.out.println("h is Jumpable");
        }
    }
}
