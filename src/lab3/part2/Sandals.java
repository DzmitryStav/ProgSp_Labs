package lab3.part2;

public abstract class Sandals implements Shoes, Object {
    private boolean isOpen = false;

    public Sandals(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
