import java.util.Scanner;


public class JetsApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		JetsApp ja = new JetsApp();
		AirField field = new AirField(null);
		ja.run(input, null);
	
	
	
	
	
	
	}
	public void run(Scanner input, String namef) {
		System.out.println("Welcome to cheap planes. What would you like to do?" );
		System.out.println("1.List fleet");
		System.out.println("2.Fly all jets");
		System.out.println("3.View fastest jet");
		System.out.println("4.View jet with longest range");
		System.out.println("5.Load all Cargo Jets");
		System.out.println("6.Dogfight!");
		System.out.println("7.Add a jet to Fleet");
		System.out.println("8.Remove a jet from Fleet");
		System.out.println("9.Quit");
		int select = input.nextInt();
		
		switch(select) {
		case 1 : 
			System.out.println(namef);
			
		case 2 : 
			
		case 3 : 
			
		case 4 :
			
		case 5 :
			
		case 6 :
			
		case 7 : 
		
		case 8 : 
			
		case 9 : 
			
		}
		
	}
	
}
