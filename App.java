
public class App {

	public static void main(String[] args) {
		
		double itemPrice = 549.99;

		double moneyInWallet = 1200.94;
	
		int numberOfFriends = 6;
		
		int age = 23;

	    String firstName = "Brandelyn";
	
		String lastName = "Duenckel";

		String middleInitial = "M";

		double newAmountOfMoney = moneyInWallet - itemPrice;

		int friendsEachYear = age / numberOfFriends;
		
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		System.out.println("My name is " + fullName);
		
		System.out.println("My Age is "+ age + " years old");
		
		System.out.println("I have " + numberOfFriends + " friends");
		
		System.out.println("Ive made about " + friendsEachYear + " friends each year");
		
		System.out.println("I have $" + moneyInWallet + " in my wallet");
		
		System.out.println("I want to buy a new dyson blow dryer it is only $" + itemPrice );
		
		System.out.println("I bought the dyson blow dryer now i only have $" + newAmountOfMoney + " in my wallet");
		
		
		
	
		
		

	}

}
