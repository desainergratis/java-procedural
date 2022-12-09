package com.kasir;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int foodMenu, drinkMenu;
    double customerMoney, returnMoney, food, drink,discount,bill;

    System.out.println("=== Welcome to Desainer Gratis Restaurant === \n");
    System.out.println("===== Menu ===== \n");
    System.out.println("Food \n"+ 
    "1. Fried Rice \n" +
    "2. Chicken Noodle \n" +
    "3. Meat Balls \n ");

    System.out.println("Drink \n"+ 
    "1. Orange Juice \n" +
    "2. Avocado Juice \n" +
    "3. Ice Tea \n ");

    // Using java library / class to get user input
    Scanner inputFoodMenu = new Scanner(System.in);
    Scanner inputDrinkMenu = new Scanner(System.in);
    Scanner inputCustomerMoney = new Scanner(System.in);

    System.out.print("Input Food Menu : ");
    foodMenu = inputFoodMenu.nextInt();
    System.out.print("Input Drink Menu : ");
    drinkMenu = inputDrinkMenu.nextInt();

    System.out.println();
    // Process

    switch(foodMenu) {
        case 1:
        food = 25000;
        break;
        case 2: 
        food = 15000;
        break;
        case 3:
        food = 20000;
        default: 
        food = 0;
    }

    switch(drinkMenu) {
        case 1:
        drink = 15000;
        break;
        case 2:
        drink = 20000;
        break;
        case 3:
        drink = 30000;
        break;
        default:
        drink = 0;

    }
    bill = food + drink;
    
    

    if(bill > 50000) {
        discount = bill * 0.2;
        bill = bill - discount;
        System.out.println("Total belanja : "+" Rp." +bill + "\n" +
        "Mendapatkan discount : " + "Rp."+discount);
    } else {
        System.out.println("Total belanja : "+" Rp." +bill + "\n");
    }

    System.out.print("Input customer money : ");
    customerMoney = inputCustomerMoney.nextDouble();

    returnMoney = customerMoney - bill;

    System.out.println("Total belanja : "+bill + "\n"
    + "Customer money : "+customerMoney + "\n" 
    + "Kembalian : "+returnMoney + "\n");

    System.out.println("===== Thankyou for coming to Desainer Gratis restaurant =====");

    }
}