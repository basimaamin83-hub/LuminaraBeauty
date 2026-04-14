package com.mycompany.luminarabeauty;

public class customers extends Luminara_Beauty implements OrderPrice {

    private String name;
    private String Phone;
    private double Orderprice;

    public customers() {
    }

    public customers(String productName, String productType, String name, String phone, double Orderprice) {
        super(productName, productType);
        this.name = name;
        this.Orderprice = Orderprice;
        setPhone(phone);
    }

    public String getPhone() {
        return Phone;
    }

    public String getName() {
        return name;
    }

    public double getOrderprice() {
        return Orderprice;
    }

    public void setPhone(String phone) {
        if (phone.length() == 10) {
            this.Phone = phone;
        } else {
            System.out.println("The number entered does not match the condition");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrderprice(double Orderprice) {
        this.Orderprice = Orderprice;
    }

    public void productName(String name) {
        System.out.println(name);
    }

    public void productType(String type) {
        System.out.println(type);
    }

    public void CalaculatePrice(double Number_products, double productPrice) {
        if (Number_products == 1) {
            Orderprice = 10 + 2 + productPrice;
            System.out.println("Orderprice:" + Orderprice + " JD");
        } else if (Number_products == 2) {
            Orderprice = 20 + 2 + productPrice;
            System.out.println("Orderprice:" + Orderprice + " JD");
        } else if (Number_products == 3) {
            Orderprice = 30 + 2 + productPrice;
            System.out.println("Orderprice:" + Orderprice + " JD");
        } else {
            System.out.println("There are no offers");
        }
    }

    public String tostring() {
        return super.toString() + "name:" + name + "\n" + "phone:" + Phone + "\n" + "Orderprice:" + Orderprice;
    }

    @Override
    public void CalaculatePrice(double Number_products) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
