package lab3.part1;

public class Sneakers extends Shoes {
    private String SoleType = "Не указано";
    private String CompanyName = "Не указано";

    public Sneakers(Producer producer, String color) {
        super(producer, color);
    }

    public Sneakers(Producer producer, String color, int size) {
        super(producer, color, size);
    }

    public Sneakers(Producer producer, String color, int size, String soleType, String companyName) {
        super(producer, color, size);
        SoleType = soleType;
        CompanyName = companyName;
    }

    @Override
    public String brandName() {
        return "Nike";
    }

    public String getSoleType() {
        return SoleType;
    }

    public String getCompanyName() {
        return CompanyName;
    }
}
