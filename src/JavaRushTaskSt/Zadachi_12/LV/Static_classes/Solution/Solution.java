package JavaRushTaskSt.Zadachi_12.LV.Static_classes.Solution;
/*
В классе Outer есть внутренний (Inner) и вложенный (Nested) классы.
В методе main класса Solution создай по одному объекту каждого из них.
 */
public class Solution {
    public static void main(String[] args) {
        Outer.Inner inner=new Outer().new Inner();
        Outer.Nested nested=new Outer.Nested();
    }
}
