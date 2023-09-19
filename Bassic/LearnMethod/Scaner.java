package LearnMethod;

import java.util.Scanner;  // import lab of scanner to print the input value

public class Scaner { // phương thức?
    public static void main (String[] args){
        System.out.println("Hello");
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String Name = sc.next();
        System.out.println(Name);

        System.out.println("Enter your full name: ");
        String FullName = sc.nextLine();    
        System.out.println(FullName);
        // nextLine will be ended if it has space before because space was exited when we click 'enter' after entering your Name
        
        System.out.println("Enter T or F");
        Boolean TF = sc.nextBoolean();
        System.out.println(TF);
        
        System.out.println("Enter a integer: ");
        int itger = sc.nextInt();
        System.out.println(itger);
    }
}