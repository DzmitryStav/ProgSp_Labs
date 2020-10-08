package lab3.part2;

public class Sneakers implements Shoes, Object {
    private String SoleType = "Не указано";
    private String CompanyName = "Не указано";

    public Sneakers(String soleType, String companyName) {
        SoleType = soleType;
        CompanyName = companyName;
    }

    @Override
    public void print() {
        System.out.println(String.format("Type of Shoes: Sneakers, Sole Type =  %s, Company Name: %s", SoleType, CompanyName));
    }

    @Override
    public String brandName() {
        return CompanyName;
    }
}
