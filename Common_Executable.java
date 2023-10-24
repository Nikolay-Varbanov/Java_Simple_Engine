import java.util.Scanner;  // Import the Scanner class

public abstract class Common_Executable  implements Executable {
	// Constructs
	public Common_Executable() {
		System.out.println("Constructing an Common_Executable");
	};
	// Facilities
	protected boolean isRunning = false;
	protected String input = "empty";
	protected Scanner inputObj = new Scanner(System.in);
	// Utilities
	protected abstract boolean OnInit();
	protected abstract boolean OnCleanUp();
	protected abstract void OnRender();
	protected void OnInput() {

		System.out.println("Common_Executable now taking input");
		this.input = this.inputObj.nextLine();
	
	};
	protected void Controller() {
		
		switch(this.input) { // Task check input
			case "/exit": // Task check for "/exit" // In all implementations
				this.OnExit();
				break;
		}
		
	};
	protected void OnExit() {
		
		System.out.println("In Common_Executable OnExit()");
		// Common exit algorithm
		System.out.println("Do you want to exit? Enter (y) to confirm"); //Task prompt for conformation "y"
		this.OnInput(); // Task check input for conformation
		if(this.input.equals("y")) {
			this.isRunning = false; //Task set Loop Controll to false
		}
	};
	
	
}