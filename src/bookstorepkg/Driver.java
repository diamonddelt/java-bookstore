package bookstorepkg;

public class Driver {
	
	private static boolean hasUserVisited = false;
	
	// NOTE: Assertions are enabled - disable them in Run Configurations -> remove "-ea" from VM config
	public static void main(String[] args) {
		
		// welcome user to the bookstore
		if (hasUserVisited != true)
		{
			
			Messages messages = new Messages();
			System.out.println(messages.getGreeting());
			
			hasUserVisited = true;
		}
	}

}
