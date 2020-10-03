package lab3.part2;

public class Boots implements Shoes, Object {
    private int heelSize = 0;
    private String type = "Не указано";

    public Boots(int heelSize, String type) {
        this.heelSize = heelSize;
        this.type = type;
    }

    @Override
    public void print() {

    }

    @Override
    public String brandName() {
        return "Taccardi";
    }

    public int getHeelSize() {
        return heelSize;
    }

    public String getType() {
        return type;
    }
}
