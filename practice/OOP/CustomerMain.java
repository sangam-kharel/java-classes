package com.mycompany.practice.OOP;
/*Create a class customer with the private instance variables name, acnum, balance
provide a parameterized method to set the customer details and another method to 
print the details of customer, Add one method void deposit (int amount) to deposit
the given amount. Print the details after withdraw. Check whether withdraw is possible or not.
In the main classs, create an object of customer set the details, print them and also
use the deposit and withdraw function.
*/
class Customer{
    private String name;
    private int acnum, balance;
    public void setCustomerDetails(String n, int a, int b){
        name = n;
        acnum = a;
        balance = b;
    }
    public void printCustomerDetails() {
        System.out.println("Name: "+name);
        System.out.println("Account Number: "+acnum);
        System.out.println("Balance: "+balance);
    }
    public void deposit(int amount){
        balance = balance + amount;
        System.out.println("Deposited amount: "+ amount);
        System.out.println("New Balance: "+balance);
    }
    public void withdraw(int amount){
        if(balance > amount)
        {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: "+ amount);
            System.out.println("New Balance after Withdraw: "+balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
}
public class CustomerMain {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.setCustomerDetails("Ram",1011, 5000);
        c.deposit(15000);
        c.withdraw(10000);
    }
    
}
