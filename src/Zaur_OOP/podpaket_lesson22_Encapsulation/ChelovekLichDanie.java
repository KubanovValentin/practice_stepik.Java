package Zaur_OOP.podpaket_lesson22_Encapsulation;

public class ChelovekLichDanie {
    final String pol;

    public ChelovekLichDanie(String pol) {
        this.pol = pol;
    }
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String s) {
        this.name = s;
    }

    private int vozrast;
    private int ves;
}
