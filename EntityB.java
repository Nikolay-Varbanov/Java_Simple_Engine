public class EntityB extends Common_Executable {
	// constructs
	public EntityB() { System.out.println("Constructing an EntityB");	}
	// facilities
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
	protected boolean OnInit() { 
		return false;
	};
	protected boolean OnCleanUp() {
		return false;
	};
	@Override
	protected void OnInput() {

		System.out.println("EntityB now taking input");
		super.OnInput();

	};
	protected void OnRender() { 

		System.out.println("EntityB Reporting for duty"); 
		System.out.println("input was: "); 
		System.out.println(super.input);
		System.out.printf("isRunning is: %s%n", super.isRunning);
		System.out.println("EntityB Reporting ends here");

	};
	@Override
	protected void Controller() { // implementations
		
		super.Controller();
		
	};
	@Override
	protected void OnExit() {

		System.out.println("In EnitityB OnExit()");
		super.OnExit();
		
	};
}