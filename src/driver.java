import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		Boolean again = false;
		
		do {
			String manu;
			String model;
			double price;
			String carry;
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Who made your phone?");
			manu = scan.nextLine();
			System.out.println("What model is your phone?");
			model = scan.nextLine();
			System.out.println("Who is your carrier?");
			carry = scan.nextLine();
			System.out.println("How much is your phone?");
			price = scan.nextDouble();
			
			MobilePhone phone = new MobilePhone(manu, model, price, carry);
			phone.call("555-555-6666");
			phone.text("This is a test text message");
			System.out.println(phone.toString());
			
			System.out.println("Create a new phone? (true or false)");
			again = scan.nextBoolean();
		} while (again);
	}
}
