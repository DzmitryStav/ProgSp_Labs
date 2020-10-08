package lab3.part2;

public class Wedges extends Sandals {
    public Wedges(boolean isOpen) {
        super(isOpen);
    }

    @Override
    public void print() {
        System.out.println(String.format("Type of Shoes: Wedges, Is open? =  %s", isOpen()));
    }

    @Override
    public String brandName() {
        return null;
    }
}
