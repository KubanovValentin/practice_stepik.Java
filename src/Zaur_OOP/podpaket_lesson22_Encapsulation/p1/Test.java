package Zaur_OOP.podpaket_lesson22_Encapsulation.p1;

import Zaur_OOP.podpaket_lesson22_Encapsulation.ChelovekLichDanie;

public class Test {
    public static void main(String[] args) {
        ChelovekLichDanie chel=new ChelovekLichDanie("man");
        chel.setName("Valentin");
        chel.setVozrast(43);
        chel.setVes(83);
        System.out.println(chel.getName());
        System.out.println(chel.getVozrast()+" let");
        System.out.println(chel.getVes()+" kg");
    }
}
