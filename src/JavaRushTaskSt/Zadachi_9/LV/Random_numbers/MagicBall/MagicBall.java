package JavaRushTaskSt.Zadachi_9.LV.Random_numbers.MagicBall;

import java.util.Random;

/*
В этой задаче тебе предстоит реализовать метод getPrediction() в классе MagicBall,
который будет работать как шар предсказаний.
Он случайным образом возвращает фразу-ответ на заданный вопрос.
В методе getPrediction() нужно использовать метод nextInt(int) класса Random,
который должен возвращать значения от 0 до 7 включительно.
В зависимости от результата работы метода nextInt(int) возвращается один из
 */
public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";
//правильное решение
public static String getPrediction() {
    int random = new Random().nextInt(8);
    if (random == 0) {
        return CERTAIN;
    } else if (random == 1) {
        return DEFINITELY;
    } else if (random == 2) {
        return MOST_LIKELY;
    } else if (random == 3) {
        return OUTLOOK_GOOD;
    } else if (random == 4) {
        return ASK_AGAIN_LATER;
    } else if (random == 5) {
        return TRY_AGAIN;
    } else if (random == 6) {
        return NO;
    } else if (random == 7) {
        return VERY_DOUBTFUL;
    } else {
        return null;
    }
}


//    ----------------------------------------------------
//    мое решение
//    public static String getPrediction() {
//        if (getRandomDiceNumber()==0){
//            return CERTAIN;
//        }else if (getRandomDiceNumber()==1){
//            return DEFINITELY;
//        }else if (getRandomDiceNumber()==2){
//            return MOST_LIKELY;
//        }else if (getRandomDiceNumber()==3){
//            return OUTLOOK_GOOD;
//        }else if (getRandomDiceNumber()==4){
//            return ASK_AGAIN_LATER;
//        }else if (getRandomDiceNumber()==5){
//            return TRY_AGAIN;
//        }else if (getRandomDiceNumber()==6){
//            return NO;
//        }else if (getRandomDiceNumber()==7){
//            return VERY_DOUBTFUL;
//        }
//        return null;
//    }
//    public static int getRandomDiceNumber(){
//        return  (int) (Math.random() * 8);
//    }
}
