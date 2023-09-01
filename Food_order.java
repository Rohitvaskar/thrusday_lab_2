package orderrr;

import java.util.Scanner;

public class Food_order {
	
	public static void main(String args[]) {
		
	}

		public static void main_order() {
//			Calling the Method
			 Starter_order obj=new Starter_order();
			 Maincourse_order obj1=new Maincourse_order();
			 Deserts_order obj2=new Deserts_order();
			 Drinks_order obj3=new Drinks_order();
//			 Variables
			 int choice ,repeat ;
			 int TotalBill = 0;
			 
			Scanner sc=new Scanner(System.in);
			 
			 do {
				 System.out.println(" \t\t\t\t\t Khaa K Jaooo");
		            System.out.println("\nWelcome to our Restaurant");
		            System.out.println("1: Starter\n2: Maincourse\n3: Desert\n4: Drinks");
		            System.out.println("Enter the number:");
					choice=sc.nextInt();
	         switch(choice) {
	         case 1:
//	         Starters
	         int val = obj.Starter();
	         System.out.println(obj.item);
	       	 TotalBill+=val;
	       	  
	          break;
	         case 2:
//	         Maincourse
	       	 int val1 =obj1.main_course();
	       	 System.out.println(obj1.item);
	      	 TotalBill+=val1;
	       	  
	       	  
	       	 break;
	         case 3:
//	         Desert
	       	 int val2 =obj2.desert();
	       	 System.out.println(obj2.item);
	     	 TotalBill+=val2;
	       	  break;
	       	 
	         case 4:
//	         Drinks
	       	 int val3=obj3.drink();
	       	 System.out.println(obj3.item);
	     	 TotalBill+=val3;
	       	 break;
	         }
	         
			 System.out.println("\n\nDo you want to order any other item...(y / n):");
			 repeat = sc.next().charAt(0);
				
				
//			 Asking for more order
		 }while(repeat == 'Y' || repeat == 'y');

             
		 System.out.println("\nselected item from starter \n"+obj.item);
		 System.out.println("\nselected item from main menu \n"+obj1.item);
		 System.out.println("\nselected item from deserts \n"+obj2.item);
		 System.out.println("\nselected item from drinks \n"+obj3.item);
		 
//		 TotalBill
   		 System.out.println("\nYour Totalbill is            "+TotalBill);
			
		 }
	}

	



