package lab2.part2;

public class FootballPlayer extends Athlete implements Player {
    int numberOfGoalsScored = 0;
    String typeOfPlayerOnTheField = "Не указано";

    {
        kindOfSport = "Football";
    }

    public FootballPlayer(String sex, String name, int age) {
        super(sex, name, age);
    }

    public FootballPlayer(String sex, String name, int age, int numberOfGoalsScored, String typeOfPlayerOnTheField) {
        super(sex, name, age);
        this.numberOfGoalsScored = numberOfGoalsScored;
        this.typeOfPlayerOnTheField = typeOfPlayerOnTheField;
    }

    public FootballPlayer(String sex, String name, int age, int trainingExperienceYears, int numberOfAwards, String kindOfSport, int numberOfGoalsScored, String typeOfPlayerOnTheField) {
        super(sex, name, age, trainingExperienceYears, numberOfAwards, kindOfSport);
        this.numberOfGoalsScored = numberOfGoalsScored;
        this.typeOfPlayerOnTheField = typeOfPlayerOnTheField;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FootballPlayer)) return false;

        FootballPlayer that = (FootballPlayer) o;

        if (numberOfGoalsScored != that.numberOfGoalsScored) return false;
        return typeOfPlayerOnTheField != null ? typeOfPlayerOnTheField.equals(that.typeOfPlayerOnTheField) : that.typeOfPlayerOnTheField == null;
    }

    @Override
    public int hashCode() {
        int result = numberOfGoalsScored;
        result = 31 * result + (typeOfPlayerOnTheField != null ? typeOfPlayerOnTheField.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Количество забитых голов: " + numberOfGoalsScored  + "\n" + "Тип игрока: " + typeOfPlayerOnTheField;
    }
}
