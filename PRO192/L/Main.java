package L;

import javax.security.auth.Subject;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sn = new Scanner(System.in);
        Person student = null;


        while (true) {
            System.out.println("\nWelcome to my program");
            System.out.println("Enter 1 to enter your information");
            System.out.println("Enter 2 to change information");
            System.out.println("Enter 3 to dislay your information");
            System.out.println("Enter 4 to enter subject");
            System.out.println("Enter 5 to show subject");

            System.out.println("Enter 'Out' to exit program");
            System.out.print("Enter your choice: ");
            String choice1 = sn.nextLine();
            switch (choice1) {
                case "1":
                System.out.print("Enter your email: ");
                String email = sn.nextLine();

                System.out.print("Enter your full name: ");
                String fullName = sn.nextLine();

                System.out.print("Enter your gender: ");
                String gender = sn.nextLine();

                System.out.print("Enter your phone number: ");
                String phoneNumber = sn.nextLine();

                System.out.print("Enter your address: ");
                String address = sn.nextLine();

                System.out.print("Enter your birthday: ");
                String birthday = sn.nextLine();

                student = new Person (email, fullName, gender, phoneNumber, address, birthday);
                break;

                case "2":
                while (true){
                    System.out.println("Enter 1 to change your phone number");
                    System.out.println("Enter 2 to change your address");
                    System.out.println("Enter 3 to display your changing");
                    System.out.println("Enter 'Out' to exit your changing");
                    System.out.println("Enter your changing: ");
                    String choice2 = sn.nextLine();
                    switch (choice2){
                        case "1":
                            System.out.println("Enter your phone number: ");
                            String newPhoneNumber = sn.nextLine();
                            student.changePhoneNumber(newPhoneNumber);
                        break;

                        case "2":
                            System.out.println("Enter your address: ");
                            System.out.println("Enter your address: ");
                            String newAddress = sn.nextLine();
                            student.changeAddress(newAddress);
                        break;

                        case "3":
                            System.out.println("Information was changed");
                            student.showInformation();
                        break;
                        case "Out":
                            System.out.println("Exited successfully");
                        break;
                        default:
                            System.out.println("INVALID CHOICE. PLEASE ENTER AGAIN.");
                    }
                    if (choice2.equals("Out")){
                        break;
                    }
                }
                case "3":
                    System.out.println("Information that you were enter");
                    student.showInformation();
                break;

                case "4":
                    System.out.print("Enter subject number: ");
                    int n = sn.nextInt();
                    sn.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Enter your subject: ");
                        String subject = sn.nextLine();
                        Lecturer.enterSubject(subject);
                    }
                break;

                case "5":
                    Lecturer.showSubject();
                break;

                case "6":

                break;
                case "Out":
                    System.out.println("Exit successfully");
                    return;

                default:
                    System.out.println("INVALID CHOICE. PLEASE ENTER AGAIN.");
                break;

            }
        }




    }
}
