package Chimera.tech;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean stop = false;
            System.out.println("Quadsar/AldibahDev encryption test algorithm");
            System.out.println("This program takes an input string and shifts each character in that string to the right by an integer" +
                    "provided by the user.");
            String directions = "Enter 1 to display functions: \n" +
                    "Enter 2 to enter a string and have it encrypted: \n" +
                    "Enter 3 to decrypt the last string encrypted: \n" +
                    "Enter 4 to quit. ";
            System.out.println(directions);
            while(!stop) {
                Scanner scanner = new Scanner(System.in);
                int choice = scanner.nextInt();
                int used = 0;
                switch (choice) {
                    case 1:
                        System.out.println(directions);
                        break;

                    case 2:
                        Scanner sc1 = new Scanner(System.in);
                        System.out.println("Enter in a String to be encrypted: ");
                        String initial = sc1.nextLine();
                        System.out.println("How many characters would you like to shift by? ");
                        int shift1 = sc1.nextInt();

                        System.out.println("Your encrypted string is: ");
                        encryptString(shift1, initial);
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println(directions);
                        System.out.println("------------------------------------------------------------------------------");
                        used = 1;
                        break;

                    case 3:
                        if(used == 0) {
                            System.out.println("You have not encrypted any strings. Please use the second function. ");
                            break;
                        }
                        Scanner sc2 = new Scanner(System.in);
                        System.out.println("Enter the result string from a previous encryption. ");
                        String result = sc2.nextLine();
                        System.out.println("Enter the initial character count shifted by. ");
                        int end = sc2.nextInt();
                        System.out.println("Your decrypted string is: ");
                        decryptString(end, result);
                        System.out.println("------------------------------------------------------------------------------");
                        System.out.println(directions);
                        System.out.println("------------------------------------------------------------------------------");
                        break;

                    case 4:
                        System.out.println("Closing. ");
                        stop = true;
                        break;

                }


            }
        
    }

    public static int encryptString(int factor, String message) {
        char[] ch = new char[message.length()];
        for(int i = 0; i < ch.length; i++) {
            ch[i] = (char) (message.charAt(i) + factor);

        }
        String result = new String(ch);
        System.out.println(result);



        return factor;
    }

    public static void decryptString(int factor, String message) {
        encryptString(factor*-1, message);
    }




}
