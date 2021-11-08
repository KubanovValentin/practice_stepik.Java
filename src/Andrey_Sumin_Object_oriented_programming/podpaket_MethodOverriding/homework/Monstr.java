package Andrey_Sumin_Object_oriented_programming.podpaket_MethodOverriding.homework;

public class Monstr {
    int eyes;
    int legs;
    int hands;

    Monstr() {
        eyes = 2;
        legs = 2;
        hands = 2;
    }

    Monstr(int odin) {
        eyes = odin;
        legs = 2;
        hands = 2;
    }

    Monstr(int tri, int chetir) {
        this.eyes = tri;
        this.legs = chetir;
        this.hands = 2;
    }

    Monstr(int tri, int dve, int shest) {
        this.eyes = tri;
        this.legs = dve;
        this.hands = shest;
    }
    void voice(){
        System.out.println("рррррр");
    }
    void voice(int i){
       for (int x=0;x<i;x++){
           System.out.println("голос");
       }
    }
    void voice(int i,String word){
        for (int x=0;x<i;x++){
           System.out.println(word);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Monstr homo = new Monstr();
        Monstr ciklop = new Monstr(1);
        Monstr centav = new Monstr(3, 4);
        Monstr shiva=new Monstr(3,2,6);
        homo.voice();
        centav.voice(3);
        shiva.voice(5,"я монстр шива");
    }
}