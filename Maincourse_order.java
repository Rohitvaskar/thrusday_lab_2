package orderrr;

import java.util.Scanner;


public class Maincourse_order {
	
	String item ="";
	
		public int main_course() {
			int choice2,val=0;
			 System.out.println("main course");
//				Menu for Maincourse
				Scanner main=new Scanner(System.in);
				System.out.println("1: Chicken Biryani                   180Rs");
		        System.out.println("2: Chinese                           120Rs");
		        System.out.println("3: Chicken Thali                     150Rs");
		        System.out.println("3: Butter Chicken                    100Rs");
		        System.out.println("Select the dish please:");
			choice2=main.nextInt();
			switch(choice2) {
			case 1:
				
				item+="\n Chicken biryani  180rs";
			    val=180;
				break;
			case 2:
				
				item+="\n Chinese   120rs";
				val=120;
				break;
			case 3:
				
				item+="\n Chicken Thali    150rs  rs";
				val=150;
				break;
			case 4:
				
				item+="\n Butter Chicken    100rs";
			    val=100;
				break;
			}
			return val;
		 }
	 }


