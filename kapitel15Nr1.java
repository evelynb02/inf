

import java.util.Scanner;
public class kapitel15Nr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner eingabe= new Scanner(System.in);
int zaehler, limit; 

System.out.println("Startwert:");
zaehler= eingabe.nextInt();

System.out.println("Endwert:");
limit=eingabe.nextInt();

while (zaehler<= limit)
{
	System.out.println(zaehler);
	zaehler=zaehler+1;
			
			
}


		
	}

}
