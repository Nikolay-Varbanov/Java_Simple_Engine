class TestApp {
	public static void main(String[] args) {
		System.out.println("Hey I'm Working here");
	
		Executable myEnnityA = new EntityA();
		
		myEnnityA.OnExecute();
		
		Executable myEnnityB = new EntityB();
		
		myEnnityB.OnExecute();
		
		Executable myEntityList = new EntityList();
	
	}
}