package JavaRushTaskSt.Zadachi_13.LV.Type_inference_by_the_Java_compiler;

public class Test2 {
    //С сахаром
    /*
    var list = new ArrayList<String>()
{{
   add("Привет");
   add("Как");
   add("Дела");
}};
     */
//--------------------------------------------
    //Без сахара
   /*
var list = new ArrayList<String>();

list.add("Привет");
list.add("Как");
list.add("Дела");
    */
    /*
  Код не становится сильно компактнее. Тут скорее экономия на мелочах: не нужно каждый раз писать list.
  Это может быть выгодно, если имя переменной очень длинное.

Но если вы встретите в чьем-то проекте такой код, не удивляйтесь 🙂
     */
}
