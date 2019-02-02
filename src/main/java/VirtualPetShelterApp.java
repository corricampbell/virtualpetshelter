import java.util.Scanner;


public class VirtualPetShelterApp {
	
	private static int petValues = Constants.DEFAULT_ATTRIBUTE_VALUE;
	private Scanner input = new Scanner(System.in);
	private static VirtualPetShelter shelter = new VirtualPetShelter();
	
	public static void main(String[] args)
	{
	 
		shelter.intake(new Dog("Lulu", petValues, petValues, petValues));
		new VirtualPetShelterApp().execute();	
	}
	
	private void execute()
	{
		 
		System.out.println("What would you like to do?" + 
						"\n1. Feed pets" +
						"\n2. Water the pets" +
						"\n3. Add a pet" +
						"\n0. Quit");
		int clientResponseIndex = input.nextInt();
		switch(clientResponseIndex)
		{
		case 1:
			shelter.feedPets();
			System.out.println("Pets fed! Hunger levels reduced by 2.");
			shelter.printShelter();
			execute();	 
			break;
		case 2:
			shelter.givePetsWater();
			System.out.println("Pets fed! Thirst levels reduced by 2.");
			shelter.printShelter();
			execute();
			break;
		case 3:
			System.out.println("Intake not set up yet.");
			execute();
			break;
		case 0:
			System.out.println("Goodbye.");
			break;
		}
	}

}
