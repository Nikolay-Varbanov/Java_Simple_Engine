import java.util.Scanner;  // Import the Scanner class

public abstract class Common_Executable  implements Executable {
	// Constructs
	public Common_Executable() {
		System.out.println("Constructing an Common_Executable");
	};
	protected boolean isRunning = false;
	protected String input = "empty";
	protected Scanner inputObj = new Scanner(System.in);
	
	
}