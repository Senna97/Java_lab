package witharraylist;

public class VIPCustomer extends Customer {
    private int agentID;
    private double saleRatio;

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * saleRatio);

    }

    public void showCustomerInfo() {
        super.showCustomerInfo();
        System.out.println("(+ 담당 전문 상담원의 아이디는 " + agentID + "입니다.)");
    }

    public int getAgentID() {
        return agentID;
    }
}
