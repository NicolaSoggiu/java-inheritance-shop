package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {

        Product[] cart = new Product[100];
        int count = 0;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Which product do you want to buy?");
            System.out.println("1. Smartphone");
            System.out.println("2. Tv");
            System.out.println("3. Headphones");
            System.out.println("4. End");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.println("Enter the name of the smartphone: ");
                String name = scan.nextLine();
                System.out.println("Enter the description of the smartphone: ");
                String description = scan.nextLine();
                System.out.println("Enter the price: ");
                BigDecimal price = scan.nextBigDecimal();
                System.out.println("Enter the vat: ");
                double vat = scan.nextDouble();
                System.out.println("Enter the IMEI code: ");
                int ImeiCode = scan.nextInt();
                System.out.println("Enter the memory (gb): ");
                int memory = scan.nextInt();
                Smartphone smartphone = new Smartphone(name, description, price, new BigDecimal(vat), ImeiCode, memory );
                cart[count] = smartphone;
                count++;
                System.out.println(smartphone);
            } else if (choice == 2) {
                System.out.print("Enter the name of the TV: ");
                String TvName = scan.nextLine();
                System.out.print("Enter the description of the TV: ");
                String TvDescription = scan.nextLine();
                System.out.print("Enter the price: ");
                BigDecimal TvPrice = scan.nextBigDecimal();
                System.out.print("Enter the vat: ");
                double TvVat = scan.nextInt();
                System.out.print("Enter the dimension of the TV: ");
                int dimension = scan.nextInt();
                System.out.print("Is a smart TV? Insert (true) for yes or (false) for not: ");
                boolean smart = scan.nextBoolean();
                Tv tv = new Tv(TvName, TvDescription, TvPrice, new BigDecimal(TvVat), dimension, smart);
                cart[count] = tv;
                count++;
                System.out.println(tv);
            } else if (choice == 3) {
                System.out.print("Enter the name of the headphones: ");
                String headName = scan.nextLine();
                System.out.print("Enter the description of the headphones: ");
                String headDescription = scan.nextLine();
                System.out.print("Enter the price: ");
                BigDecimal headPrice = scan.nextBigDecimal();
                scan.nextLine(); // Pulisci la riga vuota
                System.out.print("Enter the vat: ");
                double headVat = scan.nextDouble();
                scan.nextLine(); // Pulisci la riga vuota
                System.out.print("Enter the color: ");
                String color = scan.nextLine();
                System.out.print("Is wireless? Insert true for yes or false for not: ");
                boolean wireless = scan.nextBoolean();
                Headphones headphones = new Headphones(headName, headDescription, headPrice, new BigDecimal(headVat), color, wireless);
                cart[count] = headphones;
                count++;
                System.out.println(headphones);
            } else if (choice == 4) {
                System.out.println("Goodbye");
                break;
            }
        }

        // inserisco i prodotti nel carrello
        System.out.println("The products in the cart are: ");
        for (int i = 0; i < count; i++) {
            System.out.println(cart[i].getFullName());
        }

        // stampo il totale dei prodotti
        BigDecimal total = BigDecimal.ZERO;
        for (int i = 0; i < count; i++) {
            total = total.add(cart[i].getPrice());
        }
        System.out.println("Il totale dei prodotti nel carrello è: " + total + "€");

        scan.close();
    }
}
