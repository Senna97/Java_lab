package inheritance;

import java.util.ArrayList;

public class CustomerTest1 {
    public static void main(String[] args) {
        Customer customerLee = new Customer(10100, "LEE");
        customerLee.calcPrice(10000);


        VIPCustomer customerKim = new VIPCustomer(10101, "KIM");

        customerLee.showCustomerInfo();
        customerKim.showCustomerInfo();
    }
}
