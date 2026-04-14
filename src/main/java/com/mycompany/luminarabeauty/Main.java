package com.mycompany.luminarabeauty;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Luminara_Beauty obj1 = new customers();
        obj1.productName("Product Name: SOME BY MI");
        obj1.productType("Product Type: TO Treat Pimples");
        System.out.println("--------------------------");
        System.out.print("Enter Name:");
        String name = in.nextLine();
        System.out.print("Enter Phone:");
        String phone = in.nextLine();
        System.out.println("---------------------------");
        customers obj2 = new customers("TO Treat Pimples", "SOME BY MI", name, phone, 0);
        System.out.println(obj2.toString());
        System.out.println("Enter Number of products:");
        double Number_products = in.nextDouble();
        System.out.println("----------------------------");
        System.out.println("Enter product size:");
        int size = in.nextInt();
        products obj3 = new products("SOME BY MI", "TO Treat Pimples", size, 0);
        double productPrice = obj3.sizeprice(size);
        System.out.println(obj3.toString());

        obj2.CalaculatePrice(Number_products, productPrice);

        System.out.println("----------------------------");
        chronic_Diseases obj4 = new chronic_Diseases();
        obj4.warning("Allergytype");
        obj4.skin("Skintype");

        Luminara_Beauty obj5[] = new Luminara_Beauty[3];
        obj5[0] = new customers("LunaMoist", "Facial Moisturizing Cream", name, phone, 0);
        obj5[1] = new products("LunaMoist", "Facial Moisturizing Cream", size, 20);
        obj5[2] = new chronic_Diseases("LunaMoist", "Facial Moisturizing Cream", "Argan oil and shea butter","Matcha allergy","Dry");

        for (int i = 0; i < obj5.length; i++) {
            System.out.println(obj5[i].toString());
            System.out.println("-------------------------");
        }
    }
}
