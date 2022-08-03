package inheritance;

public class GoldCustomer extends Customer {
    private double saleRatio;

    public GoldCustomer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "Gold";
        bonusRatio = 0.03;
        saleRatio = 0.05;
    }

    public int calcPrice(int price) {
        this.price = price - (int)(price * saleRatio);
        bonusPoint += price * bonusRatio;
        return price;
    }

}
