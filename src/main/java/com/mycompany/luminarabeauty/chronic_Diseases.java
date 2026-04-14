package com.mycompany.luminarabeauty;

public class chronic_Diseases extends Luminara_Beauty {

    protected String productComponents;
    public String Allergytype;
    public String Skintype;

    public chronic_Diseases() {
    }

    public chronic_Diseases(String productName, String productType, String productComponents,String Allergytype,String Skintype) {
        super(productName, productType);
        this.productComponents = productComponents;
        this.Allergytype=Allergytype;
        this.Skintype=Skintype;
    }

    public void warning(String Allergytype) {
        switch (Allergytype) {
            case "Almond allergy":
                System.out.println("(Kunooz)This product contains almond oil");
                break;
            case "Matcha allergy":
                System.out.println("(SUPER MATCHA)This product contains matcha");
                break;
        }
    }

    public void skin(String Skintype) {
        switch (Skintype) {
            case "Fatty":
                System.out.println("I recommend using (salicylic acid) and (benzoide peroxide) moisturizer");
                break;
            case "Dry":
                System.out.println("I recommend using (CeraVe) moisturizer");
                break;
            case "Skin burns":
                System.out.println("I recommend using skin products that contain vitamin C or glycolic acid.");
        }
    }
public String toString() {
        return super.toString() +"\n" +"productComponents:" + productComponents + "\n" + "Allergytype:" + Allergytype + "\n"+"Skintype:"+Skintype;
    }

    

    public void productName(String name) {
        System.out.println(name);
    }

    public void productType(String type) {
        System.out.println(type);
    }
}
