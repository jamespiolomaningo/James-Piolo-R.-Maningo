import java.util.Scanner;
public class LabExer1B{
	public static void main(String[]args){
		
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter a Number: ");
		 int num = scan.nextInt();
		 
		 showNumberPlus10(num);
		 showNumberPlus100(num);
		 showNumberPlus1000(num);
		 
		 
		 	
		 	
		 	
	  }
	  		
			 public static void showNumberPlus10(int piolo)
			 	{
			 		 int pio = piolo + 10;
			 		System.out.println(piolo + " plus 10 is " + pio); 
			 	}
		   	public static void showNumberPlus100(int piolo1)
				{
				 	 int pio1 = piolo1+ 100;
				 	 System.out.println(piolo1 + " plus 100 is " + pio1);
				}
			public static void showNumberPlus1000(int piolo2)
				{
					int pio2 = piolo2 + 1000;
					System.out.println(piolo2 + " plus 1000 is " + pio2);	
				}	

}

