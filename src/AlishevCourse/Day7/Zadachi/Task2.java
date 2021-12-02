package AlishevCourse.Day7.Zadachi;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        Player player2 = new Player(94);
        Player player3 = new Player(91);
        Player player4 = new Player(96);

        Player.info();

        Player player5 = new Player(100);
        Player player6 = new Player(98);

        Player.info();

        Player player7 = new Player(95);
        Player.info();
        for (int i = 0; i < 94; i++) {
            player2.run();
        }
        Player.info();

    }
}

class Player {
    private int stamina;

    private final static int MAX_STAMINA = 100;
    private final static int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }

    }
}