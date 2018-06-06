import java.util.Scanner;  

public class Divisibility {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%3==0 && num%5==0){
			
		  System.out.println("Acadview learning");
		}	
		else if (num % 3 == 0) {
		
			System.out.print("Acadview ");
		}
		else if( num % 5 == 0) {
		
			System.out.print("Learning");
		}
	}
}
