package com.amdocs;
import java.util.Scanner;;
public class Main {
	public static void displayMenu() {
		
		System.out.println("main menu");
		System.out.println("quickSort");
		System.out.println("bubbleSort");
		System.out.println("heapSort");
		System.out.println("exit");
	}
	
	
	
	
public static int getChoice() {
	
	System.out.println("Enter your choice:");
    Scanner sc=new Scanner(System.in);
    
    return sc.nextInt();
}

public static void doWork(int choice) {
	IAalgorithm algo=AlgorithmFactor.getAlgorithm(choice);
	algo.sort();
}

public static void main(String[] args) {
	int choice=0;
	while(choice!=4) {
		displayMenu();
		choice=getChoice();
		
		if(choice!=4)
         doWork(choice);
	}
   System.out.println("Application exited successfully");

}


}
