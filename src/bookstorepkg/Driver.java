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
			
			// Testing first type of built-in assertion - assert that the hasUserVisited value is indeed true
			assert (hasUserVisited == true);
			
			// Testing second type of built-in assertion - assert that the hasUserVisited value is indeed true
			// Syntax is: assert Expression1 : Expression2
			// Where Expression1 is the actual test, and Expression2 is the detailed message thrown in the Exception
			assert (hasUserVisited == false) : ("hasUserVisited is current set to: " + hasUserVisited);
		}
	}

}
