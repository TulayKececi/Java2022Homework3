package com.example.java2022homework3;

public class Main {
    public static void main(String[] args) {



        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;
        System.out.println(sayi1);

        CreditManager creditManager=new CreditManager();
        creditManager.Hesapla();

        Customer customer = new Customer();
        customer.Id=1;
        customer.FirstName="Tulay";
        customer.LastName="Kececi";


        Company company= new Company();
        company.Id=100;
        company.CompanyName="Arcelik";
        company.TaxNumber="1000";

        CustomerManager customerManager2=new CustomerManager(customer);



        CustomerManager customerManager=new CustomerManager(customer);
        customerManager.Save(customer);
        customerManager.Delete(customer);

    }

}
