package main;



import database.Database;
import model.customerinformation.Customerinformation;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Runautomobileshopproject {

    public static void main(String[] args) {

        Scanner commandLineScanner = new Scanner(System.in);
        System.out.println("WELCOME TO AUTOMOBILE  SHOP!");
        System.out.println("This AUTOMOBILE SHOP has Purchase of CAR and Services of CAR ,MOTORBIKE and VAN ! ");
        System.out.println("**************************************************************");

        int MAINCHOICE;
        Customerinformation customerinformation = new Customerinformation();

        Database database = new Database();

        do {
            System.out.println("MAIN MENU !");
            System.out.println("***********");
            System.out.println("ENTER YOUR CHOICE");
            System.out.println("1: VEHICLE SERVICE!");
            System.out.println("2: PURCHASE CAR!");
            System.out.println("3: EXIT");

            MAINCHOICE = commandLineScanner.nextInt();


            switch (MAINCHOICE) {

                case 1:

                    System.out.println("WELCOME TO VEHICLE SERVICE!");

                    System.out.println("ENTER YOUR CHOICE !");
                    System.out.println("1: INSERT NEW CUSTOMER !");
                    System.out.println("2: VIEW CUSTOMER !");


                    int MAINCHOICE1;
                    MAINCHOICE1 = commandLineScanner.nextInt();

                    switch (MAINCHOICE1) {

                         case 1:

                             database.addCustomer(customerinformation);

                            break;

                         case 2:

                           customerinformation.displaycustomer();

                           break;
                    }


                    break;

                case 2:

                    System.out.println("WELCOME TO PURCHASE OF CAR SERVICE!");
                    System.out.println("ENTER YOUR CHOICE !");
                    System.out.println("1: INSERT NEW CUSTOMER !");
                    System.out.println("2: VIEW CUSTOMER !");

                    break;

            }
        }
        while (MAINCHOICE != 3);

        System.out.println("THANK YOU!");


    }

        }















