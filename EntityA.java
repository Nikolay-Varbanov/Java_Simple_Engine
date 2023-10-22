public class EntityA implements Executable {
	// constructs
	public EntityA() { System.out.println("Constructing an EntityA");	};
	// facilities
	private String input = "empty";
	// utilities
	public void OnExecute() {
		
		System.out.println("EntityA now executing");
		
		this.OnInput();
		
		this.OnRender();
		
	};
	private void OnInput() {
		System.out.println("EntityA now taking input");
		this.input = this.inputObj.nextLine();
	};
	private void OnRender() { 
		System.out.println("EntityA Reporting for duty"); 
		System.out.println("input was: "); 
		System.out.println(input); 
	};
}