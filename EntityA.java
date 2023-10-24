public class EntityA extends Common_Executable {
	// constructs
	public EntityA() { System.out.println("Constructing an EntityA");	};
	// facilities
	// utilities
	public void OnExecute() {
		
		super.isRunning = true;
		
		System.out.println("EntityA now executing");
		
		while(super.isRunning) {
			
				this.OnInput();
			
				this.Controller();
				
				this.OnRender();
			
		}
		
	};
	@Override
	protected void OnInput() {

		System.out.println("EntityA now taking input");
		super.OnInput();

	};
	private void OnRender() { 

		System.out.println("EntityA Reporting for duty"); 
		System.out.println("input was: "); 
		System.out.println(input); 
		System.out.printf("isRunning is: %s%n", super.isRunning);
		System.out.println("EntityA Reporting ends here");
	
	};
	@Override
	protected void Controller() { // implementations
		
		super.Controller();
	
	};
	@Override
	protected void OnExit() {

		System.out.println("In EnitityA OnExit()");
		System.out.println("Do you want to exit EntityList? enter (y) to confirm"); //Task prompt for conformation "y"
		this.OnInput(); // Task check input for conformation
		if(super.input.equals("y")) {
			super.isRunning = false; //Task set Loop Controll to false
		}

	};
}