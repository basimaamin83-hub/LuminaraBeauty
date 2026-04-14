package com.mycompany.luminarabeauty;

public class products extends Luminara_Beauty {

    public int size;
    public double productprice;

    public products() {
    }

    public products(String productName, String productType, int size, double productprice) {
        super(productName, productType);
        this.size = size;
        this.productprice =productprice;
    }
    public double sizeprice(int size) {
        if (size >= 50 && size <= 70) {
            productprice = 10;
        } else if (size > 70 && size <= 100) {
            productprice = 20;
        } else if (size > 100 && size <= 200) {
            productprice = 30;
        } else {
            System.out.println("There is no such size");
            productprice = 0;
        }
        return productprice;
    
          
     }

    
    public String toString() {
        return super.toString() + "\n" + "size:" + size +"\n"+ "productprice:" + productprice+"JD";
    }

    public void productName(String name) {
        System.out.println(name);
    }

    public void productType(String type) {
        System.out.println(type);
    }
}
