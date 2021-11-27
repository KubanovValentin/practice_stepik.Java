package AlishevCourse.Day4.Foreach_loop_Arrays_of_strings;

public class Arrays_of_strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];//создали массив и сейчас есть 5 пустых ячеек со значением по умолчанию 0
        numbers[0] = 10;
        String[] strings = new String[3];//вместить в себя объект класса стринг и их 3
        strings[0]="привет";
        strings[1]="пока";
        strings[2]="джава";
//        System.out.println(strings[0]);
//        System.out.println(strings[2]);
        //проходим по каждому элементу массива(индексу)
        for (int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }
        System.out.println();
//        ----------------------------------------


        for (String string:strings){
            //(тип данных, имя переменной которая будет использоваться в нутри этого цикла:имя мссива нашего
            // мы хотим работать со строкой String string(имя мы можем писать любое, но логичнее написать string)
            System.out.print(string+" ");
        }
        System.out.println();
//        -----------------------------------------



        //выведем сумму всех элементов(х) в массиве
        int[]numbers1={1,2,3,4};
        int sum=0;
        for (int x:numbers1){
            sum=sum+x;
        }
        System.out.println(sum);
        System.out.println();
//        ------------------------------------------


        int value=0;//выделяем 32 бита памяти
        String s;//пока это декларируем.по умолчание null
        // сдесь не знаем сколько занимает строка в отличии от выше(как из 1 буквы так из 100)
        // и сдесь выделяеться только память под ссылку s



    }
}
