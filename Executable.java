import java.util.Scanner;  // Import the Scanner class

public interface Executable {
	public static final Scanner inputObj = new Scanner(System.in);  // Create a Scanner object
	public abstract void OnExecute();
}