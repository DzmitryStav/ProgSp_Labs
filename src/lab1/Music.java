package lab1;

public class Music {
    private String nameOfSong;
    private int numberOfCopiesSold;

    public void buySongInTheInternet() {
        System.out.println("Покупка успешно завершена!");
    }

    public Music(String nameOfSong, int numberOfCopiesSold) {
        this.nameOfSong = nameOfSong;
        this.numberOfCopiesSold = numberOfCopiesSold;
    }

    public Music(int numberOfCopiesSold) {
        this.nameOfSong = "Название песни не указано";
        this.numberOfCopiesSold = numberOfCopiesSold;
    }

    public Music(String nameOfSong) {
        this.numberOfCopiesSold = 0;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public void setNameOfSong(String nameOfSong) {
        this.nameOfSong = nameOfSong;
    }

    public int getNumberOfCopiesSold() {
        return numberOfCopiesSold;
    }

    public void setNumberOfCopiesSold(int numberOfCopiesSold) {
        this.numberOfCopiesSold = numberOfCopiesSold;
    }
}