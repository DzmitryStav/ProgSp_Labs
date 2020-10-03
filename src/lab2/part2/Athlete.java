package lab2.part2;

public abstract class Athlete extends Person implements Player{
    int trainingExperienceYears = 0;
    int numberOfAwards = 0;
    String kindOfSport = "Не указано.";

    public Athlete(String sex, String name, int age) {
        super(sex, name, age);
    }

    public Athlete(String sex, String name, int age, int trainingExperienceYears, int numberOfAwards, String kindOfSport) {
        super(sex, name, age);
        this.trainingExperienceYears = trainingExperienceYears;
        this.numberOfAwards = numberOfAwards;
        this.kindOfSport = kindOfSport;
    }

    @Override
    public void play() {
        System.out.println("Игрок в " + kindOfSport + "(" + name + "): вступил в команду");
    }

    @Override
    public String toString() {
        return "Название спорта: " + kindOfSport + "\n"  + " Опыт игры: " + trainingExperienceYears + "\n" + " Количество наград: " + numberOfAwards;
    }
}
