package com.company.zad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Name: ");
            String NAME = scan.nextLine();
            System.out.println("Last name: ");
            String LAST_NAME = scan.nextLine();
            System.out.println("Date of Birth");
            int DATE_OF_BIRTH = scan.nextInt();

            try {
                PERSON prsn = new PERSON(NAME, LAST_NAME, DATE_OF_BIRTH);
                System.out.println(prsn);
                break;
            }
            catch (IllegalArgumentException E) {
                System.out.println(E.getMessage());
            }
        }

    }
}
