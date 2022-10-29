package com.example.java2022homework3;

public class CustomerManager {
    private Customer _customer;
    private CredittManager _creditmanager;
    public CustomerManager(Customer customer){
        _customer=customer;
        _creditmanager=credittManager;
    }
    public void Save(Customer customer){
        System.out.println("Müşteri Kaydedildi" +_customer.LastName);
    }

    public void Delete(Customer customer){
        System.out.println("Müşteri Silindi" +_customer.LastName);
    }

    public void  GiveCredit(){
        _creditmanager.Calculate();
    }
}
