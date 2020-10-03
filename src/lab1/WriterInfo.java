package lab1;

public class WriterInfo {
    Music music;

    public WriterInfo(Music music) {
        this.music = music;
    }

    void infoAboutClass() {
        System.out.println("Название песни: " + music.getNameOfSong());
        System.out.println("Количество проданных копий: " + music.getNumberOfCopiesSold());
    }



}
