package Udemy.BankAcc;

public class VIPcustomer {
    private String name;
    private String Email;
    private double CreditLimit;

    public VIPcustomer(){
        this("Default Name","Default email@.com",10000.02);

    }

    public VIPcustomer(String name, String Email){
        this(name,Email,10000.02);

    }

    public VIPcustomer(String name, String Email, double CreditLimit){
        this.name=name;
        this.Email=Email;
        this.CreditLimit=CreditLimit;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public double getCreditLimit() {
        return CreditLimit;
    }
}

