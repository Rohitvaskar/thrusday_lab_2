package orderrr;

import java.util.Scanner;

public class Deserts_order {
	
	String item ="";
			 public int desert() {
				 int choice4,val=0;
				 System.out.println("desert");
//				 Menu for deserts
					Scanner d=new Scanner(System.in);
					System.out.println("1: Rasmalai                     60Rs");
			        System.out.println("2: Ice cream                    70Rs");
			        System.out.println("3: Gulab jamun                  30Rs");
			        System.out.println("3: Rasgulla                     50Rs");
			        System.out.println("Select the Deserts please:");

				choice4=d.nextInt();
				switch(choice4) {
				case 1:
					
					item+="\nRasmalai   60 rs";
					val=60;
					break;
				case 2:
					
					item+="\n Ice cream   70rs";
					val=70;
					break;
				case 3:
					
					item+="\n Gulab jamun    30rs";
					val=30;
					break;
				case 4:
					
					item+="\n Rasgulla  50rs";
					val=50;
					break;
				}
				return val;
			 }
		 }


