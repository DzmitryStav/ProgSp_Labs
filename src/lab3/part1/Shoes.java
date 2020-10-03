package lab3.part1;

public abstract class Shoes {
    private Producer producer = Producer.CHINA;
    private String color = "Не указано";
    private int size = 0;

    public Shoes() {
        super();
    }

    public Shoes(Producer producer, String color) {
        this.producer = producer;
        this.color = color;
    }

    public Shoes(Producer producer, String color, int size) {
        this.producer = producer;
        this.color = color;
        this.size = size;
    }

    public abstract String brandName();

    public Producer getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
