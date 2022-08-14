package House_calculation;

public class Fundament {

    static double a = 8.47;
    static double b = 11.22;
    static double c = 5.70;
    static double d = 6.47;
    static double d1 = 4.75;
    static double e = 11.22;
    static double depth = 0.50;
    static double heightFund = 0.80;
    static double widthFund = 0.30;
    static double lengthBlock = 0.625;
    static double heightSten = 5.20;

    public static void main(String[] args) {
        double perimetrStoen = a + b + c + d + d1;
        System.out.println(perimetrStoen);
        double perimetrVseSten = a + b + c + d + d1 + e;
        System.out.println(perimetrVseSten);
        double volumeBeton = perimetrVseSten * widthFund * heightFund;
        System.out.println(volumeBeton);
        double armatura = perimetrVseSten * 4;
        System.out.println("арматура d12 - " + armatura + " м.");
        double blockSten = perimetrVseSten / lengthBlock;
        System.out.println(blockSten);
        double blockKol = heightSten / 0.249 * blockSten / 32;
        System.out.println(blockKol);
    }
}
