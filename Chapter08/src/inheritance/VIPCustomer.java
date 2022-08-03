package inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        this.price = price - (int)(price * saleRatio);
        bonusPoint += price * bonusRatio;
        return price;
    }

    public int getAgentID() {
        return agentID;
    }
}
