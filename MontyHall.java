import java.util.Scanner;
import java.util.Random;
public class MontyHall 
{

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		int rightDoor = rand.nextInt(3) + 1;
		System.out.println("Choose a door you want to pick: ");
		int door = keyboard.nextInt();
		System.out.println("The car was behind Door #" + rightDoor);
		System.out.println("You chose Door #" + door);
	}

}
