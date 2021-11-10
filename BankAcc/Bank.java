package Udemy.BankAcc;

public class Bank {
    private String AccNum;
    private float balance;
    private String CustomerName;
    private String Email;
    private int PhoneNumber;

    public Bank(String AccNum, float balance, String CustomerName, String Email, int PhoneNumber) {
        // this("1",0,"Default","Default",000000000);  //когато конструкторът ми е празен се задават по default тези параметри
        this.AccNum = AccNum;
        this.balance = balance;
        this.CustomerName = CustomerName;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
    }

    public void deposit(float depositAmount) {
        // this.balance=depositAmount;
        balance = balance + depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance: " + balance);
    }

    public void withdrawal(float withdrawalAmount) {
        if (balance - withdrawalAmount < 0) {
            System.out.println("Can not withdraw the amount of " + withdrawalAmount + " Not enough money");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " made. New balance: " + this.balance);
        }
    }

    public String getAccNum() {
        return AccNum;
    }

    public void setAccNum(String accNum) {
        AccNum = accNum;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
