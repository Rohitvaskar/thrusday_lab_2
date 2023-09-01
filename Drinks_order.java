package orderrr;

import java.util.Scanner;

public class Drinks_order {
	
	String item ="";
	
			 public  int drink() {
			int choice3,val=0;
			 System.out.println("drinks");
//			 Menu for Drinks
				
				Scanner dr=new Scanner(System.in);
				System.out.println("1: Water                        20Rs");
		        System.out.println("2: Coke                         50Rs");
		        System.out.println("3: ThumpsUp                     40Rs");
		        System.out.println("3: Sprite                       50Rs");
		        System.out.println("Select the Drinks please:");
			choice3=dr.nextInt();
			switch(choice3) {
			case 1:
				
				item+="\n Water   20 rs";
				val=20;
				break;
			case 2:
				
				item+="\n Coke   50rs";
				val=50;
				break;
			case 3:
				
				item+="\n Thumpsup     40rs\"";
				val=40;
				break;
			case 4:
				
				item+="\n Sprite    50rs";
				val=50;
				break;
			}
			return val;
		 }
		 

}
