package lab2.part2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Player> players = new ArrayList<>();
        players.add(new FootballPlayer("Male", "Ivan", 20, 11, "Defense"));
        players.add(new FootballPlayer("Male", "Max", 27, 30, "Attack"));
        players.add(new BasketballPlayer("Female", "Tanya", 21, 180, 12));
        players.add(new BasketballPlayer("Female", "Nina", 21, 180, 12));

        for (Player player : players) {
            player.play();
        }
        System.out.print("\n");
        for (Player player : players) {
            System.out.println( player.toString());
            System.out.print("\n");
        }
    }
}
