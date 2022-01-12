package JavaRushTaskSt.Zadachi_10.LV.Literals;
/*
В классе Solution объявлено и проинициализировано публичное строковое поле. Но строка слишком длинная и неудобочитаемая.
Для лучшей читаемости нужно разделить её на 5 подстрок и склеить их "оператором +" (конкатенация строк) в таком виде:
 */

public class Solution3 {
    //public String text = "Всегда пишите код так, будто сопровождать его будет склонный к насилию психопат, который знает, где вы живете. Martin Golding";
//    public String text1="Всегда пишите код так, ";
//    public String text2= "будто сопровождать его будет ";
//    public String text3= "склонный к насилию психопат, ";
//    public String text4= "который знает, где вы живете. ";
//    public String text5= "Martin Golding";
//    public String text=text1+text2+text3+text4+text5;

    public String text = "Всегда пишите код так, " +
            "будто сопровождать его будет " +
            "склонный к насилию психопат, " +
            "который знает, где вы живете. " +
            "Martin Golding";
}
