package SimpleEX;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean IsRunning  = true;

        while (IsRunning){
            System.out.println("-----------------------Welcome to my program-----------------------");

            System.out.println("1 Calculate addition, subtraction, multiplication and division");
            System.out.println("2 Print full name");
            System.out.println("3 Calculate attendance score, midterm and final term then print course score");
            System.out.println("4 Enter full name to check whether it exists in the initialization list or not");
            System.out.println("0 Exit program");
            System.out.println("Enter your choice");

            int choice = sn.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter a and b value. Then print result of sum, sub, div and mul value.\n");
                    System.out.println("Enter a, b value: ");

                    int a = sn.nextInt();
                    int b = sn.nextInt();
                
                    int sum = a + b;
                    int mul = a * b;
                    float div =  (float)a / b;
                    int sub = a - b;
                    break;
                case 2:
                    System.out.println("\nEnter full name and print fully");
                    System.out.println("Enter your full name: ");
                    sn.nextLine(); // clear cache
                    String FullName = sn.nextLine();
                    System.out.println("Your name is "+ FullName);
                    break;
                case 3:
                    System.out.println("\n\nEnter the attendance score, midterm and final term then print course score: ");
                    float as , mt, ft, mediumS;
                    as = sn.nextFloat();
                    mt = sn.nextFloat();
                    ft = sn.nextFloat();
                    mediumS = (as + mt + (ft*3))/5;
                    System.out.println("Medium score is "+ mediumS);
                    break;
                case 4:
                    System.out.println("\nEnter the full name to check whether it exists in the initialization list or not");

                    ArrayList<String> FullNameList = new ArrayList<>();

                    FullNameList.add("To Thien Nhan");
                    FullNameList.add("Trong Tin");
                    FullNameList.add("Tan Luc");
                    FullNameList.add("To Ngoc Duyen");
                    System.out.println("Enter full name that we want to check: ");
                    sn.nextLine();
                    String CheckFullName = sn.nextLine();


                    if (FullNameList.contains(CheckFullName)){
                        System.out.println("Yes");
                    }
                    else {
                        System.out.println("No");
                    }
                    break;
                    default:
                        System.out.println("Unvalid choice");
            }
        }
        sn.close();    
        
    }
}
