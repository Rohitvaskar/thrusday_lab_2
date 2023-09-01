package orderrr;

import java.util.Scanner;

public class Starter_order {
	
	String item ="";
	
		public int Starter() {
			
			int choice1,val = 0;
			
		
			System.out.println("starter");
			
			Scanner dp=new Scanner(System.in);
//			Menu for Starters
	        System.out.println("1: Chicken Crispy                     150Rs");
	        System.out.println("2: Chicken Lollipop(4pc)              120Rs");
	        System.out.println("3: Chicken 65                         100Rs");
	        System.out.println("3: Chicken Chilly                     130Rs");
	        System.out.println("Select the Starters please:");
		choice1=dp.nextInt();
		switch(choice1) {
		case 1:

			item+="\nChicken Chilly 150rs" ;
			val=150;
			
			
			break;
		case 2:

			item+="\nChicken lollipop (4pc)   120rs" ;
			val=120;
			break;
		case 3:

			item+="\nChicken 65   100rs " ;
			 val=100;
			
			break;
		case 4:
			item+="\nChicken Crispy     130rs" ;
			 val=130;
			break;

		}
		return val;
		
			
		}
		

	}


