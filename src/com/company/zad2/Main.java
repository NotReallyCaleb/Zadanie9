package com.company.zad2;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Do you want to create an account?");
        boolean doCreateAccount = getYesNoAnswer();
        if(!doCreateAccount) {
            endProgram();
        }
        ACCOUNT account = createNewAccount();
        System.out.println("Do you want to withdraw?");
        boolean shouldWithdrawMoney = getYesNoAnswer();
        if(!shouldWithdrawMoney) {
            endProgram();
        }
        while (true) {
            System.out.println("Hom much do you want to withdraw?");
            try {
                int amount = getAmount();
                try {
                    account.WITHDRAW(amount);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("This is not a number!");
                }
            }catch (NumberFormatException e){
                System.out.println("This is not a number!");
            }
        }
        System.out.printf("Thank you for using our services. Your balance is: %.2f $", account.getBAL());
    }
    private static ACCOUNT createNewAccount() {
        String name = "";
        while (name.length() < 1){
            System.out.println("What is your name?");
            name = scanner.nextLine();
        }
        while (true) {
            System.out.println("How much do you want to deposit?");
            try{
                int initialAmount = getAmount();
                return new ACCOUNT(name, initialAmount);
            }catch (NumberFormatException e){
                System.out.println("This is not a number!");
            }
        }
    }
    private static void endProgram() {
        System.out.println("Thank you for using our services");
        System.exit(0);
    }
    private static int getAmount() {
        Integer x =  Integer.parseInt(scanner.nextLine());
        if (x instanceof Integer == false){
            throw new NumberFormatException();
        }
        return x;
    }
    private static boolean getYesNoAnswer() {
        String userAnswer = scanner.nextLine();
        if(userAnswer.toLowerCase().contains("y")) {
            return true;
        }else if(userAnswer.toLowerCase().contains("n")) {
            return false;
        } else {
            System.out.println("Yes or No");
            return getYesNoAnswer();
        }
    }
}
