import java.awt.List;

public class VirtualPetShelter{
	
	private int size = Constants.DEFAULT_SHELTER_SIZE_VALUE;
	private int timeCounter = 6;	//for time 0600 
	public VirtualPet[] residents = new VirtualPet[size];
	
	public VirtualPetShelter()
	{
		System.out.println("New Pet Shelter Created!");
	}
	
	public void intake(VirtualPet pet)
	{
		for(int index=0; index<residents.length; index++)
		{
			if(residents[index]==null)
			{
				residents[index] = pet;
				System.out.println(pet.getName() + " has been registered in the shelter!");
				break;
			}
			else
			{
				System.out.println("Shelter is full!");
			}
		}
	}
	
	//need to add adoption method
	
	public void feedPets()
	{
		for(int index=0; index<residents.length; index++)
		{
			if(residents[index]!=null)
			{
				residents[index].setHunger(residents[index].getHunger() - 2);
			}
		}
	}
	
	public void givePetsWater()
	{
		for(int index=0; index<residents.length; index++)
		{
			if(residents[index]!=null)
			{
				residents[index].setThirst(residents[index].getThirst() - 2);
			}
		}
	}
	
	public void entertainPets()
	{
		for(int index=0; index<residents.length; index++)
		{
			if(residents[index]==null)
			{
				residents[index].setBoredom(residents[index].getBoredom() - 2);
			}
		}
	}
	
	
	public void tick(VirtualPet[] residents)
	{
		System.out.println("Time advanced to " + timeCounter + ":00 hours");
		if(timeCounter <= 24)
		{
			for(int index=0; index<residents.length; index++)
			{
				if(residents[index] != null)
				residents[index].setBoredom(residents[index].getBoredom()+2);
				residents[index].setHunger(residents[index].getHunger()+2);
				residents[index].setThirst(residents[index].getThirst()+2);
			}
		}
	}
	
	public void printShelter()
	{
		for(int index=0; index<residents.length; index++)
		{
			if(residents[index] != null)
			{
				System.out.println(residents[index].getName() + 
								"'s status:\tBoredom: " + 
								residents[index].getBoredom() +
								"Hunger: " + 
								residents[index].getHunger() +
								"Thirst: " +
								residents[index].getThirst());
			}
		}
	}

}
