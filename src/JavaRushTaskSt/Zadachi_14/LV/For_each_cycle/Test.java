package JavaRushTaskSt.Zadachi_14.LV.For_each_cycle;
/*
Итератор
--------
ArrayList<String> list = new ArrayList<String>();

Iterator<String> it = list.iterator();
while (it.hasNext())
{
   String str = it.next();
   System.out.println(str);
}
 */
/*
Цикл for
--------
ArrayList<String> list = new ArrayList<String>();

for (int i = 0; i < list.size(); i++)
{
   String str = list.get(i);
   System.out.println(str);
}
 */
//----------------------------------------------------------
//for(Тип имя:коллекция)
/*
Цикл for-each
--------------
ArrayList<String> list = new ArrayList<String>();

for (String str: list)
{
   System.out.println(str);
}
---------
Что видит компилятор: Цикл с итератором

ArrayList<String> list = new ArrayList<String>();
Iterator<String> it = list.iterator();

while (it.hasNext())
{
   String str = it.next();
   System.out.println(str);
}
 */
//-----------------------------------------------------
//Даже обход списка ArrayList с помощью цикла for-each выглядит короче:
/*
Цикл for-each
-------------
ArrayList<String> list = new ArrayList<String>();

for (String str: list)
{
   System.out.println(str);
}
===================
Цикл for
---------
ArrayList<String> list = new ArrayList<String>();

for (int i = 0; i < list.size(); i++)
{
   String str = list.get(i);
   System.out.println(str);
}
 */
public class Test {


}
