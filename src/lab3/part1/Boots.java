package lab3.part1;

public class Boots extends Shoes {
     private int heelSize = 0;
     private String type = "Не указано";

    public Boots(Producer producer, String color) {
        super(producer, color);
    }

    public Boots(Producer producer, String color, int size) {
        super(producer, color, size);
    }

    public Boots(Producer producer, String color, int size, int heelSize, String type) {
        super(producer, color, size);
        this.heelSize = heelSize;
        this.type = type;
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
