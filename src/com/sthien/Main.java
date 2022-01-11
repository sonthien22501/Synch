package com.sthien;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(90);
        Customer customer1 = new Customer("Thien", account);
        Customer customer2 = new Customer("Nhi", account);

        Thread thread1 = new Thread(customer1);
        Thread thread2 = new Thread(customer2);

        thread1.start();
        thread2.start();
    }
}
