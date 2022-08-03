package witharraylist;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {
        ArrayList<Customer> CustomerList = new ArrayList<Customer>();

        Customer customerKim = new Customer(1001, "KIM");
        Customer customerLee = new Customer(1002, "LEE");
        GoldCustomer customerPark = new GoldCustomer(1003, "PARK");
        GoldCustomer customerJung = new GoldCustomer(1004, "JUNG");
        VIPCustomer customerChoi = new VIPCustomer(1005, "CHOI", 10001);

        CustomerList.add(customerKim);
        CustomerList.add(customerLee);
        CustomerList.add(customerPark);
        CustomerList.add(customerJung);
        CustomerList.add(customerChoi);

        System.out.println("================== 고객 정보 출력 ==================");
        for(Customer customer : CustomerList) {
            customer.showCustomerInfo();
            System.out.println();
        }

        System.out.println("============== 할인율과 보너스 포인트 결과 ==============");
        int price = 10000;
        for (Customer customer : CustomerList) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + "원을 지불하셨습니다.");
            customer.showCustomerInfo();
            System.out.println();
        }
    }
}