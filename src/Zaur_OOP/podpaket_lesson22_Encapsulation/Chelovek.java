package Zaur_OOP.podpaket_lesson22_Encapsulation;
//так не годится потому что можно написать и 2500 лет жизни и - 60 вес поэтому
public class Chelovek {
    final String pol;

    public Chelovek(String pol) {
        this.pol = pol;
    }
    String name;
    int vozrast;
    int ves;

}
class TestChelovek{
    public static void main(String[] args) {
        Chelovek chel=new Chelovek("muz");
        chel.name="Vasya";
        chel.vozrast=35;
        chel.ves=83;
    }
}

