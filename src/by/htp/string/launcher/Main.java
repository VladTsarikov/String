package by.htp.string.launcher;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		System.out.println("Enter text string");
        Scanner sc1 = new Scanner(System.in);
        String text = sc1.nextLine();
        String[] textChar= text.split(" ");

        System.out.println("Enter number");
        Scanner sc2 = new Scanner(System.in);
        int n = sc2.nextInt();

        System.out.println("Enter symbol");
        Scanner sc3 = new Scanner(System.in);
        char symbol = sc3.next().charAt(0);

        for(int i = 0; i<textChar.length; i++) {
        	
            String newTextChat [] = new String[textChar.length];
            //if(textChar[i].length()>n)
            //{
            	//newTextChat[i] = textChar[i].substring(0,n) + symbol + textChar[i].substring(n+1);
           // }
            //else{
            	newTextChat[i] = textChar[i];
           // }
            System.out.print(newTextChat[i]+ " ");
        }

    }
}
