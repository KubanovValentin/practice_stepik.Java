package Zaur_OOP.podpaket_lesson30.Test16;

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
        Tiger t = new Tiger();
        House h=new House();
        if (j instanceof Jumpable){
            System.out.println("j is Jumpable");
        }
        if (t instanceof Cats){
            System.out.println("t is Cat");
        }
        /*
        if (h instanceof Cats){//error нет связи is the
            System.out.println("h is Cat");
        }

         */
    }
}
