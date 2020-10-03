package lab3.part1;

public class Sandals extends Shoes {
    private boolean isOpen = false;

    public Sandals(Producer producer, String color) {
        super(producer, color);
    }

    public Sandals(Producer producer, String color, int size) {
        super(producer, color, size);
    }

    public Sandals(Producer producer, String color, int size, boolean isOpen) {
        super(producer, color, size);
        this.isOpen = isOpen;
    }

    @Override
    public String brandName() {
        return "Keddo";
    }

    public boolean isOpen() {
        return isOpen;
    }
}
