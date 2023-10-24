public class EntityList extends Common_Executable {
	// Constructs
	public EntityList() { 
	
		System.out.println("Constructing an EntityList");	
		this.listSize = 2;
		this.myExecutables = new Executable[2]; // Create an array of interfaces which has 1 element
		this.myExecutables[0] = new EntityA(); // Create a implementation of the interface using EnityA in array element 1
		this.myExecutables[1] = new EntityB(); // Create a implementation of the interface using EnityB in array element 2
	}
	// Facilities
	//private String input = "empty";
	private int listSize = 0;
	private int listCurrsor = -1;
	//private boolean isRunning = false;
	private Executable myExecutables[];
	// Utilitites
	public void OnExecute() {
		
		super.isRunning = true;
		
		System.out.println("EntityList now executing");
		
		while(super.isRunning) {
			
			if(this.listCurrsor >= 0) {
				// run list element here
				this.myExecutables[listCurrsor].OnExecute();
				System.out.printf("Exited myExecutable list running in EnityList is: %s%n", super.isRunning);
				this.listCurrsor = -1;
				
			} else {
			
				this.OnInput();
			
				this.Controller();
			
			}
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

		System.out.println("EntityList now taking input");
		super.OnInput();
	
	};
	protected void OnRender() { 
	
		System.out.println("EntityList reporting from OnRender()");
	
	};
	@Override
	protected void Controller() { // implementations
		
		super.Controller();
		
		switch(super.input) { // Task check input
			case "/select": // Task check for "/select" // Only for EntityList
				this.Select();
				break;
		}
	
	};
	@Override
	protected void OnExit() {

		System.out.println("In EnitityList OnExit()");
		super.OnExit();

	};
	private void Select() {
		
		System.out.printf("Enter an elemnt index between 1 and %s%n", this.listSize); //Task prompt for index
		int tempIndex = super.inputObj.nextInt(); // Task take a int
		tempIndex--; // make input into an index
		if(tempIndex >= 0 && tempIndex < this.listSize) { // Task check index against list size
			this.listCurrsor = tempIndex; // Task put index from input into currsor // where is currsor
		} else {
			System.out.println("EntityList index out of bound");
		}
		
	};
}