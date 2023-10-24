public class EntityB extends Common_Executable {
	// constructs
	public EntityB() { System.out.println("Constructing an EntityB");	}
	// facilities
	//private String input = "empty";
	// Utilities
	public void OnExecute() {
		
		super.isRunning = true;
		
		System.out.println("EntityB now executing");
		
		while(super.isRunning) {
			
				this.OnInput();
			
				this.Controller();
				
				this.OnRender();
			
		}
		
	};
	private void OnInput() {
		System.out.println("EntityB now taking input");
		super.input = super.inputObj.nextLine();
	};
	private void OnRender() { 
		System.out.println("EntityB Reporting for duty"); 
		System.out.println("input was: "); 
		System.out.println(super.input);
		System.out.printf("isRunning is: %s%n", super.isRunning);
		System.out.println("EntityB Reporting ends here");
	};
	private void Controller() { // implementations
		switch(super.input) { // Task check input
			case "/exit": // Task check for "/exit" // In all implementations
				System.out.println("Do you want to exit EntityB? enter (y) to confirm"); //Task prompt for conformation "y"
				this.OnInput(); // Task check input for conformation
				if(super.input.equals("y")) {
					super.isRunning = false; //Task set Loop Controll to false
				}
				break;
		}
	};
}