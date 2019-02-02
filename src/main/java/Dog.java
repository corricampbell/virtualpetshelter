
public class Dog extends VirtualPet{
	
	private String name;
	private int hunger, thirst, boredom;
	
	public Dog(String name, int hunger, int thirst, int boredom)
	{
		super(name, boredom, boredom, boredom);
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHunger() {
		return hunger;
	}


	public void setHunger(int hunger) {
		this.hunger = hunger;
	}


	public int getThirst() {
		return thirst;
	}


	public void setThirst(int thirst) {
		this.thirst = thirst;
	}


	public int getBoredom() {
		return boredom;
	}


	public void setBoredom(int boredom) {
		this.boredom = boredom;
	}


	@Override
	public void printStatus() {
		
		System.out.println(name + "'s status (out of 10): " + 
						"Hunger: " + hunger + " Thirst: " + 
						thirst + " Boredom: " + boredom);
	}

}
