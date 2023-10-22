public class EntityB implements Executable {
	// constructs
	public EntityB() { System.out.println("Constructing an EntityB");	}
	// facilities
	private String input = "empty";
	// Utilities
	public void OnExecute() {
		
		System.out.println("EntityB now executing");
		
		this.OnInput();
		
		this.OnRender();
		
	};
	private void OnInput() {
		System.out.println("EntityB now taking input");
		this.input = this.inputObj.nextLine();
	};
	private void OnRender() { 
		System.out.println("EntityB Reporting for duty"); 
		System.out.println("input was: "); 
		System.out.println(input); 
	};
}