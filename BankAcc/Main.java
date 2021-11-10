package Udemy.BankAcc;

public class Main {
    public static void main(String[] args) {
        Bank Customer1=new Bank("5",11,"Stefan","myemail@ymail.com",123);
       //    Customer1.setCustomerName("Stefan");
        System.out.println("Customer Name: "+ Customer1.getCustomerName());
       // Customer1.setBalance(100);
        System.out.println("Available balance " + Customer1.getBalance());
        Customer1.deposit(20);
        Customer1.withdrawal(19);
        Customer1.withdrawal(102 );

        VIPcustomer vip1 = new VIPcustomer("Ivan","Ivanov",2000);
        System.out.println(vip1.getName());

        VIPcustomer vip2 = new VIPcustomer();
        System.out.println(vip2.getName());
        System.out.println(vip2.getEmail());
        System.out.println(vip2.getCreditLimit());

        VIPcustomer vip3 = new VIPcustomer("Tosho","abv@abv.bg");
        System.out.println(vip3.getName());
        System.out.println(vip3.getEmail());
        System.out.println(vip3.getCreditLimit());
    }
}
