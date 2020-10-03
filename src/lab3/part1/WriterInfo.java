package lab3.part1;


public class WriterInfo {
    public static void main(String[] args) {
        Sandals sandals = new Sandals(Producer.AMERICA, "Black", 9, true);
        System.out.println(String.format("Sandals: producer - %s, brand: %s, color - %s, size - %d, is Open? - %s.",
                sandals.getProducer().toString(), sandals.brandName(),sandals.getColor(), sandals.getSize(), Boolean.toString(sandals.isOpen())));

        Boots boots = new Boots(Producer.CHINA, "White", 10, 5, "Winter");
        System.out.println(String.format("Boots: producer - %s, brand: %s, color - %s, size - %d, heel size - %s, type - %s.",
                boots.getProducer().toString(), boots.brandName(),boots.getColor(), boots.getSize(), boots.getHeelSize(), boots.getType()));

        Sneakers sneakers = new Sneakers(Producer.BELARUS, "Red", 11, "flat", "Nike");
        System.out.println(String.format("Sneakers: producer - %s, brand: %s, color - %s, size - %d, sole type - %s.",
                sneakers.getProducer().toString(), sneakers.brandName(), sneakers.getColor(), sneakers.getSize(), sneakers.getSoleType()));
    }
}
