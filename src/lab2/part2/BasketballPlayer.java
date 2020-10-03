package lab2.part2;

public class BasketballPlayer extends Athlete implements Player {
    int playerGrowth;
    int  jumpHeight;

    {
        kindOfSport = "Basketball";
    }

    public BasketballPlayer(String sex, String name, int age) {
        super(sex, name, age);
    }

    public BasketballPlayer(String sex, String name, int age, int trainingExperienceYears, int numberOfAwards, String kindOfSport) {
        super(sex, name, age, trainingExperienceYears, numberOfAwards, kindOfSport);
    }

    public BasketballPlayer(String sex, String name, int age, int playerGrowth, int jumpHeight) {
        super(sex, name, age);
        this.playerGrowth = playerGrowth;
        this.jumpHeight = jumpHeight;
    }

    public BasketballPlayer(String sex, String name, int age, int trainingExperienceYears, int numberOfAwards, String kindOfSport, int playerGrowth, int jumpHeight) {
        super(sex, name, age, trainingExperienceYears, numberOfAwards, kindOfSport);
        this.playerGrowth = playerGrowth;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasketballPlayer)) return false;

        BasketballPlayer that = (BasketballPlayer) o;

        if (playerGrowth != that.playerGrowth) return false;
        return jumpHeight == that.jumpHeight;
    }

    @Override
    public int hashCode() {
        int result = playerGrowth;
        result = 31 * result + jumpHeight;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Рост игрока: " + playerGrowth  + "\n" + "Высота прыжка игрока: " + jumpHeight;
    }
}
