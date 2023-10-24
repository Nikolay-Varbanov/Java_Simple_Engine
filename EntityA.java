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
	protected boolean OnInit() { 
		return false; 
	};
	protected boolean OnCleanUp() { 
		return false;
	};
	@Override
	protected void OnInput() {

		System.out.println("EntityA now taking input");
		super.OnInput();

	};
	protected void OnRender() { 

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
		super.OnExit();

	};
}