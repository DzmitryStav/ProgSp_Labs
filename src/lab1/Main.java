package lab1;

public class Main {
    public static void main(String[] args) {
        Music music = new Music("Haddaway - What Is Love", 1_000_000);
        new WriterInfo(music).infoAboutClass();

        music.buySongInTheInternet();
    }
}


