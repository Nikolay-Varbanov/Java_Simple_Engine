public class EntityList implements Executable {
	// Constructs
	public EntityList() { 
		System.out.println("Constructing an EntityList");	
	}
	// Facilities
	private String input = "empty";
	private int listSize = 0;
	private int listCurrsor = 0;
	private boolean isRunning = false;
	private Executable myExecutables[];
	// Utilitites
	public void OnExecute() {
		
		this.isRunning = true;
		
		System.out.println("EntityList now executing");
		
		while(this.isRunning) {
			
			System.out.printf("isRunning is: %s", this.isRunning);
			
			this.OnInput();
			
			this.Controller();
			
		}
		
	};
	private void OnInput() {
		System.out.println("EntityList now taking input");
		this.input = this.inputObj.nextLine();
	};
	private void OnRender() { 
		System.out.println("EntityList reporting from OnRender()");
	};
	private void Controller() { // implementations
		switch(this.input) { // Task check input
			case "/select": // Task check for "/select" // Only for EntityList
				System.out.printf("Enter an elemnt index between 0 and %s", this.listSize); //Task prompt for index
				int tempIndex = inputObj.nextInt(); // Task take a int
				tempIndex--; // make input into an index
				if(tempIndex >= 0 && tempIndex < this.listSize) { // Task check index against list size
					this.listCurrsor = tempIndex; // Task put index from input into currsor // where is currsor
				}
			case "/exit": // Task check for "/exit" // In all implementations
				System.out.println("Do you want to exit EntityList? enter (y) to confirm"); //Task prompt for conformation "y"
				this.OnInput(); // Task check input for conformation
				System.out.printf("input after conformation is: %s", this.input);
				if(this.input.equals("y")) {
					System.out.println("Exit confirmed. Setting loop control variable");
					this.isRunning = false; //Task set Loop Controll to false
				}
		}
	}
}