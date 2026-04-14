
package com.mycompany.luminarabeauty;

public abstract class Luminara_Beauty {

    public String productName;
    public String productType;

    public Luminara_Beauty() {
    }

    public Luminara_Beauty(String productName, String productType) {
        this.productName = productName;
        this.productType = productType;
    }

    public String toString() {
        return "productName:" + productName + "\n" + "productType:" + productType;
    }

    public abstract void productName(String name);

    public abstract void productType(String type);
}
