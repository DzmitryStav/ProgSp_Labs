package lab3.part2;

public class flipFlops extends Sandals {

    public flipFlops(boolean isOpen) {
        super(isOpen);
    }

    @Override
    public void print() {
        System.out.println(String.format("Type of Shoes: flip Flops, Is open? =  %s", isOpen()));
    }

    @Override
    public String brandName() {
        return null;
    }
}
