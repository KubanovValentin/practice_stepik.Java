package Zaur_OOP.podpaket_lesson22_Encapsulation;

public class ChelovekLichDanie {
    final String pol;

    public ChelovekLichDanie(String pol) {
        this.pol = pol;
    }

    private boolean clever;
    public boolean isClever(){
        return clever;
    }


    private String name;//применили инкапсуляцию
    public String getName() {//метод позволяющий показывать имя
        return name;
    }
    //метод позволяющий сменить имя
    public void setName(String s) {
        this.name = s;
    }

    private StringBuilder fName;
    //для того чтобы не изменить с помощью chel.getfName().append("!!!");
    //делаем копию и работаем с ней
    public StringBuilder getfName() {
        StringBuilder sb=new StringBuilder(fName);//копия fName
        return sb;
    }

    public void setfName(StringBuilder fName) {
        this.fName = fName;
    }

    private int vozrast;
    public int getVozrast() {
        return vozrast;
    }
    public void setVozrast(int let) {
        if (let>0){
            this.vozrast = let;
        }

    }

    private int ves;
    public int getVes() {
        return ves;
    }
    public void setVes(int kg) {
        if (kg>0){
            this.ves = kg;
        }

    }
}
class ChelovekLichDanieTest{
    public static void main(String[] args) {
        ChelovekLichDanie chel=new ChelovekLichDanie("man");
        chel.setName("Valentin");
        chel.setfName(new StringBuilder("Skuratov"));
        chel.setVozrast(43);
        chel.setVes(83);
        System.out.println(chel.getName());
        System.out.println(chel.getfName());
        System.out.println(chel.getVozrast()+" let");
        System.out.println(chel.getVes()+" kg");
    }
}