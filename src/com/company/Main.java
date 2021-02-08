package com.company;

import javax.swing.text.Style;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        String n = sc.nextLine();
        System.out.println("Enter the date");
        String d = sc.nextLine();
        System.out.println("Enter the number of guests");
        int g = sc.nextInt();

        System.out.println("Happy Events");
        System.out.println("Name of the customer: "+n);
        System.out.println("Date of the event: "+d);
        System.out.println("No. of guests: "+g);
        if(g < 50){
            System.out.println("Total Amount: Rs."+(350*g));
        }
        else if(g>=50 && g<=99){
            System.out.println("Total Amount: Rs."+(350*g)*112/100);
        }
        else if(g>=100 && g<=149){
            System.out.println("Total Amount: Rs."+(350*g)*115/100);
        }
        else if(g>=150 && g<=200){
            System.out.println("Total Amount: Rs."+(350*g)*118/100);
        }
        else {
            System.out.println("Check for a separate plan");
        }
    }
}
